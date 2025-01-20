import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;


public class musicPlayerGUI extends JFrame 
{
    //color configurations
    public static final Color FRAME_COLOR=Color.BLACK;
    public static final Color TEXT_COLOR=Color.WHITE;

    private MusicPlayer musicPlayer;

    //allow us to use file explorer in our app
    private JFileChooser jfileChooser;

    private JLabel songTitle, songArtist;
    private JPanel playbackButtons;
    private JSlider playbackSlider;

    public musicPlayerGUI()
    {
        super("Music Player");
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        //SET LAYOUT TO NULL WHICH ALLOWS US TO CONTROL THE (X,Y) COORDINATES OF OUR COMPONENTS AND ALSO SET THE HEIGHT AND WIDTH
        setLayout(null);
        getContentPane().setBackground(FRAME_COLOR);

        musicPlayer = new MusicPlayer(this);
        jfileChooser=new JFileChooser();

        //set a default path for file explorer
        jfileChooser.setCurrentDirectory(new File("E:\\java projects\\musicplayer\\musicplayer\\src\\assets"));

        //filter file chooser to only see .mp3 files
         jfileChooser.setFileFilter(new FileNameExtensionFilter("MP3", "mp3"));

        //call
        addGuiComponents();
    }
    
    private void addGuiComponents()
    {
        //call
        addToolbar();

        //load record image
        JLabel songImage=new JLabel(loadImage("E:\\java projects\\musicplayer\\musicplayer\\src\\assets\\record.png"));
        songImage.setBounds(0,50,getWidth()-20,225);
        add(songImage);

        //song title
        songTitle = new JLabel("Song Title");
        songTitle.setBounds(0,285,getWidth()-10,30);
        songTitle.setFont(new Font("Dialog", Font.PLAIN, 24));
        songTitle.setForeground(TEXT_COLOR);
        songTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(songTitle);

        //song artist
        songArtist=new JLabel("Artist");
        songArtist.setBounds(0,315,getWidth()-10,30);
        songArtist.setFont(new Font("Dialog", Font.BOLD, 24));
        songArtist.setForeground(TEXT_COLOR);
        songArtist.setHorizontalAlignment(SwingConstants.CENTER);
        add(songArtist);

        //playback slider
        playbackSlider=new JSlider(JSlider.HORIZONTAL,0,100,0);
        playbackSlider.setBounds(getWidth()/2 - 300/2, 365, 300, 40);
        playbackSlider.setBackground(null);
        playbackSlider.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e)
            {
                //when the user is holding the tick we want to pause the song
                musicPlayer.pauseSong();
            }
            @Override
            public void mouseReleased(MouseEvent e)
            {
                //when the user drops the tick
                JSlider source = (JSlider) e.getSource();

                //get the frame value from where the user wants to playback to
                int frame = source.getValue();

                //update the current frame in the music player to this frame
                musicPlayer.setCurrenFrame(frame);

                //update current time in milli as well
                musicPlayer.setCurrentTimeInMilli((int) (frame / (2.08 * musicPlayer.getCurrentSong().getFrameRatePerMillisecond())));

                //resume the song
                musicPlayer.playCurrentSong();

                //taggle on pause button and taggle off play button
                enablePauseButtonDisablePlayButton();
            }
        });
        add(playbackSlider);

        //playback buttons
        addplaybackButtons();
    }

    private void addToolbar()
    {
        JToolBar toolBar= new JToolBar();
        toolBar.setBounds(0,0,getWidth(),20);
        toolBar.setFloatable(false);
        add(toolBar);

        JMenuBar menuBar = new JMenuBar();
        toolBar.add(menuBar);

        JMenu songJMenu = new JMenu("song");
        menuBar.add(songJMenu);

        JMenuItem loadsong = new JMenuItem("load song");
        loadsong.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                //an integer is returned to us to let us know what the user did
                // برای باز کردن پوشه حاوی فایل های موزیک
                int result = jfileChooser.showOpenDialog(musicPlayerGUI.this);
                File selectedFile=jfileChooser.getSelectedFile();


                //this means that we are also checking to see if the user pressed the "open" button
                if (result==jfileChooser.APPROVE_OPTION && selectedFile != null)
                {
                    //create a song object based on selected file
                    //هدف نمایش اسم خواننده ، اسم آهنگ و مدت زمان آهنگ بود
                    Song song=new Song(selectedFile.getPath());

                    //load song in music player
                    //هدف پلی شدن و خوندن آهنگ بود
                    musicPlayer.loadsong(song);

                    //update song title and artist
                    updateSongTitleAndArtist(song);

                    //update playback slider
                    updatePlaybackSlider(song);

                    //taggle on pause button and taggle off play button
                    enablePauseButtonDisablePlayButton();
                    
                }
            }
        });
        songJMenu.add(loadsong);

        JMenu playlistMenu = new JMenu("playlist");
        menuBar.add(playlistMenu);

        JMenuItem createPlaylist = new JMenuItem("Create Playlist");
        createPlaylist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //load music playlist dialog
                new MusicPlaylistDialog(musicPlayerGUI.this).setVisible(true);
            }
        });
        playlistMenu.add(createPlaylist);

        JMenuItem loadPlaylist = new JMenuItem("load Playlist");
        loadPlaylist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e )
            {
                JFileChooser jfilechooser = new JFileChooser();
                jfilechooser.setFileFilter(new FileNameExtensionFilter("PlayList", "txt"));
                jfilechooser.setCurrentDirectory(new File("E:\\java projects\\musicplayer\\musicplayer\\src\\assets"));

                int result = jfilechooser.showOpenDialog(musicPlayerGUI.this);
                File selectedFile = jfilechooser.getSelectedFile();

                if (result == jfilechooser.APPROVE_OPTION && selectedFile!=null)
                {
                    //stop the music
                    musicPlayer.stopSong();

                    //load playlist
                    musicPlayer.loadPlaylist(selectedFile);
                }
            }
        });
        playlistMenu.add(loadPlaylist);

    }
    
    private void addplaybackButtons()
    {
        playbackButtons = new JPanel();
        playbackButtons.setBounds(0, 435, getWidth()-10, 80);
        playbackButtons.setBackground(null);

        //previos button //0
        JButton prevButton=new JButton(loadImage("E:\\java projects\\musicplayer\\musicplayer\\src\\assets\\previous.png"));
        prevButton.setBorderPainted(false);
        prevButton.setBackground(null);
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //go to the previous song
                musicPlayer.prevSong();
            }
        });
        playbackButtons.add(prevButton);

        //play button //1
        JButton playButton=new JButton(loadImage("E:\\java projects\\musicplayer\\musicplayer\\src\\assets\\play.png"));
        playButton.setBorderPainted(false);
        playButton.setBackground(null);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //taggle off play button and taggle on pause button
                enablePauseButtonDisablePlayButton();

                //play or resume song
                musicPlayer.playCurrentSong();
            }
        });
        playbackButtons.add(playButton);

        //pause button //2
        JButton pauseButton=new JButton(loadImage("E:\\java projects\\musicplayer\\musicplayer\\src\\assets\\pause.png"));
        pauseButton.setBorderPainted(false);
        pauseButton.setBackground(null);
        pauseButton.setVisible(false);
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //taggle off pause button and taggle on play button
                enablePlayButtonDisablePAuseButton();

                //pause the song
                musicPlayer.pauseSong();
            }
        });
        playbackButtons.add(pauseButton);

        //next button  //3
        JButton nextButton=new JButton(loadImage("E:\\java projects\\musicplayer\\musicplayer\\src\\assets\\next.png"));
        nextButton.setBorderPainted(false);
        nextButton.setBackground(null);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //go to the next song
                musicPlayer.nextSong();
            }
        });
        playbackButtons.add(nextButton);  
           

        add(playbackButtons);
    }
    
    //this will be used to update our slider drom the music player class
    public void setPlaybackSliderValue(int frame)
    {
        playbackSlider.setValue(frame);   
    }

    public void updateSongTitleAndArtist(Song song)
    {
        songTitle.setText(song.getSongTitle());
        songArtist.setText(song.getSongArtist());
    }

    public void updatePlaybackSlider(Song song)
    {
        //update max count for slider
        playbackSlider.setMaximum(song.getMp3File().getFrameCount());

        //create the song length label
        Hashtable<Integer , JLabel> labelTable = new Hashtable<>();

        //beginning will be 00:00
        JLabel labelBeginning = new JLabel("00:00");
        labelBeginning.setFont(new Font("Dialog", Font.BOLD, 18));
        labelBeginning.setForeground(TEXT_COLOR);

        //end will vary depending on the song
        JLabel labelEnd=new JLabel(song.getSongLength());
        labelEnd.setFont(new Font("Dialog", Font.BOLD, 18));
        labelEnd.setForeground(TEXT_COLOR);

        labelTable.put(0, labelBeginning);
        labelTable.put(song.getMp3File().getFrameCount(), labelEnd);

        playbackSlider.setLabelTable(labelTable);
        playbackSlider.setPaintLabels(true);
    }

    public void enablePauseButtonDisablePlayButton()
    {
        //retrieve reference to play button from playbackButtons panel
        JButton playButton= (JButton) playbackButtons.getComponent(1);
        JButton pauseButton= (JButton) playbackButtons.getComponent(2);

        //turn off play button
        playButton.setVisible(false);
        playButton.setEnabled(false);

        //turn on pause button
        pauseButton.setVisible(true);
        pauseButton.setEnabled(true);
    }

    public void enablePlayButtonDisablePAuseButton()
    {
        //retrieve reference to play button from playbackButtons panel
        JButton playButton= (JButton) playbackButtons.getComponent(1);
        JButton pauseButton= (JButton) playbackButtons.getComponent(2);

        //turn on play button
        playButton.setVisible(true);
        playButton.setEnabled(true);

        //turn off pause button
        pauseButton.setVisible(false);
        pauseButton.setEnabled(false);
    }

    private ImageIcon loadImage(String imagePath)
    {
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            return new ImageIcon(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
                
        //couldn't find resource
        return null;
    }

}
