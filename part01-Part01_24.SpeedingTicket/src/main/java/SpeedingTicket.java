
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        int number;

        System.out.println("Give speed:");
        number = Integer.valueOf(scanner.nextLine());
        if(number > 120) {
            System.out.println("Speeding ticket");
        }

    }
}
