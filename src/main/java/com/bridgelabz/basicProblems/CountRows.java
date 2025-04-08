package com.bridgelabz.basicProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountRows {
    public static void main(String[] args) {
        String path="/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/basicProblems/readCSV/students.csv";
        int cnt=0;

        try(BufferedReader br=new BufferedReader(new FileReader(path))) {
            br.readLine();   //to skip header
            while(br.readLine()!=null){
                cnt++;
            }
            System.out.println(cnt);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
