
package com.jspiders.musicplayer.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.jspiders.musicplayer.object.Song;
import com.jspiders.musicplayer.operation.SongOperation;

public class MusicPlayer {
     static boolean loop=true;
     Song song = new Song();
     SongOperation operation = new SongOperation();
     
	public static void main(String[] args) {
		MusicPlayer  player = new MusicPlayer();
		while (loop) {
			player.player();
			System.out.println("");
		}
	}
	public void player() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose following operatrion;-\n1:-Add/remove\n2:Play song \n3:-Edit a song \n4:Exit");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("choose:\n1:-Add Song \n2:-Remove a song \n3:-Back");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("How many song you want to add");
				choice=scanner.nextInt();
				while (choice>0) {
					try {
						operation.addSong();
					} catch (InputMismatchException e) {
						System.out.println("Wrong input"); 
					}
					System.out.println();
					choice--;
				}
				operation.viewAllSong();
				loop=true;
				break;
			case 2:
				operation.viewAllSong();
				System.out.println(operation.viewAllSong());
				System.out.println("Which song you want to delete Please Select");
				choice=scanner.nextInt();
				operation.deleteSong(choice);
				break;
			case 3:
				player();
				break;
			default :
				System.out.println("Invalid input");
				break;
			}
			break;
	case 2:
		System.out.println("\n choose following operation:- \n1:- Play song \n2: Play random song \n3:-Select song to play \n4:-Back");
		choice=scanner.nextInt();
		switch (choice) {
		case 1:
		    operation.playAllSong();
			break;
		case 2:
		    operation.playRandomSong();
			break;
		case 3:
		    operation.viewAllSong();
		    System.out.println("Choose song:- ");
		    choice=scanner.nextInt();
		    operation.selectSong(choice);
			break;
		case 4:
			player();
			break;
		default:
			System.out.println("Invalid chioce..");
			loop=true;
			break;
		}
		break;
	case 3:
		operation.viewAllSong();
		try {
			operation.editSong();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Wrong input");
		}
		break;
	case 4:
		loop=false;
		System.out.println("Thank you..");
		break;
		default:
			System.out.println("Invalid choice..");
			break;
		}
		
	}

}
