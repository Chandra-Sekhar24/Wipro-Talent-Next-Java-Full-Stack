import java.util.*;
public class S4
{
static TreeSet a=new TreeSet();
void saveCountryName(String s)
{
a.add(s);
}
String getCountry(String s)
{
if(a.contains(s))
   return s;
else 
   return null;
}
public static void main(String args[])
{
S1 s=new S1();
s.saveCountryName("USA");
s.saveCountryName("INDIA");
s.saveCountryName("CANADA");
System.out.println(s.getCountry("INDIA"));
}
}