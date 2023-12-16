/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mortgagecalculator;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Mortgagecalculator {

    public static void main(String[] args) {
        final byte months = 12;
        final byte percent =100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Intrest Rate: ");
        double annualIntrest = scanner.nextDouble();
        double monthlyIntrest = annualIntrest / months / percent;
        System.out.print("Years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * months ;
         
        double mortgage = principal * (monthlyIntrest *( Math.pow(1+monthlyIntrest , numberOfPayments)))/(Math.pow(1+ monthlyIntrest,numberOfPayments)- 1);
         String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
         System.out.print("Mortage: " + mortgageFormatted);
        
        
        
    }
}
