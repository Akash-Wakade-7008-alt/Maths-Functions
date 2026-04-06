import java.util.*;

/**
 * <p>
 * This is the Main class where the user enters two numeric values
 * (integer or decimal). The method meanOfTwoNum() calculates
 * and returns their average.
 * </p>
 * 
 * @author Akash Wakade
 * @version 2.0
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mean mean = new Mean();

        System.out.print("Enter the first number: ");
        mean.num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        mean.num2 = sc.nextDouble();

        double result = mean.meanOfTwoNum(mean.num1, mean.num2);

        System.out.printf("The mean of %.2f and %.2f is: %.2f%n", mean.num1, mean.num2, result);
        
    }
}