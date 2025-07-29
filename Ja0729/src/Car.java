
public class Car {
	String color;
	String gearType;
	int door;
	int door_size;
	
	Car(){
		this("white","auto",5); // 다른 생성자를 지정할 때 this()
	} // 기본생성자 - 자동생성
	
	Car(String color, String gearType, int door) {
		this.color = color; // this를 붙이면 인스턴스 변수를 가리킴 / 안 붙이면 지역변수만 가리킴
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c){
		this(c.color, c.gearType, c.door); // 다른 생성자를 지정할 때 this()
	}
}
