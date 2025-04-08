package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) throws Exception {
        String path="/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/intermediateProblems/studentMarks.csv";

        //using BufferedReader
       /* try(BufferedReader br=new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine();   //to skip header
            while((line=br.readLine())!=null){
                String[] col=line.split(",");
                if(Integer.parseInt(col[3])>80){
                    System.out.println("ID: "+col[0]+", Name: "+col[1]+", Age: "+col[2]+", Marks: "+col[3]);
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */


        //using Open CSV
        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] line;
            reader.readNext();
            while ((line = reader.readNext()) != null) {
                if(Integer.parseInt(line[3])>80){
                    System.out.println("ID: " + line[0] + ", Name: " + line[1] + ", Age: "+ line[2]+", Marks: "+ line[3]);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        }
}
