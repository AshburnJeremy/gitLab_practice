package gitLab_practice;

public class orange {
	String color;
	orange(String color)
	{
	this.color=color;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	orange greenApple = new orange("green");
	String color = greenApple.getColor();
	System.out.println("color of apple is " + color);

	}
	

}
