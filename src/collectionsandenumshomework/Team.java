/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandenumshomework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelvi
 */
public class Team {
    String name;
   
    List <Person> members = new ArrayList<>();
    
    public Team (String name) {
        this.name =name;
    }
    public void addMember (Person person){
        members.add(person);
    }
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Team: ").append(name).append("\n");
        for(Person member: members){
            sb.append(" ").append(member).append("\n");
        }
        return sb.toString();
    }
    
}
