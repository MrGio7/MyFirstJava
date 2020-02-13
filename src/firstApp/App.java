package firstApp;

public class App {
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private boolean avalible;
    private int companyId;
    private int healthPlanId;

    public App(String fname, String lname, double salary, boolean avalible, int companyId, int healthPlanId) {
        maxId++;

        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.avalible = avalible;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAvalible(boolean avalible) {
        this.avalible = avalible;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setHealthPlanId(int healthPlanId) {
        this.healthPlanId = healthPlanId;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getAvalible() {
        return avalible;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getHealthPlanId() {
        return healthPlanId;
    }

    public String getName() {
        return fname + " " + lname;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" +
                        "fname: " + fname + "\n" +
                        "lname: " + lname + "\n" +
                        "salary: " + salary + "\n" +
                        "avalible: " + avalible + "\n" +
                        "companyId: " + companyId + "\n" +
                        "healthPlanId: " + healthPlanId + "\n";

        return rtnStr;
    }
}