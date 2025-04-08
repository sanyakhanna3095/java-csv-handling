package com.bridgelabz.basicProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSVFile {
    public static void main(String[] args) {
        String path="/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/basicProblems/students.csv";
        try(BufferedReader br=new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine();   //to skip header
            while((line=br.readLine())!=null){
                String[] col=line.split(",");
                System.out.println("ID: "+col[0]+", Name: "+col[1]+", Age: "+col[2]+", Marks: "+col[3]);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
