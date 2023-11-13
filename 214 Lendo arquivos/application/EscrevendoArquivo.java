package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoArquivo {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\aryas\\Downloads\\CursoJava---Nelio-Alves\\214 Lendo arquivos\\application\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
