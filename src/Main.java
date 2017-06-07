/**
 * Created by Dave on 6/7/17.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the days stock prices");
        String[] stockPrices = scanner.nextLine().split(" ");

        for (String s: stockPrices) {
            System.out.println(s);
        }

        double x = Double.parseDouble(stockPrices[0]);
    }
}
