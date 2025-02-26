package edu.training.jc.simple_linear;

public class Linear_06 {

	public static void main(String[] args) {
		double a = 5, b = 2, c = 9;
		double numerator, denominator;
		double firstHalf, secondHalf;
		double result;
		
		numerator = b + Math.sqrt(b * b + 4 * a * c);
		denominator = 2 * a;
		
		firstHalf = numerator / denominator;
		secondHalf = Math.pow(a, 3) * c + Math.pow(b, -2);
		
		result = firstHalf - secondHalf;
		
		System.out.printf("Результат: %.2f", result);
		
	}

}
