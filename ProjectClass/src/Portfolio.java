import java.util.ArrayList;
public class Portfolio {
	private ArrayList<ProjectClass> projects = new ArrayList<ProjectClass>();
	
	public Portfolio(){

    }

    public void addProject(ProjectClass project){
        this.projects.add(project);
    }

    public ArrayList<ProjectClass> getAllProjects(){
        return this.projects;
    }

}
