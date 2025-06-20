package pac2;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = {"Smoke","Regression"})
	public void test() {
		System.out.println("test");
	}
	
	@Test(groups = "Regression")
	public void test1() {
		System.out.println("test1");
	}
}

