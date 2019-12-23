package Annotation;

import org.testng.annotations.Test;

public class SingleDependency {
	@Test
	public void start(){
		System.out.println("start the server");
	}
	@Test(dependsOnMethods="start")//once start calisacak, start methodu calismazsa bu method baslamaz
	public void process(){
		System.out.println("processing the data");
	}
	@Test
	public void stop(){
		System.out.println("stop the server");
	}
	@Test(dependsOnMethods="process")
	public void verify(){
		
	}

}
