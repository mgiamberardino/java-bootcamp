package topic0.point2;

public class HouseDirector {
	
	private HouseBuilder builder;
	
	public HouseDirector(HouseBuilder builder) {
		super();
		this.builder = builder;
	}

	public House getHouse(){
		builder.buildBathRooms();
		builder.buildFloors();
		builder.buildGarage();
		builder.buildRooms();
		builder.calculateM2();
		return builder.buildHouse();
	}
	
}
