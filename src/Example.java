
public class Example {
	public static void main(String[] args) {
		System.out.println("We are going to make a new Pez dispenser");
		PezDispenser dispenser = new PezDispenser("Superman");
		System.out.printf("The dispenser character is %s \n", dispenser.getCharacterName() );
		dispenser.load();
		System.out.printf("%s has %s pez left", dispenser.getCharacterName(), dispenser.getPezCount());
	}
}
