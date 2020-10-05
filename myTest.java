//********************************************************************
// File: myTest.java 
// Author: James Ortiz
// Purpose: To demonstrate how three inputted numbers are added and then
// displayed in the Java programming language.
//
//********************************************************************

import java.util.Scanner;
public class myTest
{
  public static void main(String[] args)
  {
  
    Scanner scan = new Scanner(System.in);
    int A;
    int B;
    int C;
    int D;
    
    System.out.println("Please enter 3 numbers: ");
    A = scan.nextInt();
    B = scan.nextInt();
    C = scan.nextInt();
    D = scan.nextInt();
    
    int add = getData(A, B, C, D);
    
    System.out.println("The total sum is: " + add);
    
        
  }
  
  public static int getData(int num1, int num2, int num3,int num4)
  {
    int total;
    
    total = num1 + num2 + num3+num4;
    
    return total;
  }
    
}
