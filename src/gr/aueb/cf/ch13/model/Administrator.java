package gr.aueb.cf.ch13.model;

/**
 * @author Ntirintis John
 */
public class Administrator {
    private User user;

    public Administrator() {}

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
}
