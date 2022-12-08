package udemyworkout;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Javastreams {

	
	@Test
	public void normalMethod()
	{
		int count=0;
		ArrayList<String> as = new ArrayList<String>();
		as.add("Allan");
		as.add("Amy");
		as.add("Steven");
		
		for(int i=0;i<as.size();i++)
		{
			String val = as.get(i);
			if(val.startsWith("A"))
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
	@Test
	public void method1()
	{
		ArrayList<String> as = new ArrayList<String>();
		as.add("Allan");
		as.add("Amy");
		as.add("Steven");
		
		Long c = as.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
	
}
