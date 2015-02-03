package work010215;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main
{

	public static void main(String[] args)  
	{
		Person p = new Person();
		Class x = p.getClass();
		System.out.println(x.getCanonicalName());
		System.out.println(x.getName());
		Field[] q = x.getDeclaredFields();
		for (Field f : q)
		{
			System.out.println(f.getName() + ", " + f.getGenericType());
		}
		System.out.println();
		
		Method[] methods = x.getDeclaredMethods();
		for (Method m : methods)
		{
			System.out.println(m.getName()+" "+m.getGenericReturnType());
		}
	}

}
