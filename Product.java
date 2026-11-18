/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author simph
 */

    public class Product implements IProduct {

    // Single-dimensional array for product names
    private String[] productNames;

    // Two-dimensional array for monthly sales
    private int[][] sales;

    // Constructor to receive the arrays
    public Product(String[] productNames, int[][] sales) {

        this.productNames = productNames;
        this.sales = sales;
    }

    // Calculate the total number of products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        // Loop through each product
        for (int i = 0; i < sales.length; i++) {

            // Loop through the three months
            for (int j = 0; j < sales[i].length; j++) {

                total = total + sales[i][j];
            }
        }

        return total;
    }

    // Calculate the average number of products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();

        // Calculate the number of sales entries
        int numberOfSales = sales.length * sales[0].length;

        return (double) total / numberOfSales;
    }

    // Find the most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        String popularProduct = "";

        // Loop through each product
        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            // Add sales for the three months
            for (int j = 0; j < sales[i].length; j++) {

                productTotal = productTotal + sales[i][j];
            }

            // Check which product has the highest total
            if (productTotal > highestSales) {

                highestSales = productTotal;
                popularProduct = productNames[i];
            }
        }

        return popularProduct + "(" + highestSales + ")";
    }
}
    

