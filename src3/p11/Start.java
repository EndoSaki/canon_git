package p11;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラスのインスタンスを生成
		Mobile m = new Mobile();
		
		 //フィールドとメソッドにアクセス
		m.telNo = "090-6666-4444";
		m.maker = "Canon";
		
		m.talk();
		m.takePicture();
		
		
	}

}
