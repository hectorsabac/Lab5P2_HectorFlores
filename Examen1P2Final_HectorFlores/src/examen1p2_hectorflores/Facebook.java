package examen1p2_hectorflores;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Facebook extends SocialClass implements Commentable {
    private ArrayList <Comment> comentarios;
    
    public Facebook(String username) {
        super(username);
        this.comentarios = new ArrayList<>();
    }
    
    @Override
    public boolean addComment(Comment comment) {
        int postID = comment.getPostId();

        if (postID >= 0 && postID < posts.size()) {
            comentarios.add(comment);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "PostID invalido");
            return false;
        }

    }
    
    @Override
    public void timeline() {
        for (int i = 0; i < posts.size(); i++) {
            
            JOptionPane.showMessageDialog(null,"POST " + (i + 1) + "\n" + posts.get(i));

            for (Comment comment : comentarios) {
                if (comment.getPostId() == i) {
                    comment.print();
                }
            }
        }
    }
}

    

