package TcsIPA;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class CarSolution {

    public static String grade = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] cars = new AutonomousCar[4];

        for(int i=0;i<4; i++){
            int carId = Integer.parseInt(sc.nextLine());
            String brand = sc.nextLine();
            int noOfTestsConducted = Integer.parseInt(sc.nextLine());
            int noOfTestsPassed = Integer.parseInt(sc.nextLine());
            String environment = sc.nextLine();
            cars[i] = new AutonomousCar( carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }
        String environment = sc.nextLine();
        String brand = sc.nextLine();

        int sumOfTestsPassed = findTestsPassedByEnv( cars, environment);
        if( sumOfTestsPassed == 0){
            System.out.println("No such cars for this Environment");
        } else {
            System.out.println(sumOfTestsPassed);
        }

        AutonomousCar result= updateCarGrade( cars, brand);
        System.out.println(result.getBrand()+"::"+grade);

    }

    public static AutonomousCar updateCarGrade( AutonomousCar[] cars, String brand){
        AutonomousCar result = null;
        for(AutonomousCar car: cars){
            if(car.getBrand().equalsIgnoreCase(brand)){
                result = car;
            }
        }
        int r1 = (result.getNoOfTestsPassed()*100)/result.getNoOfTestsConducted();
        if( r1 >= 80){
            grade = "A1";
        } else{
            grade = "B2";
        }
        return result;
    }

    public static int findTestsPassedByEnv(AutonomousCar[] cars,String environment){
        int sum =0;

        for(AutonomousCar car:cars){
            if(car.getEnvironment().equalsIgnoreCase(environment)){
                sum += car.getNoOfTestsPassed();
            }
        }

        return sum;
    }
}

class AutonomousCar{
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;

    AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment){
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }

    public void setCarId( int carId){ this.carId = carId;}
    public void setBrand( String brand){ this.brand = brand;}
    public void setNoOfTestsConducted( int noOfTestsConducted){ this.noOfTestsConducted = noOfTestsConducted;}
    public void setNoOfTestsPassed (int noOfTestsPassed){ this.noOfTestsPassed = noOfTestsPassed;}
    public void setEnvironment (String environment){ this.environment = environment;}

    public int getCarId () { return carId;}
    public String getBrand() { return brand;}
    public int getNoOfTestsConducted() {return noOfTestsConducted;}
    public int getNoOfTestsPassed() { return noOfTestsPassed;}
    public String getEnvironment() { return environment;}
}
