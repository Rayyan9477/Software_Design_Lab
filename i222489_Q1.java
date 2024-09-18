import java.io.*;


public class i222489_Q1 {
    public static void main(String[] args) {

        String sourceFilename = "rayyan.txt";
        String destinationFilename = "i222489.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilename));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilename))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully from " + sourceFilename + " to " + destinationFilename);
        } catch (IOException e) {
            System.err.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}