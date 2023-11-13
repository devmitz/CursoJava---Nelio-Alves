package application;

import java.io.File;
import java.util.Scanner;

public class FolderPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); // lista apenas quem for pastas

        // pastas
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }


        // arquivos
        File[] files = path.listFiles(File::isFile); // lista apenas quem for arquivos
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }


        // criando pasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created success " + success);

        sc.close();
    }
}
