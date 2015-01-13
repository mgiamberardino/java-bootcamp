package topic0.point3;

import java.util.Date;

public class AnimalHospital extends Hospital {

	public AnimalHospital(String pais, String estado, String ciudad, Date fechaApertura) {
		super(pais, estado, ciudad, fechaApertura);
		// TODO Auto-generated constructor stub
	}

	public AnimalHospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getKind() {
		// TODO Auto-generated method stub
		return "Animal";
	}

	@Override
	public void listPatients() {
		// TODO Auto-generated method stub

	}

}
