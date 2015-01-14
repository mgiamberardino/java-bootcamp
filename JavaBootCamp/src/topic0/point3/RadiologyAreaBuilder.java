package topic0.point3;

public class RadiologyAreaBuilder implements IAreaBuilder {

	private Area area;
	
	public RadiologyAreaBuilder(){
		area = new Area();
	}

	@Override
	public void buildEquipment() {
		area.setBloodAnalysisEquipment(false);
		area.setRadiologyEquipment(true);
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
