import java.util.*;
public class F7
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the character:");
int c=s.nextLine().charAt(0);
if(Character.isUpperCase((char)c))
  System.out.println((char)(c+32));
else
  System.out.println((char)(c-32));
}
}