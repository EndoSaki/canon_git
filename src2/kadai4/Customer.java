package kadai4;

public class Customer {
	String name;
	int id ;
	
	void setData(int x, String y) {
		 name = y;
		 id = x;			
	}

	 void setData(String y) {
		 name = y;
	}

	void showData() {
		System.out.println( id + ":" +name );
	}
}
