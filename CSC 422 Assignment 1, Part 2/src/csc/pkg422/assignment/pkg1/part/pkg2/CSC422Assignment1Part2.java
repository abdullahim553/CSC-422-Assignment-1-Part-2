/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csc.pkg422.assignment.pkg1.part.pkg2;// This is our csc 422 package for Assignment 1

import java.io.FileWriter; // Importing FileWriter class

import java.io.IOException; // Importing IOException class

import java.util.Scanner; // Importing the scanner class

/**
 *
 *
 * CSC 422 - Assignment 1 Part 2 
 *
 * Were building upon this assignment to include the features that are described
 * in Assignment 2 Part 2
 *
 * By: Abdullahi Mohamed
 *
 * Instructor: Professor Susan Furtney
 *
 * Created: 11/1/2022
 *
 * Updated: 11/5/2022
 *
 * Updated Again: 11/13/2022
 */
// This is our CSC 422 Assingment1 Part 2 class which is our main class which runs the program
public class CSC422Assignment1Part2 {

    public static int petCount = 0; // This is our petCount variable which is set to 0 and set to public static int

    public static Scanner s = new Scanner(System.in); // Creating a new scanner object which set to public static

    public static Pet[] pets = new Pet[5]; // Creating a new pets array which hold 5

    public static void addPets() {

//if (petCount < 5){
        int pCount = 0; // Creating a pCount variable which is set to 0

        String input = ""; // This is our input String which holds an empty String.

        // Using an if statement for petCount to check if its greater than or equal to 5 . This is part of Assignment 2 Part 2
        if (petCount >= 5) {

        }

// This is our while loop which takes the user input and will exit out only when user click done.
        while (true) {

            System.out.println("add pet (name, age):"); // Prompting user to add pet's name and age

            input = s.nextLine(); // Scans the nextline of the input

            // Using an if statement to chich the input equals to done
            if (input.equals("done")) {

                System.out.println(pCount + " pets added."); // prints out the pCount as well as the number of pets addded

                pCount = 0; // The pCount varaiable is set to 0

                break;
            }
            
            // Using an if statement to split the input and to test if the length is greater than 2 or to check if the length is less than 2
            
            // This is part of Assignment 2 part 2
            if (input.split(" ").length > 2 || input.split(" ").length < 2) {
                
                System.out.println("Error: " + input + " is not a valid input."); // Prints out Error plus the input is not a valid input. This is part of Assignment 2 Part 2
                
                continue;

            }

            // Using an if statement to check if petCount is greater than or equal to 5
            
            // This is part of Assignment 2 Part 2
            if (petCount >= 5) {

                System.out.println("Error: Database is full."); // Prints the an Erro Database is full. This is part of Assignment 2 Part 2

                break;

            }

            String name; // This is our name which is of String variable

            int i = 0; // This is our int i which is set to 0

// Using a while loop to check user input of the index
            while (input.charAt(i) != ' ') {

                i++;

            }

// This is our name which begins the input substring index from 0 and ends in i
            name = input.substring(0, i);

// This is our int age which we parse the integer and input substring
            int age = Integer.parseInt(input.substring(i + 1));

            // Using an if statement to check if the age is less than 1 or age is greather than 20
            
            // This is part of Assignment 2 Part 2
            
            if (age < 1 || age > 20) {

                System.out.println("Error: " + age + " is not a valid age."); // Prints the Erro plus the age is not a valid age

                continue;
            }

// Were creating a new pet object which holds the name and age.
            Pet p = new Pet(name, age);

            pets[petCount] = p; // The petCount array is equal to p
           
            petCount++; // Were incrementing the petCount

            pCount++; // Were incrementing the pCount


            saveAllData(); // calls the saveAllData method, which is part of Assignment 2 part 2
        }
    }

// Were traversing the array and print details of all the pets

// This is out displayAllPets method which we travese the array and the print the details of the pets
    public static void displayAllPets() {
        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

        System.out.printf("| %3s | %-10s | %4s |%n", "ID", "NAME", "AGE"); // Printing the ID, Name and Agae using the printf command

        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

// Using a for loop to iterate the petCount
        for (int i = 0; i < petCount; i++) {

            // Displays the printf wit the getName and getAge
            System.out.printf("| %3d | %-10s | %4d |%n", i, pets[i].getName(), pets[i].getAge());
        }

        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

        System.out.println(petCount + " rows in set "); // Printing the petCount and the numberrs of row in the set.

        System.out.println(); // Prints the line

    }

// This is our petUpdate method
    public static void petUpdate() {

// This prints all the pets for displayAllPets
        displayAllPets();

        System.out.println("Enter the pet ID you can to update: "); // Prompting user to enter the pet ID that they can update

// We take input ID which is an int and scans the next ind
        int ID = s.nextInt();

        s.nextLine(); // Scans the nextlint of the ID

        if (ID < 0 || ID > pets.length - 1) {
// print error message

            System.out.print("Error: ID ");

            System.out.print(ID);

            System.out.println(" does not exist.");
        } else {

            Pet p = pets[ID];

// Using a for loop to iterate through the ID and petCounts
            for (int i = ID; i < petCount; i++) {

                pets[i] = pets[i + 1]; // gets the pets array and adds one to it
            }

// Prints the the ID and as well as the getName and getAge and prints the the removed getName and getAge
            System.out.println(ID + " " + p.getName() + " " + p.getAge() + " is removed.");

// We update the pets array and petCount and set it to null
            pets[petCount] = null;

            petCount--;

        }

// Prompting  user to enter the new name and new age
        System.out.println("Enter new name and new age: ");

        String input = s.nextLine(); // Scans the next input as a String

        String name; // This is our name as a String

        int i = 0; // This is our int i which is equals to to 0

// Using a while loop to iterate the input
        while (input.charAt(i) != ' ') {

            i++; // increments the it

        }

// The name equals the input substring which begins the index at 0 and ends the index at i
        name = input.substring(0, i);

        int age = Integer.parseInt(input.substring(i + 1)); // This is our age which is an int and parses the input substring

        String oldName = pets[ID].getName(); // This is our string oldName which equals the pets ID and get the name

        int oldAge = pets[ID].getAge(); // this our oldAge which is and and gets the age

        pets[ID].setName(name); // This is our pets Id which set the name and get sht ename

        pets[ID].setAge(age); // This is our pets ID which sets the age and gets the age

// Displays the oldName plus the oldAge and changed to the name and age
        System.out.println(oldName + " " + oldAge + " changed to " + name + " " + age + ".");

    }

// This is our SearchNameByPet method
    public static void SearchNameByPet() {

        System.out.println("Enter a name to search: "); // Prompting the enter a name to search 

        String name = s.nextLine(); // This is our name as String which scans the nextline

        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

        System.out.printf("| %3s | %-10s | %4s |%n", "ID", "NAME", "AGE"); // Printing the ID, Name and Age using the printf command  

        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

        int numRowsInSet = 0; // This is our numRowsInSet which equals to 0

        // Using a for loop to iterate through the petCount
        for (int i = 0; i < petCount; i++) {

            // Gets the name and equals the ingores case of the name
            if (pets[i].getName().equalsIgnoreCase(name)) {

                // Prints the command of the getName and getAge
                System.out.printf("| %3d | %-10s | %4d |%n", i, pets[i].getName(), pets[i].getAge());

                numRowsInSet++; // Incrementing the numRowsInSet 

            }

        }

        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

        System.out.println(numRowsInSet + " rows in set."); // Printing the numRowsInSet and get the rows in set
    }

// This is our SearchAgeByPet method
    public static void SearchAgeByPet() {

        System.out.println("Enter age to search: "); // Prompting the enter age to search

        int age = s.nextInt(); // This is our age which set to int and scans int

        s.nextLine(); // Scans the nextline

        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

        System.out.printf("| %3s | %-10s | %4s |%n", "ID", "NAME", "AGE");  // Printing the ID, Name and Age using the printf command 

        System.out.printf("+-------------------------+%n"); // Printing the dashes using the printf command

        int numRowsInSet = 0; // Incrementing the numRowsInSet which set to int to 0

        // Using a for loop for petCount
        for (int i = 0; i < petCount; i++) {

            // Using an if statment to get the age.
            if (pets[i].getAge() == age) {

                // Printing the getName and getAge using the printf command
                System.out.printf("| %3d | %-10s | %4d |%n", i, pets[i].getName(), pets[i].getAge());

                numRowsInSet++; // Incrementing the numRowsInSet which set to int to 0

            }
        }

        // Printing the dashes using the printf command
        System.out.printf("+-------------------------+%n");

        // Printing the numRowsInSet and gets the number of rows in set.
        System.out.println(numRowsInSet + " rows in set.");
    }

