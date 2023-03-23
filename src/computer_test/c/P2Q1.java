package computer_test.c;

import java.util.Scanner;

public class P2Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.println("請輸入測試資料個數K：");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			String testCase = sc.next();
			fn(testCase);
		}
		sc.close();
	}

	static void fn(String str) {
		if (str.length() > 3 && helper(str, 0) && helper(str, 1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static boolean helper(String str, int start) {
		int len = str.length();
		for (int i = start; i < len - 2; i += 2) {
			if (str.charAt(i) != str.charAt(i + 2)) {
				return false;
			}
		}
		return true;
	}

}
