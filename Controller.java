package OOP_Lesson6_Solid;

public class Controller implements Savable, Reportable {
    private User user;
    
    public Controller(User user) {
        this.user = user;
    }
    public void start() {
        save(user);
        report(user);
        
    }@Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
       
    }
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
    
}
