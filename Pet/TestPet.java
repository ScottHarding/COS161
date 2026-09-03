
public class TestPet {
	public static void main(String[] args) {
		Pet snake0 = new Snake();
		Pet snake1 = new Snake("humans","nocturnal","venomous","slithering");
		Pet cat0 = new Cat();
		Pet cat1 = new Cat("Longhair");
		Pet pets[] = {snake0, snake1, cat0, cat1};
		for( Pet pet : pets) {
			System.out.println("Pet Diet: " + pet.getDiet());
		}
		for( Pet pet : pets) {
			//downcasting
			if(pet instanceof Cat mycat ) {
				System.out.println("Pet Hair: " + mycat.getHairLength());
				}
		}
	}

}
