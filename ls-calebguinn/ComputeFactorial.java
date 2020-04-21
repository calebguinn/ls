import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ComputeFactorial {
    private static long rcounter = 0;

    // This is an example for a direct recursion
    private static long factorial(final long n) {
        System.out.println("Still computing " + rcounter++);

        // if we comment the base case, we will have an infinite recursion
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static long fib(final long index) {
        ++rcounter;
        System.out.println("Fib index: " + index);
        if (index == 0)
            return 0; // First base case
        else if (index == 1)
            return 1; // Second base case
        else
            return fib(index - 1) + fib(index - 2);
    }

    public static long fibIter(final int index) {

        if (index == 0)
            return 0;
        if (index == 1)
            return 1;

        long[] fibs = new long[index + 1];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i <= index; ++i) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }

        System.out.println("Fib index: " + fibs[index]);
        return fibs[index];
    }

    public static void main(final String[] args) {
         try (Scanner input = new Scanner(System.in);) {

            System.out.println("Enter the number: "); 
            long factorialInput = input.nextLong();

            // remember about StringBuffer, to create String in an effective way
            // and reduce number of new Strings
            StringBuffer sb = new StringBuffer("Factorial of ");
            sb.append(factorialInput);
            sb.append(" is ");
            sb.append(factorial(factorialInput));
            sb.append(System.getProperty("line.separator"));
            System.out.println(sb.toString());

            System.out.println("Enter the number: ");
            final int n = input.nextInt();

            sb.delete(0, sb.length());
            sb.append("n: ");
            sb.append(n);
            sb.append("Fibonacci of " + n + " is " + fib(n));
            sb.append(System.getProperty("line.separator"));
            System.out.println(sb.toString() + "Number of calls: " + rcounter);

            // do the same calculation, but this time iterate
            long x = fibIter(n);
            System.out.println("Fibonacci of " + n + " is " + x);
        }catch(NoSuchElementException|IllegalStateException e)
    {
        e.printStackTrace();
    }
}
}