package edu.pafiast.codesmells.ooabusers.tempfields.good;

public class ReportGenerator {

    private String reportData;

    public void generateReport() {
        String processedData = processData(reportData);
        System.out.println(processedData);
    }

    private String processData(String data) {
        return data.toUpperCase();
    }
}