import java.util.Arrays;
import java.util.ArrayList;
public class ProjectClassTest {
	public static void main (String[] args) {
		
		ProjectClass dragon = new ProjectClass("Dragons","Dragons wake up and begin to conquer the world!");
		dragon.setCost(50);
		
		ProjectClass pirate = new ProjectClass();
		pirate.setName("Pirates");
		pirate.setDescription("Modern day pirates go back in time after finding themselves lost in the Bermuda Triangle");
		pirate.setCost(35);
		
		ProjectClass zombie = new ProjectClass("Zombies");
		zombie.setName("Zombies");
		zombie.setCost(10);
		
		System.out.println(dragon.elevatorPitch());
		System.out.println(pirate.getName());
		System.out.println(pirate.getDescription());
		System.out.println(pirate.elevatorPitch());
		System.out.println(zombie.elevatorPitch());
		System.out.println(zombie.getCost());
		
        Portfolio portfolio = new Portfolio();
        portfolio.addProject(dragon);
        portfolio.addProject(pirate);
        portfolio.addProject(zombie);
        System.out.print(ArrayList.toString(portfolio.getAllProjects()));
	}

}
