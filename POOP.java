import java.util.ArrayList;

public class POOP{
    public static void main(String[] args) {
        Employee employee = new Employee("Tom","UX/UI", "0001");
        Project projectA1 = new Project("Web A", "Developing a web application");
        Project projectA2 = new Project("Moblie app A", "Developing a mobile app");

        employee.AddProject(projectA1);
        employee.AddProject(projectA2);
        employee.ShowDetails();

        Employee employee2 = new Employee("Tim", "FrontEnd", "0002");
        Project projectB = new Project("Web A","Developing a web application");

        employee2.AddProject(projectB);
        employee2.ShowDetails();
    }
}

class Employee implements Person,Job{
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> projects;

    public Employee(String name,String position, String empID) {
        this.Name = name;
        this.Position = position;
        this.EmpID = empID;
        this.projects = new ArrayList<Project>();
    }

    public String getName() {
        return Name;
    } 

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return (int) Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public String getEmpID() {
        return EmpID;
    }
    public void setEmpID(String empID) {
        this.EmpID = empID;
    }

    public void AddProject(Project project) {
        projects.add(project);
    }

    public void ShowDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        System.out.println("EmpID: " + getEmpID());
        System.out.println("Projects:");
        for (Project project : projects) {
            System.out.println("  " + project.getProject());
        }
        System.out.println("************************************");
    }
}

class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProject() {
        return projectName + ":" + description;
    }
}

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}