    // This is our printHeader method
    public static void printHeader() {

        System.out.println("--------|ID|Name |Age|-------"); // Prints the header ID, Name and Age
    }

// This is our printFooter method
    public static void printFooter() {

        System.out.println("+----------------+" + petCount + " rows of data"); // Prints the dashes plus the petCount plus rows of data
    }

    // This is our petRemove method
    public static void petRemove() {

// This prints all the pets for displayAllPets
        displayAllPets();

// Prompting user to enter the pet ID to remove
        System.out.println("Enter the pet ID to remove: ");

// Scans the ID as an int
        int ID = s.nextInt();

        s.nextLine(); // Scans the nextLine

        // Using an if statement to check if the ID is less than 0 or ID is greather than petCount minus 1 which is part of assignment 2 part 2
        if (ID < 0 || ID > petCount - 1) {
// print error message
            System.out.print("Error: ID "); // Prints the the Error ID
            
            System.out.print(ID); // Prints the ID
            
            System.out.println(" does not exist."); // Prints the does not exist if the ID does not exist

            return;

        }

// Were saving the Pet p in a different variable for petID
        Pet p = pets[ID];

// Using a for loop to iterate through the ID and petCounts
        for (int i = ID; i < petCount - 1; i++) { //change the loop constraint to match this

            pets[i] = pets[i + 1]; // gets the pets array and adds one to it
        }
        pets[petCount - 1] = null; //this line holds the petCount minus 1 for pets which equals to null


// Prints the the ID and as well as the getName and getAge and prints the the removed getName and getAge
        System.out.println(ID + " " + p.getName() + " " + p.getAge() + " is removed.");


        petCount--; // We decrement the petCount
    }

