/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc.pkg422.assignment.pkg1.part.pkg2; // This is our csc 422 package for Assignment 1

/**
 *
  
 * CSC 422 - Assignment 1 Part 2
 * 
 * By: Abdullahi Mohamed
 * 
 * Instructor: Professor Susan Furtney
 * 
 * Created: 11/1/2022
 * 
 * Updated: 11/4/2022
 * 
 */

// This is our Pet class for our Assignment Part 2
public class Pet {
    
    
// This is our attributes which name and age which are set to private
private String name;

private int age;

// This is our Pet constructor which holds the name as a a String and age as an int
Pet(String name, int age) {

    this.name = name;

    this.age = age;
}

// This is our setters which are setName and setAge.

public void setName(String name) {

    this.name = name; // sets to current name
}

public void setAge(int age) {

    this.age = age; // sets to the current age
}

// This is our getters for getName and getAge/
public String getName() {

    return this.name; // returns the name
}

public int getAge() {

    return this.age; // returns the age
}
    
}
