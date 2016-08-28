/*
 * Deborah Lewis
 * Beginner program to experiment with reading & delimiting files
 */
package readingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class ReadingDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("people.txt"); //open file
        FileReader reader = new FileReader(f); //create reader to read file
        BufferedReader breader = new BufferedReader(reader); //read more than one character at a time
        
        String line = breader.readLine(); //read line from file
        while (line != null) { //while lines still exits
            parseLine(line); //print the line
            line = breader.readLine(); //read the next line
        }
    }
    
    private static void parseLine(String line) {
        int repId;
        String fName;
        String lName;
        double supplies;
        double books;
        double paper;
        String district;
        String contact;
        
        //will be unused
        String sup;
        String boo;
        String pap;
        
        StringTokenizer st = new StringTokenizer(line, " ");
        
        System.out.println("Number of tokens " + st.countTokens());
        repId = Integer.parseInt(st.nextToken());
        fName = st.nextToken();
        lName = st.nextToken();
        sup = st.nextToken();
        supplies = Double.parseDouble(st.nextToken());
        boo = st.nextToken();
        books = Double.parseDouble(st.nextToken());
        pap = st.nextToken();
        paper = Double.parseDouble(st.nextToken());
        district = st.nextToken();
        contact = st.nextToken();
        
        //validation
        if (Integer.toString(repId).length() == 0) { //if the length of the repId converted to a string is 0
        
        }

        if (fName.length() == 0) {
            
        }
        
        if (lName.length() == 0) {
            
        }
        
        Person p = new Person();
        p.setRepId(repId);
        p.setFirstName(fName);
        p.setLastName(lName);
        p.setSupplies(supplies);
        p.setBooks(books);
        p.setPaper(paper);
        p.setDistrict(district);
        p.setContact(contact);
        
        
        //testing
        System.out.println("repId: " + repId + 
                "\nfName: " + fName + 
                "\nlName: " + lName + 
                "\nsupplies: " + supplies +
                "\nbooks: " + books +
                "\npaper: " + paper + 
                "\ndistrict: " + district + 
                "\ncontact: " + contact);
    }
    
    
    
}
