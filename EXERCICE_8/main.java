public class main {
    public static void main(String []args){
        Playlist p = new Playlist("My Music");
        p.addTrack("Song 1");
        p.addTrack("Song 2");
        p.addTrack("Song 3");
        p.addTrack("Song 4");

        System.out.println(p.toString());
    }
}
