package ex04.quiz;

public class Airplane {
	private IBattery battery;
	//생성자 주입
	public IBattery getBattery() {
		return battery;
	}

	public void setBattery(IBattery battery) {
		this.battery = battery;
	}
	
	
	

}
