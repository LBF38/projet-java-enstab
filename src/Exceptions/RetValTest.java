package Exceptions;

public class RetValTest {
    public static String sEmail = "";

    public static int extractCamEmail(String sentence) {
        if (sentence == null || sentence.length() == 0)
            return -1;
        // Error - sentence empty
        String tokens[] = sentence.split(" ");
        // split into tokens
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].endsWith("@cam.ac.uk")) {
                sEmail = tokens[i];
                return 0; // success
            }
        }
        return -2; // Error - no cam email found
    }

    public static void main(String[] args) {
        int ret = RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
        if (ret == 0)
            System.out.println("Success: " + RetValTest.sEmail);
        else if (ret == -1)
            System.out.println("Supplied string empty");
        else
            System.out.println("No @cam address in supplied string");
    }
}
