package p29;

public class Sumple11 {
	

		public static void main(String[] args)   {
			
			
//		try {
//			throw new NumberFormatException("エラー");
//		}catch(Exception e) {
//			System.out.println("error");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}finally {
//			System.out.println("例外処理終了");
//		}
//		System.out.println("終了");
		try {
			System.out.println(waru(10,0));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
		public static int waru(int x,int y) throws Exception {
			if(y == 0) {
				throw new Exception("0で割れない");
			}
			return x/y;
		}
}
