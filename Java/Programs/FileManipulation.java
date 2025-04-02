package Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

        public static void main(String[] args) {
            String fileName = "student_list.txt";
            String wordToRemove = "React";
            ArrayList<String> lines = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;

                while ((line = reader.readLine()) != null) {
                    lines.add(line.replace(wordToRemove, "Python"));
                }
                reader.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                writer.close();

                System.out.println("Word '" + wordToRemove + "' removed successfully!");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
}
