import java.util.*;
public class M5
{
static Map<String,String> m=new TreeMap<String,String>();
static Map<String,String> m1=new TreeMap<String,String>();
void saveCountryCapital(String country,String capital)
{
m.put(country,capital);
}
String getCapital(String country)
{
return m.get(country);
}
String getCountry(String capital)
{
return m.get(capital);
}
void reverse()
{
for(Map.Entry<String,String> r:m.entrySet())
{
    m1.put(r.getValue(),r.getKey());
}
}
ArrayList change()
{
ArrayList<String> a=new ArrayList<String>();
for(Map.Entry<String,String> r:m.entrySet())
    a.add(r.getKey());
return a;
}
public static void main(Strinng args[])
{
M1 t=new M1();
t.saveCountryCapital("india","delhi");
t.saveCountryCapital("london","paris");
t.saveCountryCapital("USA","washington");
System.out.println(t.getCapital("india"));
System.out.println(t.getCountry("washington"));
t.reverse();
System.out.println(change());
}
}

