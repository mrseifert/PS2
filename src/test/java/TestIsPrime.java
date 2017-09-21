import static org.junit.Assert.*;

import org.junit.Test;

import pkgNumber.MyInteger;

public class TestIsPrime {

	
	@Test
	public void TestisPrime() {
			
			MyInteger num1 = new MyInteger(11);
			
			boolean bExpectedAnswer = true;
			
			assertEquals(bExpectedAnswer,num1.isPrime());
		}
		
	
	}


