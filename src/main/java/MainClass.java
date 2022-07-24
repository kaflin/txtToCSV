public class MainClass {
    public static void main(String[] args) throws Exception {
        txtToCsv ttc=new txtToCsv();
        csvToJSONArray cja=new csvToJSONArray();
        ttc.textToCSV();
        cja.csvToJSONArray();
    }
}
