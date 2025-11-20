import java.util.ArrayList;
import java.util.List;

class Playlist {
    private String name;
    private List<String> tracks;

    Playlist(String N){
        this.name = N;
        tracks = new ArrayList<>();
    }

    void addTrack(String track){
        tracks.add(track);
    }
    
    public int size(){
        return tracks.size();
    }

    public List<String> getTracks(){
        return List.copyOf(tracks);
    }

    public String toString() {
        return "Playlist: " + name + " (" + size() + " tracks)";
    }
    
}
