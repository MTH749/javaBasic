package i_collection;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Score {

    public static void main(String[] args) {

        System.out.println("석차" + "\t" + "이름" + "\t" + "Java" + "\t"
                + " Oracle" + "\t" + "HTML" + "\t" + "CSS" + "\t" + "JQuery"
                + "\t" + "JSP" + "\t" + "총점" + "\t" + "평균");
       
        ArrayList<String> name = new ArrayList<String>(); //이름 생성
        name.add("김지선");
        name.add("이누리");
        name.add("박종민");
        name.add("정대석");
        name.add("정재영");
        name.add("강현철");
        name.add("주향한");
        name.add("강현지");
        name.add("연은주");
        name.add("이병훈");
        name.add("구한나");
        name.add("박진영");
        name.add("이승재");
        name.add("민태홍");
        name.add("이지형");
        name.add("정보람");
        name.add("김령환");
        name.add("윤창훈");
        name.add("백종빈");
        name.add("이예림");
        name.add("김경운");
   
         //과목별 점수 및 합계, 평균 생성
        ArrayList <String> subject_1 = new ArrayList<String>();
        ArrayList <String> subject_2 = new ArrayList<String>();
        ArrayList <String> subject_3 = new ArrayList<String>();
        ArrayList <String> subject_4 = new ArrayList<String>();
        ArrayList <String> subject_5 = new ArrayList<String>();
        ArrayList <String> subject_6 = new ArrayList<String>();
        ArrayList <String> sum = new ArrayList<String>();
        ArrayList <String> avg = new ArrayList<String>();
       
        for (int i = 0; i < name.size(); i++) {
            int temp_1 = (int) (Math.random() * 50) + 50;
            int temp_2 = (int) (Math.random() * 50) + 50;
            int temp_3 = (int) (Math.random() * 50) + 50;
            int temp_4 = (int) (Math.random() * 50) + 50;
            int temp_5 = (int) (Math.random() * 50) + 50;
            int temp_6 = (int) (Math.random() * 50) + 50;
           
            subject_1.add( Integer.toString(temp_1));
            subject_2.add( Integer.toString(temp_2));
            subject_3.add( Integer.toString(temp_3));
            subject_4.add( Integer.toString(temp_4));
            subject_5.add( Integer.toString(temp_5));
            subject_6.add( Integer.toString(temp_6));
            sum.add(Integer.toString( temp_1 + temp_2 + temp_3 + temp_4
                    + temp_5 + temp_6));
            avg.add (Double.toString((temp_1 + temp_2 + temp_3 + temp_4
                    + temp_5 + temp_6) / 6));
                   
        }
        //석차 생성
        ArrayList<String> rank = new ArrayList<String>();
       
        for(int i = 0; i < name.size(); i++){
            rank.add(Integer.toString(i+1));
        }   
        //석차 정렬
        for (int i = 0; i < name.size(); i++) {
            for (int j = i + 1; j < name.size(); j++) {

                if (Integer.parseInt(rank.get(i)) > Integer.parseInt(rank.get(j))) {

                    String temp = rank.get(i);
                    rank.set(i, rank.get(j));
                    rank.set(j, temp);
                   
                }else if(Integer.parseInt(rank.get(i)) == Integer.parseInt(rank.get(j))){
                   
                    String temp = rank.get(i);
                    rank.set(i, rank.get(j));
                    rank.set(j, temp);
                   
                }
            }
        }
        //과목별 점수 및 합계,평균 정렬
        for (int i = 0; i < name.size(); i++) {
            for (int j = 0; j < name.size(); j++) {
                if (Integer.parseInt(sum.get(i)) > Integer.parseInt(sum.get(j))) {
                   
                    String temp = name.get(i);
                    name.set(i,name.get(j));
                    name.set(j,temp);

                    temp = subject_1.get(i);
                    subject_1.set(i, subject_1.get(j));
                    subject_1.set(j, temp);

                    temp = subject_2.get(i);
                    subject_2.set(i, subject_2.get(j));
                    subject_2.set(j, temp);

                    temp = subject_3.get(i);
                    subject_3.set(i, subject_3.get(j));
                    subject_3.set(j, temp);

                    temp = subject_4.get(i);
                    subject_4.set(i, subject_4.get(j));
                    subject_4.set(j, temp);

                    temp = subject_5.get(i);
                    subject_5.set(i, subject_5.get(j));
                    subject_5.set(j, temp);

                    temp = subject_6.get(i);
                    subject_6.set(i, subject_6.get(j));
                    subject_6.set(j, temp);

                    temp = sum.get(i);
                    sum.set(i, sum.get(j));
                    sum.set(j, temp);
                   
                    temp = avg.get(i);
                    avg.set(i, avg.get(j));
                    avg.set(j, temp);
                }
            }
        }
       
        for (int i = 0; i < name.size(); i++) { //최종 출력
            System.out.println(rank.get(i) + "\t" + name.get(i) + "\t" + subject_1.get(i)
                    + "\t" + subject_2.get(i) + "\t" + subject_3.get(i) + "\t" + subject_4.get(i)
                    + "\t" + subject_5.get(i) + "\t" + subject_6.get(i) + "\t" + sum.get(i)
                    + "\t" + avg.get(i));
        }
    }
}