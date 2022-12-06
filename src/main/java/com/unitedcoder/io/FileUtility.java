package com.unitedcoder.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    public void writeToFile(String fileFolder, String fileName, String fileExtension, String fileContent) {
        //create a folder if the folder does not exist
        String workingDirectory = System.getProperty("user.dir"); //return current working folder
        String finalDirectory = workingDirectory + File.separator + fileFolder; //folder of the file
        //what if the folder does not exist
        File file = new File(finalDirectory);
        if (!file.exists()) {
            file.mkdir();  //create the folder
        }
        System.out.println(finalDirectory);
        //final file name
        String finalFileName = finalDirectory + File.separator + fileName + fileExtension; //final file
        //write content to the file
        File myFile = new File(finalFileName);
        FileWriter fileWriter = null; //create a fileWriter object instance
        try {
            fileWriter = new FileWriter(myFile.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //write content using buffer
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write(fileContent);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
