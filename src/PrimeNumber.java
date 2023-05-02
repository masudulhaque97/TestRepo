import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		int status = 1;
		int num = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of prime numbers");
		n = scanner.nextInt();

		for (int i = 2; i <= 10;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				System.out.println(num);
				i++;
			}
			status = 1;
			num++;
		}
	}
}
