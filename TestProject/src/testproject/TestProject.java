/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testproject;

/**
 *
 * @author jas594
 */
import java.util.Scanner;
public class TestProject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = s.nextInt();
        
        System.out.print("Enter a double: ");
        double y = s.nextDouble();
        
        System.out.print("Enter a string: ");
        String d = s.next();
        
        System.out.println(d + y + x);
    }
    
}
