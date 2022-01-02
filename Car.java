package objectClassInstance;

public class Car {
		String name;
		int currentSpeed;
		int currentGear;
		
		void startEngine() {
			System.out.println("->" + name + "의 시동을 켠다.");
			currentSpeed = 1;
		}
		
		void changeGear(int gear) {
			System.out.println("-> 기어를" + gear + "단으로 변경한다.");
			currentGear = gear;
		}
		
		int getCurrentSpeed() {
			currentSpeed = currentSpeed + (currentGear*10);
			return currentSpeed;
		}
		
		void stopEngine() {
			System.out.println("->" + name + "의 시동을 끈다.");
			currentSpeed = 0;
		}
		
		String getCurrentState() {
			return name + "의 현재속도 : " + getCurrentSpeed();
		}
		
	}
