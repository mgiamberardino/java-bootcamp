package topic0.point3;

import java.util.Date;

public abstract class Hospital implements IPrototype{

	protected String pais;
	protected String estado;
	protected String ciudad;
	protected Date fechaApertura;
	public Hospital(String pais, String estado, String ciudad, Date fechaApertura) {
		super();
		this.pais = pais;
		this.estado = estado;
		this.ciudad = ciudad;
		this.fechaApertura = fechaApertura;
	}
	
	
	public Hospital() {
		super();
	}


	public abstract String getTipo();
	public abstract void listPatients();
	
	@Override
	public Hospital doClone() {
		// TODO Auto-generated method stub
		return new AnimalHospital(pais, estado, ciudad, fechaApertura);
	}
}
