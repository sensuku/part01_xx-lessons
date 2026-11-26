
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int valueGift = Integer.valueOf(scan.nextLine());
        int tax;
        double taxRate;
        double sum;

        if(valueGift > 1000000) {
            tax = 142100;
            taxRate = 0.17;
            sum = (tax+(valueGift-1000000)*taxRate);
            System.out.println("Tax: "+sum);
        } else if(valueGift >200000 && valueGift <=1000000) {
            tax = 22100;
            taxRate = 0.15;
            sum = (tax+(valueGift-200000)*taxRate);
            System.out.println("Tax: "+sum);
        } else if(valueGift >55000 && valueGift <=200000) {
            tax = 4700;
            taxRate = 0.12;
            sum = (tax+(valueGift-55000)*taxRate);
            System.out.println("Tax: "+sum);
        } else if(valueGift >25000 && valueGift <=55000) {
            tax = 1700;
            taxRate = 0.1;
            sum = (tax+(valueGift-25000)*taxRate);
            System.out.println("Tax: "+sum);
        } else if(valueGift >=5000 && valueGift <=25000) {
            tax = 100;
            taxRate = 0.08;
            sum = (tax+(valueGift-5000)*taxRate);
            System.out.println("Tax: "+sum);
        } else {
            System.out.println("No tax!");
        }
    }
}
