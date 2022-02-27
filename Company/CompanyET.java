package Company;

import java.util.Scanner;

public class CompanyET extends Company{

    Scanner scanner = new Scanner(System.in);

    protected String  ownersName = scanner.nextLine();
    protected double startingCapital = Double.parseDouble(scanner.nextLine());
    protected double capital = Double.parseDouble(scanner.nextLine());

    public CompanyET(String companyName, String dateOfCreation, String code,String ownersName, double startingCapital, double capital){
        super(companyName, dateOfCreation, code);
        this.ownersName = ownersName;
        this.startingCapital = startingCapital;
        this.capital = capital;
    }

    public CompanyET(){
        this.ownersName = "";
        this.startingCapital = 0;
        this.capital = 0;
    }

    public String getOwnersName(){
        return this.ownersName;
    }
    public void setOwnersName(String ownersName){
        this.ownersName = ownersName;
    }

    public double getStartingCapital(){
        return this.startingCapital;
    }
    public void setStartingCapital(double startingCapital){
        this.startingCapital = startingCapital;
    }

    public double getCapital(){
        return this.capital;
    }
    public void setCapital(double capital){
        this.capital = capital;
    }

    protected double Earnings() {
        System.out.println(capital - startingCapital);
        return 0;
    }

    public void inputInfo(CompanyET company){

        System.out.print("Enter name of company: ");
        String companyName = scanner.nextLine();
        company.setCompanyName(companyName);

        System.out.print("Enter date of creation: ");
        String dateOfCreation = scanner.nextLine();
        company.setDateOfCreation(dateOfCreation);

        System.out.print("Enter code (10 numbers): ");
        String code = scanner.nextLine();
        company.setCode(code);

        System.out.print("Enter name of owner: ");
        String ownersName = scanner.nextLine();
        company.setOwnersName(ownersName);

        System.out.print("Enter starting money: ");
        double statingCapital = Double.parseDouble(scanner.nextLine());
        company.setStartingCapital(startingCapital);

        System.out.print("Enter money in present time: ");
        double capital = Double.parseDouble(scanner.nextLine());
        company.setCapital(capital);

    }

}
