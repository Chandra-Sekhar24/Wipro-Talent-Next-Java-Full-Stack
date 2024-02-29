package com.wipro.sample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.*;
public class Main {
public static void main(String args[])throws Exception
{
	ApplicationContext b=new ClassPathXmlApplicationContext("beans.xml");
	HelloWorld h=b.getBean(HelloWorld.class);
	h.disp();
	//((ClassPathXmlApplicationContext)b).close();
}
}
