package examen1p2_hectorflores;

import javax.swing.JOptionPane;
public class Twitter extends SocialClass{
    
    public Twitter(String username){
        super(username);
    }
    
    @Override
    public void timeline(){
        for(String post: posts){
            System.out.println(post);   
            JOptionPane.showMessageDialog(null,"Posts \n"
                    + "\n"+ post);
        }
    }
    
}
