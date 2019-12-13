package Exam06;

public class Exam06_3_4_5 {
	
		public static void main(String args[]) {
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
		}
		}
		class Student {  //6-3
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		Student(String name, int ban, int no, int kor, int eng, int math) { //6-4
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		}
		int getTotal() { //6-5
		return kor+eng+math;
		}
		float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		}
		 String info() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+getTotal()
		+","+getAverage()
		;
		}
		}
