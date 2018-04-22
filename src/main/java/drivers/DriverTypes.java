package drivers;

public enum DriverTypes {
	FIREFOX("FireFox"), IE("IE"), CHROME("Chrome");
	
	public String driverName;
	
	private DriverTypes(String driverName){
		this.driverName = driverName;
	}
	
	public String getDriverName(){
		return driverName;
	}
}
