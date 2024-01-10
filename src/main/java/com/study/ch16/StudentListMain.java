package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김준일", 31));
        students.add(new Student("김준이", 32));
        students.add(new Student("김준삼", 33));
        students.add(new Student("김준사", 34));

        System.out.println(students);

        Student s = new Student("aaa", 10);
        s.setAge(s.getAge() + 1);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge() + 1);
        }

        // 향상된 for (처음부터 끝까지 반복 함)
        for(Student student : students) {
            student.setAge(student.getAge() + 1);
        }

        System.out.println(students);

        // lambda 식 for 문
//        students.forEach(student -> student.setAge(student.getAge() + 1));

        Student[] studentArray = new Student[4];
        for (int i = 0; i < studentArray.length; i++) {
            // 향상된 for 문에서 student = new Student("김준일", 31); 랑 같다.
//            Student student;
//            student = new Student("김준일", 31);
            studentArray[i] = new Student("김준일", 31);
        }

        // 향상된 for 문을 이런식으로 쓸거면 그냥 위에 for 문을 쓰자.
        int i = 0;
        for (Student student : studentArray) {
            studentArray[i] = new Student("김준일", 31);
            i++;
        }

        for(Student student : studentArray) {
            System.out.println(student);
        }

        // get 주소값에 new 주소값을 넣을 수는 없다.
//        students.get(0) = new Student("김준일", 31);
        // set 으로 값주입을 한다.
        students.set(0, new Student("김준일", 31));
    }
}
