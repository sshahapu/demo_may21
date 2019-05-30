package hello;


public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Entering Main method ");
		
		GreetingSai greetingSai = new GreetingSai();
		GreetRasagna greetRasagna = new GreetRasagna();
		System.out.println(greetingSai.helloFromSai());
		System.out.println(greetRasagna.helloFromRasagna());
		
	}
}