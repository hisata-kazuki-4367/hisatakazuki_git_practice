package test_project;

public class UseCar {

	public static void main(String[] args) {
		Car c1;
		c1 = new Car();
		
		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";
		
		c1.start();
		c1.curve();
		c1.stop();
		
		System.out.println("c1 のメーカーは" + c1.maker + "です。");
		System.out.println("c1 の色は" + c1.color + "です。");
		
	}

}
