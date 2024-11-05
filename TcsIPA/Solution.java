package TcsIPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];

        for(int i=0;i<medicines.length;i++){
            String medicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());

            medicines[i] = new Medicine(medicineName, batch, disease, price);
        }

        String disease = sc.nextLine();
        Medicine[] result = getMedicineByPrice(medicines, disease);
        for(Medicine medicine:result) {
            System.out.println(medicine.getPrice());
        }
    }

    public static Medicine[] getMedicineByPrice(Medicine[] medicines, String disease){
        List<Medicine> list= new ArrayList<>();
        for(Medicine medicine: medicines){
            if(medicine.getDisease().equalsIgnoreCase(disease)){
                list.add(medicine);
            }
        }
        Medicine[] result = list.toArray(new Medicine[list.size()]);
        Arrays.sort(result);
        return result;
    }
}

class Medicine implements Comparable<Medicine>{
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    Medicine( String medicineName, String batch, String disease, int price){
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName(){ return medicineName;}
    public String getBatch(){ return batch;}
    public String getDisease() { return disease;}
    public int getPrice(){ return price;}

    public void setMedicineName( String medicineName){ this.medicineName = medicineName;}
    public void setBatch( String batch){ this.batch = batch;}
    public void setDisease( String disease){ this.disease = disease;}
    public void setPrice(int price){ this.price = price;}

    public int compareTo( Medicine other){
        return Integer.compare(this.price,other.price);
    }
}