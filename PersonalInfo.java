/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinfo;

/**
 *
 * @author Nih Ali (1781066)
 */
import java.util.Scanner;
public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Please enter your name : ");
        String Name;
        Name = myObj.nextLine();
        
        System.out.print("Please enter your age : ");
        String Age;
        Age = myObj.nextLine();
        
        System.out.print("Please enter your gender : ");
        String Gender;
        Gender = myObj.nextLine();
        
        System.out.print("Please enter your department : ");
        String Department;
        Department = myObj.nextLine();
        
        System.out.print("Please enter the value of PI (3.1415926) : ");
        final double PI = myObj.nextDouble();
        
        System.out.printf("\n%-15s  :","Name");
        System.out.printf("%s",Name);
        
        System.out.printf("\n%-15s  :","age");
        System.out.printf("%s",Age);
        
        System.out.printf("\n%-15s  :","Gender");
        System.out.printf("%s",Gender);
        
        System.out.printf("\n%-15s  :","Department");
        System.out.printf("%s",Department);
        
        System.out.printf("\n%-15s  :","PI");
        System.out.printf("%.2f%n",Math.PI);
        
    }
    
}
