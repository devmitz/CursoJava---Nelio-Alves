package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class LendoArquivo {
    public static void main(String[] args) {

        String path = "C:\\Users\\aryas\\Downloads\\CursoJava---Nelio-Alves\\214 Lendo arquivos\\application\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
