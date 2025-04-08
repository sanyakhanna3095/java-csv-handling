package com.bridgelabz.intermediateProblems.modifyFile;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.*;
import java.io.*;
import java.util.List;

public class ModifyCSV {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/basicProblems/writeCSV/employee.csv"));
            CSVWriter writer = new CSVWriter(new FileWriter("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/intermediateProblems/modifyFile/updated_employee.csv"))){
            String[] header;
            header = reader.readNext();
            writer.writeNext(header);
            String[] read;
            while((read = reader.readNext())!=null){
                if(read[2].equals("IT")){
                    double salary = Double.parseDouble(read[3]);
                    salary = salary*1.10;
                    read[3] = String.valueOf(salary);
                }
                writer.writeNext(read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}