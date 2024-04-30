package p10;

public class Start {

	public static void main(String[] args) {
		Human[] canon = {
				new Human("齋藤",23),
				new Human("本間",24),
				new Human("深沢",25)
		};
//		canon[0]=new Human("齋藤",23);
//		canon[1]=new Human("本間",24);
//		canon[2]=new Human("深沢",25);
		
		for(Human c:canon) {
			c.introduce();
		}
//      Human[] canon = new Human[3];
//		
//		canon[0]=new Human("齋藤",23);
//		canon[1]=new Human("本間",24);
//		canon[2]=new Human("深沢",25);
//
//		

		
		
	}

}
