
public class Human {
	String name;
	int age;
	int height;
	String eyeColor;
	
	
	
	public Human(String name, int age, int height, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
	}



	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am " + height + " inches tall");
		System.out.println("My eye color is " + eyeColor);
	}
	

}
