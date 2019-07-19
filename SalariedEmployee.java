import java.util.Scanner;
public class SalariedEmployee extends Employee{
     private double weeklySalary;
     public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, int id){
           setWeeklySalary(weeklySalary);
      }
       public void setWeeklySalary(double weeklySalary){
            this.weeklySalary = weeklySalary;
       }
       public double getWeeklySalary(){
            return weeklySalary;
       } 
       public String toString(){
           return super.getFirstName() ;
       }
       public double earnings(){
            return weeklySalary;
       }
       public double getPaymentAmount(){
            return weeklySalary;
       }
}
