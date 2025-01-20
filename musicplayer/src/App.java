import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) 
    {
        //I USE THE INVOKELATER METHOD TO ENSURE THAT OUR GUI IS EXECUTED ON THE event-dispatch thread (EDT)
        //WHICH HELPS DEAL WITH POTENTIAL THREADING ISSUES LIKE WHNE WE'RE UPDATING THE GUI
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new musicPlayerGUI().setVisible(true);

                // Song song=new Song("E:\\java projects\\musicplayer\\musicplayer\\src\\assets\\Auld Lang Syne (Instrumental) - Jingle Punks.mp3");
                // System.out.println(song.getSongTitle());
                // System.out.println(song.getSongArtist());
            }
            
        });
        
    }
}
