/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsandenumshomework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author kelvi
 */
public class CollectionsAndEnumsHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String fileName ="MOCK_DATA.csv";
        List<Person> people =readDataFromFile (fileName);
        List<Team> teams= createTeams(people);
        
        for (Team team : teams){
            System.out.println(team);
        }
    }
    private static List<Person> readDataFromFile(String filename){
        List<Person> people =new ArrayList();
        try(BufferedReader br =new BufferedReader (new FileReader("MOCK_DATA.csv"))){
            String line;
            while ((line =br.readLine())!=null){
                String[] parts =line.split(",");
                if(parts.length == 4){
                    int id=Integer.parseInt(parts[0]);
                    String firstName = parts[1];
                    String lastName =parts[2];
                    String email =parts[3];
                    Person person = new Person (id, firstName, lastName, email);
                    people.add(person);
                }
            }
                
        }catch (IOException e){
                    e.printStackTrace();
                    }
        return people;
        }
    
private static List <Team> createTeams(List<Person> people) {
    Collections.shuffle(people, new Random(System.currentTimeMillis()));
    List<Team> teams = new ArrayList <>();
    String[] teamNames ={
        
     "Team Strawberry", "Team Pear", "Team Pineapple", "Team Cherry", "Team Banana",
    "Team Lemon", "Team Mango", "Team Blackberry", "Team Pomegranate", "Team Apple",
    "Team Kiwi", "Team Passion Fruit", "Team Melon", "Team Raspberry", "Team Watermelon",
    "Team Coconut", "Team Orange", "Team Grape", "Team Lime", "Team Peach"
    };
    int teamIndex =0;
    for(int i=0;i<20;i++){
        Team team = new Team(teamNames[teamIndex]);
        for (int j=0;j<5;j++){
            team.addMember(people.remove(0));
            
        }
        teams.add(team);
        teamIndex++;
    }
    return teams;
}
}
    

