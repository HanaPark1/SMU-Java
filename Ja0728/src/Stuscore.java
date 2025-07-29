
public class Stuscore {

	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void stuTotal() {
		total = kor+eng+math;
	}
	
	void stuAvg() {
		avg = (kor+eng+math)/3.0;
	}
}
