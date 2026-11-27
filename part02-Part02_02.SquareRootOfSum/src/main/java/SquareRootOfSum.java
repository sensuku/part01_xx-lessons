
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.valueOf(scanner.nextLine());
        int numberTwo = Integer.valueOf(scanner.nextLine());
        if(numberOne > 0 && numberTwo > 0) {
            double value = Math.sqrt(numberOne+numberTwo);
            System.out.println(value);
        }
    }
}
