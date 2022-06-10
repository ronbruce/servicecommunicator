public class Television {
    public String findtvShow(String inputtelevsion){
        String outPut = "http://api.tvmaze.com/singlesearch/shows?q=" + inputtelevsion;
        return outPut;

    }

    public static void main(String[] argv) {
        // Test 1
        ServiceCommunicator sc = new ServiceCommunicator();
        Television tv = new Television();
        System.out.println(sc.getResults(tv.findtvShow("Final+Fantasy")));


    }
  //  http://api.tvmaze.com/singlesearch/shows?q=SEARCH

}
