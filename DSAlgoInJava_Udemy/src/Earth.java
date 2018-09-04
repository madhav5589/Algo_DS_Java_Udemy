
public class Earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Human madhav = new Human();
		madhav.name = "Madhav Patel";
		madhav.age = 27;
		madhav.height = 77;
		madhav.eyeColor = "Black";
		
		madhav.speak();*/
		
		Human madhav = new Human("Madhav", 27, 79, "Black");
		Human darshita = new Human("Darshita", 24, 74, "Black");
		
		madhav.speak();
		darshita.speak();

	}

}
