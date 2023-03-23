package computer_test.c;

import java.util.Scanner;

public class P1Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.println("請輸入測試資料個數K：");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			fn(sc.next());
		}
		sc.close();
	}

	static void fn(String testCase) {
		String[] strs = testCase.split("\\s+");
		if (strs[0].equals(strs[1]) && strs[1].equals(strs[2])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
