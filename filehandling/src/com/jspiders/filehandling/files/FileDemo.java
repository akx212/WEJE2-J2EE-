package com.jspiders.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("DemoFile.exe");
		try {
			file.createNewFile();
			System.out.println("Files created succesfully..");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
