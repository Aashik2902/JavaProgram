import java.util.Scanner;

public class BMICalculator {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double bmi = weight / (height * height);
            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.format("%.2f", data[i][1]);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayBMI(String[][] data) {
        System.out.println("Height(cm) Weight(kg) BMI       Status");
        System.out.println("---------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-11s %-11s %-9s %s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] people = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            people[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            people[i][1] = scanner.nextDouble();
        }

        String[][] results = calculateBMI(people);
        System.out.println();
        displayBMI(results);

        scanner.close();
    }
}
