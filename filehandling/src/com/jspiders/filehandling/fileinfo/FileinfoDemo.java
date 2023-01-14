package com.jspiders.filehandling.fileinfo;

import java.io.File;

public class FileinfoDemo {

	public static void main(String[] args) {
		File file =new File("DemoFile.txt");
		if (file.canRead()) {
			System.out.println("file is Readable");
		}
		else {
			System.out.println("file is not Readable");
		}
        if (file.canWrite()) {
			System.out.println("file is writeable");
		} else {
            System.out.println("file is not writeable");
		}
        if (file.canExecute()) {
			System.out.println("file is executable");
		} else {
            System.out.println("file is not exeutable");
		}
      //  System.out.println(file.length());
	}

}
