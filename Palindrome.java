import java.io.*;
import java.util.*;
public class Palindrome
{
  
  public static void main(String args[])throws IOException
  {
     int i,n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
     String s=br.readLine();
     char[] a=s.toCharArray();
     for(i=a.length-1;i>=0;i--)
     {
       
       System.out.print(a[i]);
       }
       }
       }
    
