abstract class vegetable{
	String veg_color;

	abstract void tostring();
}

class potato extends vegetable{
	void tostring(){
		veg_color = "Potato color : Brown";
		System.out.println(veg_color);
	}
}

class bringle extends vegetable{
	void tostring(){
		veg_color = "Bringle color : Purpel";
		System.out.println(veg_color);
	}
}

class tomato extends vegetable{
	void tostring(){
		veg_color = "Tomato color : Red";
		System.out.println(veg_color);
	}
}

public class First{
	public static void main(String[] args) {
		vegetable v = new potato();
		vegetable v2 = new bringle();
		vegetable v3 = new tomato();
		v.tostring();
		v2.tostring();
		v3.tostring();
	}
}