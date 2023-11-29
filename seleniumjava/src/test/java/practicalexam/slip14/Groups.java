package practicalexam.slip14;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = {"Group A"})
	public void testcase1() {
		
		System.out.println("Test case belong to group A");
	}
	
	@Test(groups = {"Group A", "Group B"})
	public void testcase2() {
		System.out.println("Test case belong to group A and group B");
	}
	
	@Test(groups = {"Group B"})
	public void testcase3() {
		System.out.println("Test case belong to group B");
	}
	
	
}
