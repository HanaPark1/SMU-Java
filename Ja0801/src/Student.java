
public class Student {
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	Student(){}
	
	Student(int stuNo, String name) {
		this.stuNo = stuNo;
		this.name = name;
	}
	
	Student(int stuNo, String name, int kor, int eng, int math) {
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total / 3.0;
	}
	
	//생성자를 통해 클래스 복사
	
	Student(Student s) {
		this.stuNo = s.stuNo;
		this.name = s.name;
	}
	
	@Override
	public boolean equals(Object obj) {
//		boolean temp = false;
//		if(this.stuNo == ((Student)obj).stuNo && this.name.equals(((Student)obj).name)) {
//			temp = true;
//		}
		return this.stuNo == ((Student)obj).stuNo;
	}
	
	@Override
	public String toString() {
		return ""+stuNo+"";
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
}
