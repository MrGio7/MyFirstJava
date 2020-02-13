package firstApp;

public class Main {
    public static void main(String[] args) {
        HealthPlan h1 = new HealthPlan("My Health 1");
        HealthPlan h2 = new HealthPlan("My HP2");

        Company c1 = new Company("CA", 100);
        Company c2 = new Company("CB", 200);

        App app1 = new App("fname", "lname", 45000, true, c1.id, h1.getId());
        App app2 = new App("josh", "brown", 80000, true, c2.id, h2.getId());

        System.out.println("***Data***");
        System.out.println(app1);
        System.out.println();
        System.out.println(c1.debt);
        c1.debt = -c1.debt;
        System.out.println(c1.debt);

        System.out.println("***Strings***");

        String localStr;
        localStr = app1.getFname() + " " + app2.getLname();
        System.out.println(localStr);

        String noVowels = localStr.toLowerCase().replaceAll("[a,e,i,o,u]", "_");
        System.out.println(noVowels);

        System.out.println();

        System.out.println("%%% NUMBERS %%%");
        
    }
}