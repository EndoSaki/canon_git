package kadai4;

public class Convert {
	// フィールド（名前と価格を定義する）

	
	static void reverse(int x) {
		String a = Integer.toString(x);
		String result = "";
		for(int i =0;i < a.length();i ++) {
			result = a.charAt(i) + result;
		}
		System.out.println(result);
			
	 }
	 static void reverse(double y) {
		 String a = String.valueOf(y);
			String result = "";
			for(int i =0;i < a.length();i ++) {
				result = a.charAt(i) + result;
			}
			System.out.println(result);
		 }
	 
	static void reverse(String z) {
		String result = "";
		for(int i =0;i < z.length();i ++) {
			result = z.charAt(i) + result;
		}
		System.out.println(result);
	}
}
