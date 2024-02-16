package examen1p2_hectorflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UberSocial {

    private ArrayList<SocialClass> socialAccounts;

    public UberSocial() {
        socialAccounts = new ArrayList<>();
    }

    public SocialClass buscar(String username, int i) {
        if (i >= socialAccounts.size()) {
            return null;
        }
        if (username.equals(socialAccounts.get(i).getUsername())) {
            return socialAccounts.get(i);
        }
        return buscar(username, i + 1);
    }

    public void agregarCuenta(String username, String tipo) {
        if (!existeUsuario(username)) {
            if (tipo.equals("FACEBOOK")) {
                socialAccounts.add(new Facebook(username));
                JOptionPane.showMessageDialog(null, "Cuenta agregada!");
            } else if (tipo.equals("TWITTER")) {
                socialAccounts.add(new Twitter(username));
                JOptionPane.showMessageDialog(null, "Cuenta agregada!");
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de cuenta invalida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ese usuario ya existe");
        }
    }

    public boolean existeUsuario(String username) {
        for (SocialClass account : socialAccounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void agregarPost(String username, String post) {
        SocialClass cuentaUsuario = buscar(username, 0);
        if (cuentaUsuario != null) {
            cuentaUsuario.addPost(post);
            JOptionPane.showMessageDialog(null, "Post creado!");
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }

    public void agregarAmigo(String user1, String user2) {
        SocialClass cuentaUser1 = buscar(user1, 0);
        SocialClass cuentaUser2 = buscar(user2, 0);
        
        if (cuentaUser1 != null && cuentaUser2 != null && cuentaUser1.getClass() == cuentaUser2.getClass()) {
            if (cuentaUser1 instanceof Facebook && cuentaUser2 instanceof Facebook) {
                    Facebook fbCuentaUser1 = (Facebook) cuentaUser1;
                    Facebook fbCuentaUser2 = (Facebook) cuentaUser2;

                    fbCuentaUser1.addFriend(user2);
                    fbCuentaUser2.addFriend(user1);
                    JOptionPane.showMessageDialog(null, "Amigos agregados mutuamente");
            } else if (cuentaUser1 instanceof Twitter && cuentaUser2 instanceof Twitter){
                Twitter twCuentaUser1 = (Twitter) cuentaUser1;
                Twitter twCuentaUser2 = (Twitter) cuentaUser2;
                twCuentaUser1.addFriend(user2);
                JOptionPane.showMessageDialog(null, "Amigo agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Cuentas deben ser del mismo tipo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el amigo");
        }
    }

    public void agregarComment(String username, int postID, String autor, String comentario) {
        SocialClass cuentaUsuario = buscar(username, 0);
        if (cuentaUsuario != null && cuentaUsuario instanceof Facebook) {
            ((Facebook) cuentaUsuario).addComment(new Comment(postID, autor, comentario));
            JOptionPane.showMessageDialog(null, "Comentario agregado!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado o no es una cuenta de Facebook");
        }
    }

    public void profileFrom(String username) {
        SocialClass cuentaUsuario = buscar(username, 0);
            if (cuentaUsuario != null) {
                cuentaUsuario.myProfile();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }

}