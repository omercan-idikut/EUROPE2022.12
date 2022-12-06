package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
      //  File deletedFile=new File("doc"+File.separator+"test-automation-2022-11-11-17-55-47-108.txt");
        //boolean isFileDeleted=FileUtils.deleteQuietly(deletedFile);
       boolean isFileDeleted= FileUtils.deleteQuietly(new File("doc"+File.separator+
                "test-automation-2022-11-11-17-55-47-108.txt"));
        System.out.println("File deleted is:"+isFileDeleted);
    }
}
