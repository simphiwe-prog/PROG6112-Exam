/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author simph
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        // Arrange
        double price = 100.00;
        ProductCalculations calc = new ProductCalculations(price);
        
        // Expected VAT is 15% of 100.00 = 15.00
        double expectedVat = 15.00;
        
        // Act
        double actualVat = calc.GetVat();
        
        // Assert
        assertEquals(expectedVat, actualVat, 0.001);
    }
}
    

