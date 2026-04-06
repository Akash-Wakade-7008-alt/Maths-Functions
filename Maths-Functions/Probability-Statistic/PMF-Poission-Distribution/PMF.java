/**
 * Utility class for computing the Probability Mass Function (PMF)
 * of the Poisson distribution.
 *
 * <p>This class provides methods to calculate the PMF value based on
 * user input. It validates inputs and handles edge cases such as
 * negative values.</p>
 *
 * <p>The Poisson PMF formula used is:
 * P(X = r) = (e^-λ * λ^r) / r!</p>
 *
 * @author Akash
 * @version 1.0
 * @since 2026
 */
 public class PMF {

    /**
     * Computes and displays the PMF of the Poisson distribution.
     *
     * <p>This method:
     * <ul>
     *   <li>Accepts user input for {@code r} (number of occurrences)</li>
     *   <li>Accepts user input for {@code λ} (mean number of events)</li>
     *   <li>Validates input values</li>
     *   <li>Calculates PMF using the Poisson formula</li>
     *   <li>Displays the result</li>
     * </ul>
     *
     * <p>To optimize memory usage, this method is declared static,
     * avoiding unnecessary object creation.</p>
     */
    static void pmf() {

        System.out.println("********* PMF of Poisson Distribution *********\n");

        System.out.println("Formula:");
        System.out.println("P(X=r) = (e^-λ * λ^r) / r!\n");
        System.out.println("X  --> Random variable (number of events)");
        System.out.println("r  --> Number of occurrences (0,1,2,...)");
        System.out.println("λ  --> Average number of events (mean)");
        System.out.println("e  --> Euler's number (~2.718)\n");

        System.out.println("* λ (lambda) must be >= 0");
        System.out.println("* r must be >= 0 and an integer");
        System.out.println("* Output will be a probability value (double)\n");

        System.out.println("Edge Cases:");
        System.out.println("    If λ < 0  --> Invalid input");
        System.out.println("    If r < 0  --> Invalid input");
        System.out.println("    If r is not an integer --> Invalid\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of r:");
        int r = sc.nextInt();

        if (r < 0) {
            System.out.println("Invalid input, try again.");
            return;
        }

        System.out.println("Enter the value of lambda:");
        double lambda = sc.nextDouble();

        if (lambda < 0) {
            System.out.println("Invalid input, try again.");
            return;
        }

        double numerator = exponentialFunction(lambda) * powerFunction(lambda, r);
        double denominator = factorial(r);

        double output = numerator / denominator;

        System.out.printf("PMF is : %.5f", output);
    }

    /**
     * Computes the factorial of a non-negative integer.
     *
     * <p>Uses an iterative approach to calculate {@code r!}.
     * The result is stored in a {@code double} to reduce the risk
     * of integer overflow for moderately large values of {@code r}.</p>
     *
     * @param r number of occurrences (must be >= 0)
     * @return factorial of {@code r}
     */
    static double factorial(int r) {
        double rFact = 1.0;

        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }

        return rFact;
    }

    /**
     * Computes the exponential component of the Poisson formula.
     *
     * <p>Calculates {@code e^-λ} using {@link Math#exp(double)}.</p>
     *
     * @param lambda average number of events (λ)
     * @return value of e^-λ
     */
    static double exponentialFunction(double lambda) {
        return Math.exp(-lambda);
    }

    /**
     * Computes λ raised to the power r.
     *
     * <p>Uses {@link Math#pow(double, double)} to calculate λ^r.</p>
     *
     * @param lambda average number of events (λ)
     * @param r number of occurrences
     * @return value of λ^r
     */
    static double powerFunction(double lambda, int r) {
        return Math.pow(lambda, r);
    }
}