    // This is our saveAllData method which is part of Assignment 2 Part 2
    public static void saveAllData() {

        try {
            // This is our FileWriter file variable which holds the fileName PetData.txt
            FileWriter file = new FileWriter("PetData.txt");

            // Using a for loop to iterate through the petCount
            for (int i = 0; i < petCount; i++) {
               
                // Writes to the file and gets the name and age
                file.write(String.format("%s %d\n", pets[i].getName(), pets[i].getAge()));
            }
            // We close the file
            file.close();
        } catch (IOException e) {
            // Prints an error message saying that data cannot be saved
            System.err.println("Can not save Data!");
            e.printStackTrace();
        }
    }

// This is our getUserChocice method, which i made updates to match sample output of for Assignment 2 part 2
    public static int getUserChoice() {

        System.out.println("What would you like to do?"); // Prompts the user on the option they would like to choose

        System.out.println("1) View all pets"); // Option 1 is to View all pets

        System.out.println("2) Add more pets"); // Option 2 to Add more pets

        System.out.println("3) Remove an existing pet"); // Option 3 is to Remove an exisitng pet

        System.out.println("4) Exit program"); // Optiopn 4 is to exit the program

        System.out.print("Your choice: "); // Prints the option the user chosed.

        int choice = s.nextInt(); // Scans the choice as an int

        s.nextLine(); // scans the nextLine

        return choice; // returns the choice of the user.
    }

// This is our main method
    public static void main(String[] args) {

        // Using a while loop to iterate through the users choice
        while (true) {

            int choice = getUserChoice(); // gets the choice the the user slecting

            // Using switch statment to iterate through the chocice
            
           // Made changes to match the choice sample for Assignment 2 Part 2
            switch (choice) {

                case 1: {
                    displayAllPets(); // This is for displayAllPets which is case 1
                    break;
                }

                case 2: {
                    addPets(); // This is for addPets which is case 2
                    break;
                }

                case 3: // 
                {
                    petRemove(); // This is for petRemove which is case 3
                    break;
                }

                case 4: {
                    System.out.println("Goodbye!"); // This is our case 4 which display Goodbye and exists the program
                    return;
                }

            }

        }

    }

}
