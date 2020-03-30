
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                sum += num;
                count += 1;
            } else if (num == 0) {
                break;
            }
        }
        if (count > 0) {
            double avgOfPositiveNumbers = sum * 1.0 / count;
            System.out.println(avgOfPositiveNumbers);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
