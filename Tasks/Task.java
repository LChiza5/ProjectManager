/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Users.User;
import java.util.ArrayList;
import javax.xml.stream.events.Comment;

/**
 *
 * @author Luisk
 */
public class Task {
    private int id;
    private String description;
    private boolean complete;
    private User user;
    private ArrayList <Comment> comment;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Task(int id, String description,User user) {
        this.id = id;
        this.description = description;
        this.complete = complete;
        this.user = user;
        this.comment = comment;
    }


    }
