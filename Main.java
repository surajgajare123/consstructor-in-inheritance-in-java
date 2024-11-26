class Base{
    Base(){
        System.out.println("I am a constructor of Base class!.....");
}
}
class Derived extends Base{
    Derived(){
    System.out.println("I am a constructor of Derived class!....");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		// Base b = new Base();// run only base class constructor
		Derived d = new Derived(); // run both class constructor
		
	}
}
