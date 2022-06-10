public class Zipcode {
    public String findUrl(int inputZipcode){ // Method called find URL, with a return type String. Lastly, input called inputZipcode with a data type int.
        String s = Integer.toString(inputZipcode); // convert integer to a string by using the toString method.
        String outPut = "http://api.zippopotam.us/us/" + s;
        return outPut;


    }
    public static void main(String[] argv) {
        // Test 1
        ServiceCommunicator sc = new ServiceCommunicator();
        Zipcode zc = new Zipcode();
        sc.setURL(zc.findUrl(11234));
        sc.connect();
        String mystring = sc.get();
        System.out.println(mystring);

        // Test 2
        sc =  new ServiceCommunicator();
        zc = new Zipcode();
        System.out.println(sc.getResults(zc.findUrl(11236)));
    }
}
