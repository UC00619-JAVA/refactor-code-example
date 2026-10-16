import java.util.Scanner;

// The ORIGINAL program from the slide - everything inside main.
// Kept here only to compare: run both with the same 7 temperatures
// and the output must be exactly the same.
public class Original {

    // read 7 temperatures
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] t = new double[7];
        for (int i = 0; i < t.length; i++)
            t[i] = sc.nextDouble();
        double sum = 0, min = t[0], max = t[0];
        for (double x : t) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println("Average: " + sum / t.length);
        System.out.println("Range: " + (max - min));
        for (double x : t)
            System.out.println("*".repeat((int) x));
    }
}
