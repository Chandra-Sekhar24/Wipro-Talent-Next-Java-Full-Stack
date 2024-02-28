package com.automobile;
abstract class Vehicle
{
public abstract String getModelName();
public abstract String getRegistrationNumber();
public abstract String getOwnerName();
}
package com.automobile.FourWheeler;
import com.automobile.*;
class Logan extends Vehicle
{
public abstract String getModelName()
{
return "HFDelux";
}
public abstract String getRegistrationNumber()
{
return "12ASD";
}
public abstract String getOwnerName()
{
return "pavan";
}
public int speed()
{
return 50;
}
public int gps()
{
return 40;
}
}
class Ford extends Vehicle
{
public abstract String getModelName()
{
return "CDDelux";
}
public abstract String getRegistrationNumber()
{
return "12ASc";
}
public abstract String getOwnerName()
{
return "soichio";
}
public int speed()
{
return 50;
}
}
public int tempControl()
{
return 56;
}
}
public class TestFourWheeler
{
public static void main(String args[])
{
Logan h=new Logan();
System.out.println(h.getSpeed()+" "+h.getOwnerName()+" "+h.getRegistrationNumber()+" "+h.getModelName());
Ford h1=new Ford();
System.out.println(h1.getSpeed()+" "+h1.getOwnerName()+" "+h1.getRegistrationNumber()+" "+h1.getModelName());
}
}
