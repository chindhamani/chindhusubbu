import java.io.*;
  import java.util.*;
  public class Large
  {
    
    public static void main(String arg[]) 
    {
      
    Scanner s=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the first number");
    a=s.nextInt();
      System.out.println("Enter the second number");
      b=s.nextInt();
      System.out.println("Enter the third number");
      c=s.nextInt();
      if(a>b&&a>c)
      {
        
        System.out.println("Largest number is"+a);
        }
else if(b>c)
System.out.println("Largest number is"+b);
else
System.out.println("Largest number is"+c);
  
  }
}
