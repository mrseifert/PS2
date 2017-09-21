import static org.junit.Assert.*;

import org.junit.Test;

import pkgNumber.MyInteger;

public class TestIsEven {

	@Test
public void TestisEven() {
		
		MyInteger num1 = new MyInteger(10);
		
		boolean bExpectedAnswer = true;
		
		assertEquals(bExpectedAnswer,num1.isEven());
	}

}
