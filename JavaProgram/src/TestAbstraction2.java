abstract class Bike
{
Bike()
{
System.out.println("bike is created");	
}
abstract void run();
public void ChangeGear()
{
System.out.println("Gear changed");	
}
}
class Honda extends Bike 
{
	void run()
	{
		System.out.println("Honda is running");
	}
	
}
public class TestAbstraction2 {

	public static void main(String[] args) {
		Bike ob = new Honda();
		ob.run();
		ob.ChangeGear();

	}

}
