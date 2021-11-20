/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancecalculator;

/**
 *
 * @author Nih Ali (1781066)
 */
import java.util.Scanner;
public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Please enter the initial balance : ");
        float balance = myObj.nextFloat();
        
        System.out.print("Please enter the annual interest rate (2 for 2%) : ");
        float interest = myObj.nextFloat();
        
        System.out.print("Please enter the number of years the client wants to save the money in the bank : ");
        int years = myObj.nextInt();
        
        System.out.printf("\n%-20s  :","Initial Balance");
        float initial = balance;
        System.out.printf("$%.2f%n",initial);
        
        System.out.printf("\n%-15s  :","Annual Interest Rate");
        float rate = interest;
        System.out.printf("%.2f%n",rate);
        
        System.out.printf("%%\n%-20s  :","Saving Years");
        int saving = years;
        System.out.printf("%s",saving);
        
        
        System.out.printf("\n%-20s  :","Balance After 5 Years");
        double end = initial + (initial * Math.pow(rate, saving));
        System.out.printf("%.2f%n",end);        
        }
    
}
