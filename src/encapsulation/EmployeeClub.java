package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee emp=new Employee();

        System.out.println("Hey,what is your name?");
        emp.setFullName(input.nextLine());

        System.out.println("What is your age?");
        emp.setAge(input.nextInt());
        input.nextLine();

        System.out.println("Address,please");
        emp.setAddress(input.nextLine());

        if(emp.getAddress().toLowerCase().contains("chicago")&&emp.getAge()>21){
            System.out.println(emp.getFullName() + "In the club");
        }
        else {
            System.out.println(emp.getFullName() + "Is not in the club");
        }



    }
}
