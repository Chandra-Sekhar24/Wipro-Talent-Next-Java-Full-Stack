abstract class Compartment
{
public abstract String notice();
}
class FirstClass extends Compartment
{
public String notice()
{
return "This is first class";
}
}
class Ladies extends Compartment
{
public String notice()
{
return "This is ladies class";
}
}
class General extends Compartment
{
public String notice()
{
return "This is general class";
}
}
class Luggage extends Compartment
{
public String notice()
{
return "This is luggage class";
}
}
public class TestCompartment
{
public static void main(String args[])
{
Compartment c[]=new Compartment[10];
c[0]=new FirstClass();
c[1]=new Ladies();
c[2]=new General();
c[3]=new Luggage();
Random r=new Random();
int n=r.nextInt(3);
System.out.println(c[n].notice());
}
}
