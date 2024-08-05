/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Comentarios.Coments;
import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Project {
    private int id;
    private String name;
    private ArrayList<Coments> ListTasks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Project(ArrayList<Coments> ListTasks) {
        this.ListTasks = ListTasks;
    }

   
   public void AddTask(){
   
   
   } 

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.ListTasks = ListTasks;
    }

    public Project() {
        
    }
    
    
   
   
    
}
