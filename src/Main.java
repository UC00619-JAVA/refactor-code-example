import java.util.Scanner;

public class Main {

    // main now reads like an index: 5 lines (maximum allowed: 6)
    // read 7 temperatures
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperatures = readTemperatures(sc, 7);
        System.out.println("Average: " + average(temperatures));
        System.out.println("Range: " + (max(temperatures) - min(temperatures)));
        drawChart(temperatures);
    }

    // Reads n temperatures from the keyboard
    public static double[] readTemperatures(Scanner sc, int n) {
        double[] temperatures = new double[n];
        for (int i = 0; i < n; i++) {
            temperatures[i] = sc.nextDouble();
        }
        return temperatures;
    }

    // Average of the values
    public static double average(double[] t) {
        double sum = 0;
        for (double x : t) {
            sum += x;
        }
        return sum / t.length;
    }

    // Lowest value
    public static double min(double[] t) {
        double min = t[0];
        for (double x : t) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    // Highest value
    public static double max(double[] t) {
        double max = t[0];
        for (double x : t) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    // One line of '*' per temperature
    public static void drawChart(double[] t) {
        for (double x : t) {
            System.out.println("*".repeat((int) x));
        }
    }
}
