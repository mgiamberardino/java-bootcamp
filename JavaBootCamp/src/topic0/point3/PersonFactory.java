package topic0.point3;

import java.sql.Date;

public class PersonFactory {

	
	/*
	 * Returns a person of the indicated type
	 * If the type is a doctor, it'll be a general practitioner
	 * @param type the type of the person that the factory must to build
	 */
	public Person getPerson(String type){
		if (type.equals("patient")){
			Patient p = new Patient(new Date(System.nanoTime()));
			return p;
		} else if (type.equals("doctor")){
			Doctor d = new Doctor("GP");
			return d;
		}
		return null;
	}
	
	
}
