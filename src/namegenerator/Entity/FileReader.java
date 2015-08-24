/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namegenerator.Entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kasper
 */
public class FileReader {

    public static ArrayList<String> loadFirstName(String filename) {
        //filename = "firstName.txt";
        Scanner file_scanner = null;
        ArrayList<String> stringArray = new ArrayList<String>();

        try {
            file_scanner = new Scanner(new File(filename));  //Connection to the file using the Scanner object
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find the file to load from! Returning null.");
            ex.printStackTrace();
            return null;  //If something goes wrong the method returns null
        }

        while (file_scanner.hasNextLine()) {  //File found. Reading one line.             
            stringArray.add(file_scanner.nextLine());  //Reading in a single line and saving in the ArrayList
        }

        file_scanner.close();  //Closing the file
        return stringArray;    //returning the arraylist
    }

    public static ArrayList<String> loadLastName(String filename) {
        //filename = "firstName.txt";
        Scanner file_scanner = null;
        ArrayList<String> stringArray = new ArrayList<String>();

        try {
            file_scanner = new Scanner(new File(filename));  //Connection to the file using the Scanner object
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find the file to load from! Returning null.");
            ex.printStackTrace();
            return null;  //If something goes wrong the method returns null
        }

        while (file_scanner.hasNextLine()) {  //File found. Reading one line.             
            stringArray.add(file_scanner.nextLine());  //Reading in a single line and saving in the ArrayList
        }

        file_scanner.close();  //Closing the file
        return stringArray;    //returning the arraylist
    }

}//END CLASS
