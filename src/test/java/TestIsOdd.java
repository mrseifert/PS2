import static org.junit.Assert.*;

import org.junit.Test;

import pkgNumber.MyInteger;

public class TestIsOdd {

	@Test
public void TestisOdd() {
		
		MyInteger num1 = new MyInteger(10);
		
		boolean bExpectedAnswer = false;
		
		assertEquals(bExpectedAnswer,num1.isOdd());
	}

}
