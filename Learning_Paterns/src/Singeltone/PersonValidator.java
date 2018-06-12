package Singeltone;

public class PersonValidator {
	private static PersonValidator instance = new PersonValidator();
	
	private PersonValidator(){
		
	}
	
	public static PersonValidator instance(){
		return instance;
	}
	
	public boolean validate(Person p){
		return true;
	}

}
