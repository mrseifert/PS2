package pkgNumber;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	//
	public static boolean isEven(int num) {
		return (num % 2 == 0);
	}
	
	public static boolean isOdd (int num) {
		return (num % 2 != 0);
	}
	
	public static boolean isPrime (int num) {
		   for(int i = 2; 2 * i < num; i++) {
		       if(num % i == 0)
		           return false;
		   }
		   return true;
	}
	
	
	public static boolean isEven(MyInteger num) {
		return isEven(num.getiValue());
		
	}
	
	public static boolean isOdd(MyInteger num) {
		return isOdd(num.getiValue());
	}
	
	public static boolean isPrime(MyInteger num) {
		return isPrime(num.getiValue());
	}
	
	public boolean isEven() {
		return isEven(getiValue());
	}
	
	public boolean isOdd() {
		return isOdd(getiValue());				
	}
	
	public boolean isPrime() {
		return isPrime(getiValue());
	}
	
	public boolean isEquals(int num) {
		return (num == getiValue());
	}
	
	public boolean isEquals(MyInteger num) {
		return equals(getiValue());
	}
	
		
		
		
		
		
			
	}
	


