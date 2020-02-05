package javaprograms;

public class PersonalInfo {

	

	String fname;
	String lastname;
	int age ;
	Boolean isretirement;
	
	public Boolean iseligibleforretirement() {
		
		if(age>58)
			return true;
		else 
			return false;
		
	}
}
