import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double X = sc.nextDouble();
			double Y = sc.nextDouble();
			double Z = sc.nextDouble();
			
			double weightedAverage = (X * 2.0 + Y * 3.0 + Z * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", weightedAverage);
		}
		
		sc.close();
	}
}
