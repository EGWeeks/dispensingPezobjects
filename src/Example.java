
public class Example {
	public static void main(String[] args) {
		System.out.println("We are going to make a new Pez dispenser");
		PezDispenser dispenser = new PezDispenser("Superman");
		System.out.printf("The dispenser character is %s \n", dispenser.getCharacterName() );
		
		System.out.printf("%s has %s pez left \n", dispenser.getCharacterName(), dispenser.getPezCount());
		if(dispenser.isEmpty()) {
			System.out.println("It is currently empty");
		}
		System.out.println("Loading...");
		dispenser.load();
		if(!dispenser.isEmpty()) {
			System.out.printf("Pez Dispenser has %s", dispenser.getPezCount());
		}
	}
}
