import java.util.*;
public class Contractor extends Employee{
     private final String socialSecurityNumber;
     Date start;
     double amount;
     boolean isActive;
     public Contractor(String ssn, double amount){
          this.amount = amount;
          this.start = new Date();
          this.socialSecurityNumber = ssn;

     }
     public String toString(){
          return "Something";
     }
     public double earnings(){
          return amount;
     }
     public double getPaymentAmount(){
          return amount;
     }
}
