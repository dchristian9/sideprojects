package org.Teams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteAndReadFile {
    public static void writeFile(String contents, String fileName, boolean appendFile){
        try(PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, appendFile))){
            writer.println(contents);
        } catch (Exception e){
            System.out.println(e.getMessage() + ". Please try again.");
        }
    }

    public static List<String> readFile(String fileName){
        List <String> contents = new ArrayList<>();
        File filePath = new File(fileName);
        try(Scanner scanner = new Scanner(filePath)){
            while(scanner.hasNextLine()){
                String lineOfContents = scanner.nextLine();
                contents.add(lineOfContents);
            }
        } catch (Exception e){
            System.out.println(e.getMessage() + ". Please try again.");
        }
        return contents;
    }
}
