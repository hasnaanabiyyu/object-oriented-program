/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPboPertemuanKeempat;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
// Custom Exception Class
public class HasnanException extends Exception { 
    public HasnanException(String message) { 
        super(message);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Simulate accessing an index out of bounds
            int invalidNumber = getArrayElement(numbers, 10);
            System.out.println("Number at index 10: " + invalidNumber);
        } catch (HasnanException e) {
            // Handle the custom exception
            System.out.println("Caught custom exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the built-in exception
            System.out.println("Caught built-in exception: " + e.getMessage());
        }
    }

    // Method to get an element from an array
    public static int getArrayElement(int[] array, int index) throws HasnanException {
        if (index < 0 || index >= array.length) {
            throw new HasnanException("Index " + index + " is out of bounds!");
        }
        return array[index];
    }
}
