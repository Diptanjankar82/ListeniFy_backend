package Listen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Albam diljhit= new Albam("DosaCat" ,"Cat" );

        diljhit.addNewSongToPlayList("vibe",2.36);
        diljhit.addNewSongToPlayList("dj",4.56);

        Albam arjitSingh = new Albam("Arjit", "arjitsingh");

        arjitSingh.addNewSongToPlayList("kesariya",2.3);
        arjitSingh.addNewSongToPlayList("shyad", 4.34);
        arjitSingh.addNewSongToPlayList("dj wala nanu",7.89);



    }
}