/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package csc.pkg422.assignment.pkg1.part.pkg2;// This is our csc 422 package for Assignment 1

import java.util.Scanner; // Importing the scanner class

/**
 *
 * 
 * CSC 422 - Assignment 1 Part 2
 * 
 * By: Abdullahi Mohamed
 * 
 * Instructor: Professor Susan Furtney
 * 
 * Created: 11/1/2022
 * 
 * Updated: 11/5/2022
 */


// This is our CSC 422 Assingment1 Part 2 class which is our main class which runs the program
public class CSC422Assignment1Part2 {


public static int petCount = 0; // This is our petCount variable which is set to 0 and set to public static int

public static Scanner s = new Scanner(System.in); // Creating a new scanner object which set to public static

public static Pet[] pets = new Pet[100]; // Creating a new pets array which hold 100

// This is our addPets fnction which is set to public mode
public static void addPets() {

int pCount =0; // Creating a pCount variable which is set to 0

String input = ""; // This is our input String which holds an empty String.

// This is our while loop which takes the user input and will exit out only when user click dones.
while (true) {

    System.out.println("add pet (name, age):"); // Prompting user to add pet's name and age

    input = s.nextLine(); // Scans the nextline of the input

    // Using an if statement to chich the input equals to done
    if (input.equals("done")) {

    System.out.println(pCount + " pets added." ); // prints out the pCount as well as the number of pets addded 

    pCount=0; // The pCount varaiable is set to 0

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

// Were creating a new pet object which holds the name and age.
Pet p = new Pet(name, age);

pets[petCount] = p; // The petCount array is equal to p

petCount++; // Were incrementing the petCount

pCount++; // Were incrementing the pCount

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

// Prompting  user to enter the new name and new age
System.out.println("Enter new name and new age: ");

String input = s.nextLine(); // Scans the next input as a String

String name; // This is our name as a String

int i = 0; // This is our int i which is equals to to 0

// Using a while loop to iterate hte input
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

// Were saving the pet in a different variable for petID
Pet p = pets[ID];

// Using a for loop to iterate through the ID and petCounts
for (int i = ID; i < petCount; i++) {

    pets[i] = pets[i + 1]; // gets the pets array and adds one to it
}

// Prints the the ID and as well as the getName and getAge and prints the the removed getName and getAge
System.out.println( ID + " " + p.getName() + " " + p.getAge() + " is removed.");

// We update the pets array and petCount and set it to null
pets[petCount] = null;

petCount--;
}

// This is our getUserChocice method
public static int getUserChoice() {

    System.out.println("What would you like to do?"); // Prompts the user on the option they would like to choose

    System.out.println("1) View all pets"); // Option 1 is to view all pets

    System.out.println("2) Add more pets"); // Option 2 to add more pets

    System.out.println("3) Update an existing pet"); // Option 3 to update an exisitng pet

    System.out.println("4) Remove an existing pet"); // Option 4 is remove an exisitng

    System.out.println("5) Search pets by name"); // Option 5 is to search pets by name

    System.out.println("6) Search pets by age"); // Option 6 is to search pets by age

    System.out.println("7) Exit program"); // Optiopn 7 is to exit the program

    System.out.print("Your choice: "); // Prints the option the user chosed.

    int choice = s.nextInt(); // Scnas the choice as an int

    s.nextLine(); // scans the next lint

return choice; // returns the choice of the user.
}

// This is our main method
public static void main(String[] args) {

    // Using a while loop to iterate through the users chouche
while (true) {

    int choice = getUserChoice(); // gets the choice the the user slecting

    // Using switch statment to iterate through the chocice
    switch (choice) {

      case 1: {

      displayAllPets(); // This is for displayAllPets which is case 1

      break;
}

     case 2: {

     addPets(); // This is for addPets which is case 2

     break;
}

     case 3: {

    petUpdate(); // This is for petUpdate which is case 2

    break;
}

    case 4: {

    petRemove(); // This is for petRemove which is case 4

    break;
}

     case 5: {

    SearchNameByPet(); // This is for serachNameByPet which is case

    break;
}

    case 6: {

    SearchAgeByPet(); // This is for searchAgeByPet which is case 6

    break;
}

    case 7: {
    
        System.out.println("Goodbye!"); // This prints goodbye to user when there done and this for case 7

    return;

}

    }


}

}







}
