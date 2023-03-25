package computer_test.c;

import java.util.Scanner;

public class P1Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 建立 Scanner 物件
		sc.useDelimiter("\n"); // Scanner 物件設定分隔符為換行符號，在 Windows 這裡應該改成 \r\n
		System.out.println("請輸入測試資料個數K：");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			// sc.next() 會請 User 在 console 中輸入訊息，並將其收集後轉化成字串
			// 預設的分隔符是空白鍵，上面的 useDelimiter 就是把預設的分隔符改成換行鍵
			// 否則如果輸入 "1 2 3"，因為中間用空白鍵隔開，Java 會一次只拿其中一個元素
			String input = sc.next();
			/*
			 * 呼叫方法 void fn(String s)
			 * fn 有一個參數，參數型別是 String，無回傳值(void代表無回傳值)
			 * 因此我們把剛剛宣告的 input 當成參數丟給 fn 方法，請它幫我們處理我們想做的事情
			 * 
			 * 我們想做的事情是什麼？就是完成執行「豹子」這項程式作業！
			 */
			fn(input);
		}
		sc.close(); // 建議加上這行
	}

	/*
	 * 方法名稱為 fn (叫什麼都可以！是為了方便呼叫)
	 * 因此在 24 行，我們寫上 fn (???) 來呼叫這個方法
	 * fn 就是這個方法的「識別符」，我們要呼叫這個方法，就要寫它的名稱來呼叫！
	 * 就像我們給小貓取名叫喵喵，那以後我們叫喵喵過來，那麼喵喵就會走過來一樣的道理。
	 * 
	 * 參數：我們只設一個參數，定為 String 型別，並給該參數一個名稱 s。這其實就像是我們在宣告變數一樣，不過這個變數的值是「從外部傳給方法的」！
	 * 也就是說我們可以看到 24 行，傳了一個「String 型別」的東東，這東東可以是變數也是可以是字面量，只要他是「String 型別」就 OK！
	 * 在第 24 行，我們可以看到傳了 input 這個「變數」，在 24 行時，那個東東名字還叫做 input
	 * 但是我們方法在傳遞的時候，我們只會把值丟過來（暫時這樣理解）。
	 * 因此，丟過來的時候，我們會需要「重新為這個字串命名」
	 * 我們重新命名它為 s，所以在 fn 這個方法中，我們就可以用 s 這個變數，來使用原本從 24 行傳過來的 input 字串。
	 * 嚴格意義來說，s 和 input 是完全相同的東西！
	 * 
	 * 更正確的說，在 16 行時，宣告了一個 input 的變數
	 * 因此，在 12 行的那個 block 中，多存在了一個變數名叫 input。
	 * 在 24 行，我們呼叫了 fn 方法，把 input 丟給 fn
	 * fn 方法把接收的這個參數 input 再指定給了新的變數 s
	 * 因此，在 fn 這個方法的 block 中，只能是存取 s 而不是存取 input。
	 * （不同的 block 之間參數是不能互相存取的，因此我們是用「傳參」的方法實現把某個東西的值丟到另一個 block）
	 * 
	 * 最後，回傳值是 void ，代表該方法不回傳任何東西。
	 */

	/**
	 * 1. 每組輸入會有3個數字，如果3個數字相同印出 Yes，否則印出 No
	 * 2. 可以直接撿查：第1個數字和第2個數字且第2個數字和第3個數字是否相等
	 * 2.1 如果條件成立，印出 Yes
	 * 2.2 否則印出 No
	 */
	static void fn(String s) {
		String[] strs = s.split("\\s+"); // "\\s"是寫空白鍵的比較正式的寫法，"\\s+"代表可以一次 match 多個空白鍵（對解題不重要）
		if (strs[0].equals(strs[1]) && strs[1].equals(strs[2])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
