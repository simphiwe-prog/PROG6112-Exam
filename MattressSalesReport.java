/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author simph
 */

    import java.util.Scanner;

public class MattressSalesReport {

    public static void main(String[] args) {

        // Create Scanner to receive user input
        Scanner input = new Scanner(System.in);

        // Store the three product names
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Store monthly sales in a two-dimensional array
        int[][] sales = new int[3][3];

        // Ask the user to enter sales for each product
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + productNames[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Creating an object of the Product class
        Product product = new Product(productNames, sales);

        // Creating an object of the PrintProduct class
        PrintProduct report = new PrintProduct();

        // display the sales report 
        System.out.println("\nPRODUCT SALES REPORT - 2026");

        System.out.println("****************************************");

        // get and print total sales
        report.PrintTotalSales(
                product.GetTotalProductsSold());

        // get and print average sales
        report.PrintAverageSales(
                product.GetAverageProductSold());

        // get and print the most popular product
        report.PrintPopularProduct(
                product.GetMostPopularProduct());

        
        input.close();
    }
}
    

