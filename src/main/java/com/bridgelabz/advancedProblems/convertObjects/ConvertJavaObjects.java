package com.bridgelabz.advancedProblems.convertObjects;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class ConvertJavaObjects {

    public static class Student {
        @CsvBindByName(column = "ID")
        private int id;

        @CsvBindByName(column = "Name")
        private String name;

        @CsvBindByName(column = "Age")
        private String age;

        @CsvBindByName(column = "Grade")
        private String grade;

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getAge() { return age; }
        public void setAge(String email) { this.age = email; }

        public String getGrade() { return grade; }
        public void setGrade(String grade) { this.grade = grade; }

        @Override
        public String toString() {
            return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Grade=" + grade + "]";
        }
    }

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/advancedProblems/convertObjects/student.csv");

            CsvToBean<Student> csvToBean = new CsvToBeanBuilder<Student>(reader)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Student> students = csvToBean.parse();

            System.out.println("List of Students:");
            for (Student s : students) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
