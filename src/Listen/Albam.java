package Listen;

import java.util.ArrayList;
import java.util.List;

public class Albam {

    private String albamName;
    private String artistName;

    //here Song act like a datatype
    private List<Song> songList;

    public Albam(String albamName, String artistName) {
        this.albamName = albamName;
        this.artistName = artistName;

        songList = new ArrayList<>();
    }
    public boolean findSong(String title){
        for (Song song: songList) {
           if( song.getSongTitle().equals(title))
            return true;
        }
        return false;
    }

    public String addNewSongToPlayList(String title, double duration){
        //Check if song id alredy present : return
        if(findSong(title)==false){
            Song newSong= new Song(title,duration);
            songList.add(newSong);
            return "Song hasa been added to playlist";
        }else {
            return "Song is alredy present";
        }
        //Create a new song with the give parameter
        //Add it into the playList
    }

    public void addsongToPlayList(int songNo, List<Song> playList){
        //Song No is a 1 based indexing
        //List Index is 0 based indexing

        int index = songNo-1;
        if(index<= songList.size()-1){
            Song song = songList.get(index);
            playList.add(song);
        }
    }
    public void addsongToPlayList(String title, List<Song>playList){
        //we will itterate the songList : albam list and check if the title is matching

        for (Song song: songList){
            if(song.getSongTitle().equals(title)){
                playList.add(song);
                return;
            }
        }
    }


}
