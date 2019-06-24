
public class ProjectClass {
	private String name;
	private String description;
	private double initialCost;
	
	public ProjectClass() {
		
	}
	
	public ProjectClass(String name) {
		this.name = name;	
	}
	
	public ProjectClass(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String elevatorPitch () {
		System.out.println("My movie ideas");
		return this.name + " (" + this.initialCost + "): " + this.description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getCost() {
		return this.initialCost;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setCost(double initialCost) {
		this.initialCost = initialCost;
	}
}
