package Company;

import java.util.Scanner;

public class Company {

    Scanner scanner = new Scanner(System.in);

    protected String companyName = scanner.nextLine();
    protected String dateOfCreation = scanner.nextLine();
    protected String  code = scanner.nextLine();

    public String getCompanyName(){
        return this.companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getDateOfCreation(){
        return this.dateOfCreation;
    }
    public void setDateOfCreation(String dateOfCreation){
        this.dateOfCreation = dateOfCreation;
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String coda){
        if (code.length() == 10){
            this.code = code;
        }
        else {
            System.out.println("Error, the code must be 10 characters");
        }
    }

    public Company(String companyName,String dateOfCreation, String code){
        this.companyName = companyName;
        this.dateOfCreation = dateOfCreation;
        this.code = code;
    }

    public Company(){
        this.companyName = "";
        this.dateOfCreation = "";
        this.code = "";
    }
}
