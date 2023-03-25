package computer_test.c;

import java.util.Scanner;

public class P01Q2 {

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
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
			if (i != 0) {
				sb.append(",");
			}
		}
		System.out.println(sb.toString());
	}

}
