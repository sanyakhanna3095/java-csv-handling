package com.bridgelabz.intermediateProblems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SearchRecord {
    public static void main(String[] args) {
        String path="/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-csv-handling/src/main/java/com/bridgelabz/basicProblems/writeCSV/employee.csv";
        String searchName = "sanya khanna";

        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            List<String[]> employeeRecords = reader.readAll();

            for (int i = 1; i < employeeRecords.size(); i++) {
                String[] record = employeeRecords.get(i);
                if (record[1].trim().equalsIgnoreCase(searchName.trim())) {
                    System.out.println("Name: "+record[1]);
                    System.out.println("Department: " + record[2]);
                    System.out.println("Salary: " + record[3]);
                }
            }
        }
        catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
