/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;

/**
 *
 * @author Nih Ali (1781066)
 */
import java.util.Scanner;
public class NumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int octal;
        int p = 0;
        int num = 0;
        
        System.out.print("Please enter a 4-digits Octal number : ");
        octal = scanner.nextInt();
        int octalTemp = octal;
         
        while(true){
            
          if(octal == 0){
           
          break;
        
       }else {
          int decimal = octal%10;
          num += decimal*Math.pow(8, p);
          octal = octal/10;
          p++;
       }
    }
        System.out.printf("\n%-15s  :","Octal Number");
        System.out.printf("%s",octalTemp);
        
        System.out.printf("\n%-15s  :","Decimal Number");
        System.out.printf("%s",num);
        }      
}
