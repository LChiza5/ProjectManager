/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Comentarios.Coments;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author munoz
 */
public class Project {
    private int id;
    private String name;
    private ArrayList<Coments> listTasks;
    private int completedTasks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Project(ArrayList<Coments> listTasks) {
        this.listTasks = listTasks;
        this.completedTasks = 0;
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.listTasks = new ArrayList<>();
        this.completedTasks = 0;
    }

    public Project() {
        this.listTasks = new ArrayList<>();
        this.completedTasks = 0;
    }

    public void addTask(Coments task) {
        listTasks.add(task);
    }

    public void markTaskAsCompleted() {
        if (completedTasks < listTasks.size()) {
            completedTasks++;
        }
    }

    public int getTotalTasks() {
        return listTasks.size();
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public double getCompletionPercentage() {
        if (listTasks.size() == 0) {
            return 0;
        }
        return (completedTasks / (double) listTasks.size()) * 100;
    }

    public static void main(String[] args) {
        Project project = new Project(1, "Project A");

        Coments task1 = new Coments(1, new User("1", "Chiza", "Chiza@25.com"), "Task 1");
        Coments task2 = new Coments(2, new User("2", "Felipe", "Felipe@213.com"), "Task 2");

        project.addTask(task1);
        project.addTask(task2);

        project.markTaskAsCompleted();

        System.out.println("Tareas totales: " + project.getTotalTasks());
        System.out.println("tareas completadas: " + project.getCompletedTasks());
        System.out.println("Porcentaje finalizado: " + project.getCompletionPercentage() + "%");
    }
}

