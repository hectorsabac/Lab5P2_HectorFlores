/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_hectorflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public abstract class SocialClass {
    ArrayList <String> friends;
    ArrayList <String> posts;
    String username;

    public SocialClass(String username) {
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.username = username;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public boolean addFriend(String user){
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).equalsIgnoreCase(user)){
                return false;
            } else if (user.equalsIgnoreCase(username)){
                return false;
            }
        }
        
        friends.add(user);
        return true;
    }
    
    public void addPost(String msg){
        posts.add(msg);
    }
    
    public abstract void timeline();
    
    public void myProfile(){
        JOptionPane.showMessageDialog(null, "Nombre de usuario: " + username);
        timeline();
        JOptionPane.showMessageDialog(null, "Amigos de " + username + ":\n" + mostrarAmigos());
    }
    
    public String mostrarAmigos(){
        String accum = "";
        
        for (int i = 0; i < friends.size(); i++) {
            if ((i + 1) % 10 != 0){
                accum += friends.get(i);
            } else {
                accum += "\n" + friends.get(i);
            }
        }
        
        return accum;
    }
}
