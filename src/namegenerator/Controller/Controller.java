/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namegenerator.Controller;

import java.util.Random;
import namegenerator.Entity.FileReader;

/**
 *
 * @author kasper
 */
public class Controller implements namegenerator.Interfaces.ControllerIF {

    private FileReader reader;
    private Random random;

    public Controller() {

        reader = new namegenerator.Entity.FileReader();

    }

    @Override
    public String getFirstName(String name) {
        //Loads the textfile from root folder
        reader.loadFirstName("firstName.txt");

        //set up random int, which takes a random int based on the size of the textfile
        // and returns it
        Random random = new Random();
        int r = random.nextInt(reader.loadFirstName("firstName.txt").size());

        //Return the random firstName
        return (reader.loadFirstName("firstName.txt")).get(r).toString();
    }

    @Override
    public String getLastName(String name) {
        //Loads the textfile from root folder
        reader.loadFirstName("lastName.txt");

        //set up random int, which takes a random int based on the size of the textfile
        // and returns it
        Random random = new Random();
        int r = random.nextInt(reader.loadFirstName("lastName.txt").size());

        //Return the random lastName
        return (reader.loadLastName("lastName.txt")).get(r).toString();
    }

    @Override
    public String getFullName(String name) {
        //Creating variables to use in the method
        String fullname;
        String firstname;
        String lastname;

        //Determine variables to use the other methods
        firstname = getFirstName(name);
        lastname = getLastName(name);
        fullname = firstname + " " + lastname;

        //Returning the combined fullname
        return fullname;
    }
}
