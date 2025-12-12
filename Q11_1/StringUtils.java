package Q11_1;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static void main ( String [] args ) {

        List<String> words = List.of( "Apple", "Cherry" );
        // 1. Print each word
        //words.forEach ( s -> System.out.println ( s ) );
        words.forEach(System.out::println);


        // 2. Get list of lengths
        //List < Integer > lengths = words.stream().map( s -> s.length()).toList ();
        List<Integer> lengths = words.stream().map(String::length).toList();



        // 3. Create new String objects
        //List<String> copies = words.stream().map ( s -> new String(s)).toList();
        List<String> copies = words.stream().map(String::new).toList();


    }
}
