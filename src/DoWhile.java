import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tasso = 0;
		do {
			System.out.println("Inserisci un tasso d'interesse > 0");
			tasso = input.nextInt();
		} while (tasso <= 0);
	}
}
