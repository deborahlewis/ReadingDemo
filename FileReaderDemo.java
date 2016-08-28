/*
 * Deborah Lewis
 * Beginner project to learn about reading files
 */
package filereaderdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("people.txt"); //open file
        FileReader reader = new FileReader(f); //read the file one character at a time
        BufferedReader breader = new BufferedReader(reader); //buffered reader reads full line of text
        
        String line = breader.readLine(); //push line of text to a string
        while (line != null) { //if no new line of text exists
            System.out.println(line); //print line of text
            line = breader.readLine(); //read next line
        }
        
    } //end main
    
} //end class
