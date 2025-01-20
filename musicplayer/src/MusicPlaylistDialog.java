import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MusicPlaylistDialog extends JDialog
{
    private musicPlayerGUI musicPlayerGUI;

    //store all of the paths to be written to a txt file (when we load a playlist)
    private ArrayList<String> songPaths;

    public MusicPlaylistDialog(musicPlayerGUI musicPlayerGUI)
    {
        this.musicPlayerGUI = musicPlayerGUI;
        songPaths = new ArrayList<>();

        //configure dialog
        setTitle("create playlist");
        setSize(400 , 400);
        setResizable(false);
        getContentPane().setBackground(musicPlayerGUI.FRAME_COLOR);
        setLayout(null);
        setModal(true); //this property makes it so that the dialog has to be closed to give focus
        setLocationRelativeTo(musicPlayerGUI);

        addDialogComponents();
    }

    private void addDialogComponents()
    {
        //container to hold each  song path
        JPanel songContainer = new JPanel();
        songContainer.setLayout(new BoxLayout(songContainer, BoxLayout.Y_AXIS));
        songContainer.setBounds((int)(getWidth() * 0.025), 10, (int)(getWidth() * 0.90), (int)(getWidth() * 0.75));
        add(songContainer);

        //add song button
        JButton addSongButton = new JButton("Add");
        addSongButton.setBounds(60, (int)(getHeight()*0.80), 100, 25);
        addSongButton.setFont(new Font("Dialog", Font.BOLD, 14));
        addSongButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser jfilechooser = new JFileChooser();
                jfilechooser.setFileFilter(new FileNameExtensionFilter("MP3", "mp3"));
                jfilechooser.setCurrentDirectory(new File("E:\\java projects\\musicplayer\\musicplayer\\src\\assets"));
                int result = jfilechooser.showOpenDialog(MusicPlaylistDialog.this);

                File selectedFile = jfilechooser.getSelectedFile();
                if (result == jfilechooser.APPROVE_OPTION && selectedFile != null)
                {
                    JLabel filePathLabel = new JLabel(selectedFile.getPath());
                    filePathLabel.setFont(new Font("Dialog", Font.BOLD, 12));
                    filePathLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    
                    //add to the list
                    songPaths.add(filePathLabel.getText());

                    //add to container
                    songContainer.add(filePathLabel);

                    //refreshes dialog to show newly added JLabel
                    songContainer.revalidate();
                }
            }
        });
        add(addSongButton);

        //save playlist button
        JButton savePlaylistButton = new JButton("Save");
        savePlaylistButton.setBounds(215, (int)(getHeight()*0.80), 100, 25);
        savePlaylistButton.setFont(new Font("Dialog", Font.BOLD, 14));
        savePlaylistButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               try
               {
                JFileChooser jfileChooser = new JFileChooser();
                jfileChooser.setCurrentDirectory(new File("E:\\java projects\\musicplayer\\musicplayer\\src\\assets"));
                int result = jfileChooser.showSaveDialog(MusicPlaylistDialog.this);

                if (result ==jfileChooser.APPROVE_OPTION)
                {
                    //we use getSelectedFile() to get refrence to the file that we are about to save
                    File selectedFile = jfileChooser.getSelectedFile();

                    //conver to .txt file if not done so already
                    //this will check to see if the file doesnt have the ".txt" file extension
                    if (!selectedFile.getName().substring(selectedFile.getName().length() - 4).equalsIgnoreCase(".txt"))
                    {
                        selectedFile = new File(selectedFile.getAbsoluteFile() + ".txt");   
                    }
                    

                    //create the new file at the destinated directory
                    selectedFile.createNewFile();

                    //now wwe will write all of the song paths into this file
                    FileWriter fileWriter = new FileWriter(selectedFile);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                    //iterate through our song paths list and write each string into the file
                    //each song will be written in their own row
                    for(String songPath : songPaths)
                    {
                        bufferedWriter.write(songPath + "\n");
                    }
                    bufferedWriter.close();

                    //display success dialog
                    JOptionPane.showMessageDialog(MusicPlaylistDialog.this, "Seccessfully Created Playlist!");

                    //close this dialog
                    MusicPlaylistDialog.this.dispose();
                }
               }
               
               catch (Exception exception)
               {
                exception.printStackTrace();
               }
            }
        });
        add(savePlaylistButton);   
    }
}
