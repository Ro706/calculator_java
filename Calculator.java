import java.util.*;

 class twonumbercalculator
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
     System.out.println("1st no. should be greater than 2nd no.");
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println("enter 1 for addition,");
    System.out.println("2 for subtraction,");
    System.out.println("3 for multiplication,");
    System.out.println("4 for division");
    int x=sc.nextInt();
    double a=m+n,b=m-n,c=m*n,d=m/n;
    if(x==1)
    System.out.println("Addition= "+a);
    if(x==2)
    System.out.println("Subtraction= "+b);
    if(x==3)
    System.out.println("Multiplication= "+c);
    if(x==4)
    System.out.println("Division= "+d);
    System.out.println("HOPE YOU LIKED IT");
   }
 }
    
