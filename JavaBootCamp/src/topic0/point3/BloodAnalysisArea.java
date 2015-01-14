package topic0.point3;

public class BloodAnalysisArea implements IAreaBuilder {

	protected Area area;
	
	public BloodAnalysisArea() {
		area = new Area();
	}
	
	@Override
	public void buildEquipment() {
		area.setBloodAnalysisEquipment(true);
		area.setRadiologyEquipment(false);
	}

	@Override
	public void buildWards() {
		area.setHasHospitalWards(false);
	}

	@Override
	public void buildComplexity() {
		area.setHighComplexity(false);
	}

	@Override
	public void buildRooms() {
		area.setNmbRooms(4);
	}

}
