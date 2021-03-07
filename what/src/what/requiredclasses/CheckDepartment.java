package what.requiredclasses;

public class CheckDepartment {
    //checks if the department is available
    private String available;


    public CheckDepartment(String available) {
        this.available = available;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
