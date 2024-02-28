import java.util.*;
class PrintArray
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++)
{
   str[i]=s.nextLine();
}
for(int i=0;i<n;i++)
{
   System.out.println(str[i]);
}
}
}
