public class Music {
    public String findSong(String inPutSong){
        String outPut = "https://itunes.apple.com/search?term=" + inPutSong;
        return outPut;


    }
    public static void main(String[] argv){
        // Test 1
        ServiceCommunicator sc = new ServiceCommunicator();
        Music m = new Music();
        System.out.println(sc.getResults(m.findSong("Meant+to+live")));


    }
}
