import java.util.*;

class TestPayablePersonnel {
     public static void main (String[] args){
          ArrayList<Employee> personnel = new ArrayList<Employee>();
          SalariedEmployee person = new SalariedEmployee("Tom", "Jones", "111-22-3333", 1000.00, 0);
          System.out.println(person);

     }
}
