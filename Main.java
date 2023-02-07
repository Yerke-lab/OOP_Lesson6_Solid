package OOP_Lesson6_Solid;

public class Main {
    public static void main(String[] args){
		User user = new User("Alex");
		Controller controller = new Controller(user);
		controller.start();		
	}
}
