package Home2;

public class Program {
	public static void main(String[] args) {
		Pet[] pet = {new Cat("Duska"),
		  new Dog("Buldogb"),
		  new Cat("Vasa"),
		  new Dog("Bob"),
		  new Dog("dog"),
		  new Cow("buronka"),
		  new Cow("Zorka")
		};
		for (int i = 0; i < pet.length; i++) {
			pet[i].voice();
			//System.out.println(pet[i]);
		}
//		pet.voice();
//		pet1.voice();
	}

}
