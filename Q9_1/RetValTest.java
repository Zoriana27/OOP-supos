package Q9_1;


import java.util.NoSuchElementException;

public class RetValTest {
    public static String sEmail = " " ;
    public static void extractCamEmail (String sentence) throws NoCamEmailFoundException {
        if ( sentence == null || sentence.length () == 0)
            throw new IllegalArgumentException("Input sentence cannot be null or empty."); // Error sentence empty
        String tokens [] = sentence.split ( " " ) ; // split into tokens
        for ( int i = 0; i < tokens.length; i++) {
            if ( tokens[i].endsWith ( " @cam.ac.uk " ) ) {
                sEmail = tokens [i];
                return;

            }
        }
        throw new NoCamEmailFoundException("No cam email was found");


    }
    public static void main ( String [] args ) {

        try{
            RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk " ) ;
            System.out.println ( "Email address: " + RetValTest.sEmail ) ;
        }
        catch(IllegalArgumentException e) {
            System.out.println ( "The input was null or empty." ) ;
        }
        catch(NoCamEmailFoundException e) {
            System.out.println ( "No cam email was found." ) ;
        }
    }
}
