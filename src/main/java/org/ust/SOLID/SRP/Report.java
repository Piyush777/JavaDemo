package org.ust.SOLID.SRP;



//Example of code which follows SRP
public class Report {
    private String content;

    public void generateReport(){
        //code to generate report content
    }
}

class ReportFormatter{
    public String formatReportToHTML(Report report){
        //code to format report to HTML
        return null;
    }

    public String formatReportToPDF(Report report){
        //code to format report to PDF
        return null;
    }
}

class ReportPrinter{
    public void printReport(String formattedReport){
        //code to print report
    }
}




