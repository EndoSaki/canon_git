package p17;

public class Start {

	public static void main(String[] args) {
		Human h ;
	h= new oku();
	h.name ="奥";
	h.age = 23;
	h.eat();
	oku o = (oku)h;
	o.cook();
	
	h = new kudo();
	h.name ="工藤";
	h.age = 24;
	h.eat();
	//h.listenMusic();
	}

}
