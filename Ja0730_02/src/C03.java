
public class C03 {

	public static void main(String[] args) {
		Car car = null; // 주소값 - 저장공간 없음
		// 객체 선언 - 저장공간 생김
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null; // 주소값 - 저장공간 없음
		
		Car car2 = new Car();
		
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;

		fe.water();
		car = fe; // (Car)fe; 형변환 생략
		// car.water(); 에러, Car 객체 water 기능이 없움.
		
//		fe2 = (FireEngine)car;
//		fe2.water();
		
//		fe2 = (FireEngine)car2;
//		fe2.water(); // 에러! 물 안 찍음
		
		car = ab;
		if(car instanceof Ambulance ) {
			System.out.println("Ambulance 변경");
		}
		
		if(car instanceof FireEngine ) {
			fe2 = (FireEngine)car;
			System.out.println("FireEngine 변경");
		} else {
			System.out.println("FireEngine 변경 불가");
			System.out.println("형변환하면 안됨");
		}
		
		
//		if (ab instanceof Ambulance) {
//			System.out.println("Ambulance");
//		}
//		
//		if (ab instanceof Car) {
//			System.out.println("Car Ambulance");
//		}
//		
//		if (ab instanceof Object) {
//			System.out.println("Object Ambulance");
//		}
//		fe2 = (FireEngine)car;
	}

}
