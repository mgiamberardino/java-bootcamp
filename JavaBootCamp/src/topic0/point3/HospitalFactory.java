package topic0.point3;

import java.util.Date;

public class HospitalFactory {
	
	public Hospital getHospital(String kind){
		Hospital hos = null;
		if(kind.equals("Animal"))
			hos = new AnimalHospital();
		else if (kind.equals("Human"))
			hos = new HumanHospital();
		return hos;
	}
	
}
