/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandenumshomework;

/**
 *
 * @author kelvi
 */
public class Person {
    
    int id;
    String firstName;
    String lastName;
    String email;
    
     public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
     }
     @Override
     public String toString(){
         return firstName +" "+ lastName + " (" + email +")";
     }
     }
    

