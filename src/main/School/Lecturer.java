package main.School;

public class Lecturer extends User implements Authenticatable{

    private final String employeeID;

    public Lecturer(String username, String email, String employeeID) {
        super(username, email);
        this.employeeID = employeeID;
    }

    public void login() {
        System.out.println("Lecturer logged in");
    }

    public String getEmployeeID() {
        return employeeID;
    }
}
