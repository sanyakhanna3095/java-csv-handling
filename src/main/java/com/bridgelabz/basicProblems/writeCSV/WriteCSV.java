package com.bridgelabz.basicProblems.writeCSV;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteCSV {
    public static void main(String[] args) {
        String path="/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/basicProblems/writeCSV/employee.csv";
        try (BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
            bw.write("ID,Name,Department,Salary\n");
            bw.write("104,Alice Williams,Finance,62000\n");
            bw.write("105,Bob Johnson,Sales,58000\n");
            bw.write("106,Sanya Khanna,IT,78000\n");
            bw.write("107,Sehajpreet Kaur,IT,80000\n");
            bw.write("108,Aarush Mahajan,Marketing,58000\n");
            System.out.println("CSV file written successfully!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
