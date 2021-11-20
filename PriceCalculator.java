/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricecalculator;

/**
 *
 * @author Nih Ali (1781066)
 */
import java.util.Scanner;
public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Please enter the item price : ");
        float Price = myObj.nextFloat();
        System.out.print("Please enter the discount ratio (5 for 5%) : ");
        float Ratio = myObj.nextFloat();
        
        System.out.printf("\n%-15s  :","Original Price");
        float Original = Price;
        System.out.printf("%.2f%n",Original);
       
        System.out.printf("\n%-15s  :","Discount Ratio");
        float Discount = Ratio;
        System.out.printf("%.2f%n",Discount);
        
        System.out.printf("%%\n%-13s  :","Price Before Tax");
        float Before = Price - (Price * 0.05f);
        System.out.printf("%.2f%n",Before);
        
        System.out.println("------------------------------");
        
        System.out.printf("\n%-15s  :","Federal Tax");
        float Federal = Before * 0.05f ;
        System.out.printf("%.2f%n",Federal);
        
        System.out.printf("\n%-15s  :","Provincial Tax");
        float Provincial = Before * 0.0975f ;
        System.out.printf("%.2f%n",Provincial);
        
        System.out.printf("\n%-15s  :","Final Price");
        float Final = Before + Federal + Provincial ;
        System.out.printf("%.2f%n",Final);
        }
    
}

