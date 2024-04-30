package p14;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラスのインスタンスを生成
		Mobile m = new Mobile("090-6666-4444","Canon");
		
		 //フィールドとメソッドにアクセス
//		m.setTelNo ("090-6666-4444");
//		m.setMaker ("Canon");
//		
		m.talk();
		m.takePicture();
		
		
	}

}
