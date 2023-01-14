package com.jspiders.filehandling.readwrite;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterFile {

	public static void main(String[] args) {
		File File  = new File("CharaStream.txt");
		try {
			if (File.exists()) {
				System.out.println("file exixts");
			}
			else {
				File.setReadable(true);
				File.setWritable(true);
				File.createNewFile();
				System.out.println("file Ceated..");
				
				FileWriter filewriter =new FileWriter(File);
				filewriter.write("Data sent to the file..");
				System.out.println("content written to file..");
				filewriter.close();
				
				FileReader filereader = new FileReader(File);
				System.out.println(filereader.read());
				System.out.println("content read from file");
				filereader.close();
				
				Scanner scanner = new Scanner(File);
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
