package computer_test.c;

import java.util.Scanner;
/**
 * 
 * @author river
 * 按照公式答案錯
 */
public class P2Q2 {

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
		String[] strs = str.split("\\s+");
		int p = Integer.parseInt(strs[0]);
		double r = Double.parseDouble(strs[1]);
		int t = Integer.parseInt(strs[2]);
		double f = p * Math.pow(1 + r / 12, t);
		System.out.println(Math.round(f));
	}

}
