package TcsIPA;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[4];

        for (int i = 0; i < 4; i++) {
            int employeeId = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = Double.parseDouble(sc.nextLine());
            boolean transport = Boolean.parseBoolean(sc.nextLine());

            employees[i] = new Employee(employeeId, name, branch, rating, transport);
        }
        String branch = sc.nextLine();
        int count = employeesUsingTransportInBranch(employees, branch);
        System.out.println(count);

        Employee result = findEmployeeWithSecondHighestRating(employees);
        System.out.println(result.getEmployeeld());
        System.out.println(result.getName());
    }

    private static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
        Employee highest = null;
        Employee secondHighest = null;
        for( Employee employee: employees){
            if(!employee.getTransport()){
                if(highest == null || employee.getRating()>highest.getRating()){
                    secondHighest = highest;
                    highest = employee;
                } else if(secondHighest == null ||  employee.getRating()>secondHighest.getRating()){
                    secondHighest = employee;
                }
            }
        }
        return secondHighest;
    }

    private static int employeesUsingTransportInBranch(Employee[] employees, String branch) {
       int count =0;
        for(Employee employee: employees){
            if(employee.getBranch().equalsIgnoreCase(branch)){
                if(employee.getTransport()){
                    count++;
                }
            }
        }
        return count;
    }


}

class Employee{
    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    Employee( int employeeld, String name, String branch, double rating, boolean transport){
        this.employeeld = employeeld;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public void setEmployeeld(int employeeld){ this.employeeld = employeeld;}
    public void setName(String name){ this.name = name;}
    public void setBranch(String branch){ this.branch = branch; }
    public void setRating(double rating){ this.rating = rating;}
    public void setTransport( boolean transport){ this.transport = transport; }

    public int getEmployeeld(){ return employeeld;}
    public String getName(){ return name;}
    public String getBranch(){ return branch; }
    public double getRating(){ return rating;}
    public boolean getTransport( ){return transport; }

}