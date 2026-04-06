import java.lang.*;
import java.util.*;

/**
 * Entry point of the program.
 *
 * <p>This class serves as the starting point for executing the application.
 * It invokes the Probability Mass Function (PMF) computation for the
 * Poisson distribution.</p>
 *
 * @author Akash
 * @version 1.0
 * @since 2026
 */
public class Main {

    /**
     * Main method that triggers the execution of the program.
     *
     * <p>Instead of creating an object of the {@code PMF} class, all methods
     * in the PMF class are declared as static. This approach avoids unnecessary
     * object creation and helps in reducing memory overhead.</p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        PMF.pmf();
    }
}