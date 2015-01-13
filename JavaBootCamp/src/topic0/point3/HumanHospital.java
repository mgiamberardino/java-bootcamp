package topic0.point3;

import java.util.Date;

public class HumanHospital extends Hospital {

	public HumanHospital(String pais, String estado, String ciudad, Date fechaApertura) {
		super(pais, estado, ciudad, fechaApertura);
		// TODO Auto-generated constructor stub
	}
	
	public HumanHospital() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String getKind() {
		// TODO Auto-generated method stub
		return "Human";
	}

	@Override
	public void listPatients() {
		// TODO Auto-generated method stub

	}

	@Override
	public Hospital doClone() {
		// TODO Auto-generated method stub
		return null;
	}

}
