import java.util.*;
public class F4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the characters:");
char c1=s.nextLine().charAt(0);
char c2=s.nextLine().charAt(0);
if(c1>c2)
{
System.out.println(c2+","+c1);
}
else
{
System.out.print(c1+","+c2);
}
}
}