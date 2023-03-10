package com.jspiders.factorypattern.main;

import java.util.Scanner;

import com.jspiders.factorypattern.inter.Movie;
import com.jspiders.factorypattern.movies.KGF2;
import com.jspiders.factorypattern.movies.Kantara;
import com.jspiders.factorypattern.movies.Pushpa;
import com.jspiders.factorypattern.movies.Vikram;

public class MovieMain {
	static boolean loop = true;
	static Movie movie;

	public static void main(String[] args) {
		while (loop) {
			try {
				movieFactory().nowPlaying();
			} catch (NullPointerException e) {
				System.out.println("No movie Selected");
			}
			
		}
	}

	public static Movie movieFactory() {
		System.out.println("Select a movie to watch :\n" + "1. kgf chapter 2\n" + "2. Vikram \n" + "3. Pushpa \n" + "4. Kantara");
		
		Scanner scanner = new Scanner(System.in);
		int choise = scanner.nextInt();
		scanner.close();
		
		switch (choise) {
		case 1:
			movie = new KGF2();
			loop = false;
			return movie;
		case 2:
			movie = new Vikram();
			loop = false;
			return movie;
		case 3:
			movie = new Pushpa();
			loop = false;
			return movie;
		case 4:
			movie = new Kantara();
			loop = false;
			return movie;

		default:
			System.out.println("Invalid choise");
			loop = false;
			return movie;
		}
	}

}
