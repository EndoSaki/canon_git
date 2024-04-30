package p01;

public class Sample29 {
	public static void main(String[] args) {
		int[] list= {10,20,30};
		
		kudo(list);
		
		int[] ary= endo();
		for(int date:ary) {
			System.out.println(date);}
	}


	static void kudo(int[] list) {
		for(int date:list) {
			System.out.println(date);
	
		}
		
	}

	static int[] endo() {
		int[] ary= {100,200,300};
		
		return ary;

	}

}
