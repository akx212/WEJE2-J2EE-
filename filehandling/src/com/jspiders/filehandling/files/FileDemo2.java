package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("E:\\DemoFile2.txt");
		try {
			if (file.exists()) {
				System.out.println("The file is Already Exists");
			} else {
				file.createNewFile();
				System.out.println("File Created Succesfully..");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
