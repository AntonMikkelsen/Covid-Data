import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private ArrayList<Covid19Data> dataList = new ArrayList<>();

    public void loadCsv(String filePath) {
        File file = new File(filePath);
        System.out.println("Attempting to open file at: " + file.getAbsolutePath());

        try (Scanner sc = new Scanner(file, StandardCharsets.ISO_8859_1)) {
            sc.useDelimiter(";");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(";");

                if (values.length < 7) continue;
                
                String region = values[0];
                String aldersGruppe = values[1];
                int tilfældeIAlt = Integer.parseInt(values[2]);
                int indlagte = Integer.parseInt(values[3]);
                int indlagtePåIntensive = Integer.parseInt(values[4]);
                int døde = Integer.parseInt(values[5]);
                String dato = values[6];

                // Opret nyt Covid19Data objekt
                Covid19Data data = new Covid19Data(region, aldersGruppe, dato, indlagte,tilfældeIAlt, døde, indlagtePåIntensive);
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printDataList() {
        for (Covid19Data data : dataList) {
            System.out.println(data);
        }
    }

    public ArrayList<Covid19Data> getDataList() {
        return dataList;

    }
}