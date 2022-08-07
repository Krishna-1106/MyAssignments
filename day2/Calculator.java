package week1.day2;

public class Calculator {

	public int add(int a,int b) {
		return (a+b);	
	}
	public int mul(int a,int b) {
		return (a*b);	
	}
	public int sub(int a,int b) {
		return (a-b);
	}
	 public int div(int a, int b) {
		 return (a/b);
		 
	 }

	public static void main(String[] args) {
          Calculator function= new Calculator();
          function.add(5, 5);
          function.mul(10, 10);
          function.sub(10, 10);
          function.div(10, 2);
          
	}

}
