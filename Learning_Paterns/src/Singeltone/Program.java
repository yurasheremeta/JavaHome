package Singeltone;

public class Program {
	
	public static void main(String[] args) {
		Person.Builder pb = Person.Builder.instance();
		Person p = pb.create().name("Yura").lastname("Sheremeta").gender("Male").year(20).weight(90).build();
		System.out.println(p);
		Person p1 = pb.create().name("Anna").lastname("Vasa").gender("Female").year(21).weight(55).build();
		System.out.println(p1);
		
		//PersonValidator p1 = PersonValidator.instance();
	}	

}
