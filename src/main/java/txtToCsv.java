import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class txtToCsv {
    public void textToCSV() {
        final File input = new File("verisk.txt");
        List<String> output = new ArrayList<>();
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                output.add(line.replaceAll(" ", ","));
            }

            reader.close();
            System.out.println("Converting Text file to CSV file");

            writer = new BufferedWriter(new FileWriter(new File("verisk.csv")));
            for (String s : output) {
                writer.write(s);
                writer.newLine();
            }

            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
