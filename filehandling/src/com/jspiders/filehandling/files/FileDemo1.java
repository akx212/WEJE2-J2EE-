package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("E:DemoFile1.txt");
		try {
			file.createNewFile();
			System.out.println("Files created succesfully..");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
