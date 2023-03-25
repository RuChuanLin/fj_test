package computer_test.c;

import java.util.Scanner;

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

	/**
	 * 目的：計算投注中了幾個號碼
	 * 
	 * 1. 使用者會分別輸入開獎號碼(winningNumbers)和投注號碼(comparingNumbers)，兩者皆為長度為 5 的陣列
	 * 2. 我們需要計算總共中獎幾個號碼，因此我們必須先宣告一個計數器 count
	 * 3. 比較邏輯：找找看 comparingNumbers 的第一個號碼是否出現在 winningNumbers。如果有，則計數器加 1
	 * 4. 比較完 comparingNumbers 的第一個號碼後，比較第二個號碼，依此類推，直到比較結束
	 */
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
