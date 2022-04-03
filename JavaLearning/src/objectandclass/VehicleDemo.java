package objectandclass;

class vehicle{
	String vehicleName;
	int vehicleId;
}

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v = new vehicle();
		v.vehicleName = "car";
		v.vehicleId = 5424;
		System.out.println(v.vehicleName + v.vehicleId);
	}

}
