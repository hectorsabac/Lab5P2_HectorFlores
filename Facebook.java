package examen1p2_hectorflores;
import java.util.ArrayList;


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
            System.out.println("PostID invalido");
            return false;
        }

    }
    
    public void timeline() {
        for (int i = 0; i < posts.size(); i++) {
            System.out.println("POST " + (i + 1));
            System.out.println(posts.get(i));

        for (Comment comment : comentarios) {
            if (comment.getPostId() == i) {
                System.out.println(comment);
            }
        }
    }
}
   
      
    }

    

