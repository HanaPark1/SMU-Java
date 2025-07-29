
public class C0728_02 {

	public static void main(String[] args) {
		// Tv 클래스 객체 생성을 해서
		// Tv 색상 pink
		// 채널 7 입력

		Tv t = new Tv();
		t.channel = 7;
		t.color = "pink";
		
		System.out.printf("Tv의 색상: %d\nTv의 채널: %s\n", t.channel, t.color);
		
		Tv t2 = new Tv();
		t2.channel = 5;
		t2.color = "white";
		
		System.out.printf("Tv2의 색상: %d\nTv2의 채널: %s\n", t2.channel, t2.color);
		
		t2 = t;
		System.out.printf("Tv2의 색상: %d\nTv2의 채널: %s\n", t2.channel, t2.color);
		t.channel = 10;
		System.out.printf("Tv2의 색상: %d\nTv2의 채널: %s\n", t2.channel, t2.color);
		
	}

}
