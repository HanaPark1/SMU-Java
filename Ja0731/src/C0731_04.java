
public class C0731_04 {

	public static void main(String[] args) {
		Tank t = new Tank();
		t.damage();
		System.out.println("T 체력 : "+t.hitPoint);
		t.damage();
		t.damage();
		Scv s1 = new Scv(); //기계수리가능
		s1.repair(t);
		System.out.println("T 체력 : "+t.hitPoint);
		
		Marine m1 = new Marine();
		m1.damage();
		System.out.println("M 체력 : "+m1.hitPoint);
		m1.damage();
		m1.damage();
		System.out.println("M 체력 : "+m1.hitPoint);
//		s1.repair(m1); //Scv 에게 군인치료
		System.out.println("M 체력 : "+m1.hitPoint);
		

	}

}