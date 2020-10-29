package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> s= new ArrayList<>();
        s.add("s fsf ");
        s.add("dadadad");
        s.stream().forEach(System.out::println);
        System.out.println( "Hello World!" );
    }
}
