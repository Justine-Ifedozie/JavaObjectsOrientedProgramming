package main.School;

public class Student extends User implements Authenticatable {
    private String matricNo;

    public Student(String username, String email, String matricNo) {
        super(username, email);
        this.matricNo = matricNo;

    }

    public String getMatricNo() {
        return matricNo;
    }
    @Override
    public void login() {
        System.out.println("Student logged in");
    }
}
