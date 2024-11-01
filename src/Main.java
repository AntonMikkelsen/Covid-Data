public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        fileHandler.loadCsv("src/Covid19Data.txt");

        fileHandler.printDataList();
    }
}
