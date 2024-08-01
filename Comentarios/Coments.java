/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comentarios;

import Users.User;

/**
 *
 * @author munoz
 */
public class Coments {
    private int id;
    private User User;
    private String Coment;

    public int getId() {
        return id;
    }

    public User getUser() {
        return User;
    }

    public String getComent() {
        return Coment;
    }

    public void setComent(String Coment) {
        this.Coment = Coment;
    }

    public Coments(int id, User User, String Coment) {
        this.id = id;
        this.User = User;
        this.Coment = Coment;
    }

    public Coments() {
    }
    
}
