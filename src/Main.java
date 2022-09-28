import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.printf("Enter your payment: ");
	double payment = scanner.nextDouble();
	scanner.close();
	
	String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
	String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
	
	System.out.println("US: " + us);
	System.out.println("France: " + fr);
	System.out.println("China: " + ch);

	}

}
