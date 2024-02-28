import java.util.*;
public class F8
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the character:");
char c=s.nextLine().charAt(0);
switch(c)
{
case 'R':System.out.println("Red");
         break;
case 'B':System.out.println("Blue");
         break;
case 'O':System.out.println("Orange");
         break;
case 'Y':System.out.println("Yellow");
         break;
case 'W':System.out.println("White");
         break;
default:
      System.out.println("Invalid");
}
}