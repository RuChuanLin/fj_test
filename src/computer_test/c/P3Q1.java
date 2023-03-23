package computer_test.c;

import java.util.Scanner;

/**
 * 
 * @author river 按照公式答案錯
 */
public class P3Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String[] target = sc.next().split("\\s+");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			String[] testCase = sc.next().split("\\s+");

			fn(target, testCase);
		}
		sc.close();
	}

	static void fn(String[] winningNumbers, String[] comparingNumbers) {
		int count = 0;
		for (int i = 0; i < winningNumbers.length; i++) {
			for (int j = 0; j < comparingNumbers.length; j++) {
				if (winningNumbers[i].equals(comparingNumbers[j])) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
