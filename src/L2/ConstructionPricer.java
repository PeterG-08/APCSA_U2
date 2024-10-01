package L2;

import java.util.Scanner;

public class ConstructionPricer
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lumber pieces needed: ");
        int lumber = scanner.nextInt();

        System.out.print("Windows needed: ");
        int windows = scanner.nextInt();

        System.out.print("Tax rate: ");
        double taxRate = scanner.nextDouble();

        ConstructionPricer pricer = new ConstructionPricer(11.5, 25.75, taxRate);

        double noTaxCost = pricer.materialsCost(lumber, windows);
        double taxCost = pricer.totalWithTax(noTaxCost);

        System.out.println();
        System.out.println("Totals materials cost: " + noTaxCost);
        System.out.println("Final cost (with tax): " + taxCost);
    }

    private double boardPrice;  // price per board
    private double windowPrice; // price per square inch of window
    private double taxRate;     // tax rate, e.g 25% = 0.25


    public ConstructionPricer(double boardPrice, double windowPrice, double taxRate)
    {
        this.boardPrice = boardPrice;
        this.windowPrice = windowPrice;
        this.taxRate = taxRate;
    }


    // Computes and returns the total materials cost (WITHOUT tax)
    public double materialsCost(int numBoards, int numWindows)
    {
        double windowCost = windowPrice * numWindows;
        double lumberCost = boardPrice * numBoards;
        double total = windowCost + lumberCost;
        return total;
    }


    // When this method is provided with a total materials cost as a parameter,
    // it will compute the tax and return the grand total WITH TAX ADDED
    public double totalWithTax(double totalMaterialCost)
    {
        double tax = totalMaterialCost * taxRate;
        return totalMaterialCost + tax;
    }
}
