package assignment5;

public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz(50);

	}
	private static void FizzBuzz(int num) {
		for(int i=1;i<=num;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}

}
