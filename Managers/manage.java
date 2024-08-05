/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Managers;

import Projects.Project;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author Luisk
 */
public class manage {
    private ArrayList<User> users;
    private ArrayList<Project> projects;

    public manage() {
        this.users = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println("Id: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
        }
    }

    public void displayProjects() {
        for (Project project : projects) {
            System.out.println("ID: " + project.getId() + ", Name: " + project.getName());
        }
    }

    public static void main(String[] args) {
        manage manage = new manage();

        User user1 = new User("1", "Chiza", "chiza@25.com");
        User user2 = new User("2", "Felipe", "Felipe@213.com");

        Project project1 = new Project(1, "Project A");
        Project project2 = new Project(2, "Project B");

        manage.addUser(user1);
        manage.addUser(user2);
        manage.addProject(project1);
        manage.addProject(project2);

        manage.displayUsers();
        manage.displayProjects();
    }
}
