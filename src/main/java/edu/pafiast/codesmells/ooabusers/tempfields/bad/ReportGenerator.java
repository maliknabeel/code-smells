package edu.pafiast.codesmells.ooabusers.tempfields.bad;

public class ReportGenerator {
    private String reportData;
    private String temporaryData; // Only used in one method

    public void generateReport() {
        temporaryData = processData(reportData);
        System.out.println(temporaryData);
    }

    private String processData(String data) {
        return data.toUpperCase();
    }
}