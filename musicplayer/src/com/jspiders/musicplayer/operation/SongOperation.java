package com.jspiders.musicplayer.operation;

import java.util.ArrayList;
import java.util.Scanner;
import com.jspiders.musicplayer.object.Song;

public class SongOperation {
	
	 ArrayList<Song> playList = new ArrayList<Song>();
	
	public ArrayList<Song> addSong(){
		Song song = new Song();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter song Id: ");
		int id =scanner.nextInt();
		song.setId(id);
		
		System.out.println("Enter song Name: ");
		String name = scanner.next();
		song.setName(name);
		
		System.out.println("Enter the Song duration: ");
		float duration = scanner.nextFloat();
		song.setDuration(duration);
		
		System.out.println("Enter the movie Name: ");
		String movie = scanner.next();
		song.setMovie(movie);
		
		System.out.println("Enter the Singer name: ");
		String singer = scanner.next();
		song.setSinger(singer);
		
		System.out.println("Enter the Composer name: ");
		String composer = scanner.next();
		song.setComposer(composer);
		
		System.out.println("Enter the lyrics creater: ");
		String lyrics = scanner.next();
		song.setLyrics(lyrics);
		
		playList.add(song);
		System.out.println("\n songs Added Succesfully..");
		return (ArrayList<Song>) playList;
	}

	public ArrayList<Song> viewAllSong() {
		if (playList.isEmpty()) {
			System.out.println("Sorry Song is not Available..");
		}else {
			System.out.println("List of All Songs:- ");
			for(int i=0;i<playList.size();i++) {
				System.out.println(i+1+ ":" + playList.get(i));
			}
		}
		return playList;
	}
	
	public void playAllSong() {
		for(int i=0 ;i < playList.size(); i++) {
			System.out.println("Now " + playList.get(i) +"Song Playing");
			try {
				Thread.sleep(1500);
				System.out.println("");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void playRandomSong() {
		if (playList.isEmpty()) {
			System.out.println("Sorry song is not Found..");
		}else {
			for(int i=0;i<playList.size();i++) {
				int random=(int)(Math.random()*10);
				if (random<playList.size()) {
					System.out.println("Now" + playList.get(random)+"Song playing");
					try {
						Thread.sleep(2000);
						System.out.println("");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void selectSong(int choice) {
		System.out.println("now" + playList.get(choice-1) + "Song playing..");
		try {
			Thread.sleep(2000);
			System.out.println("");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void deleteSong(int choice) {
		if (playList.isEmpty()) {
			System.out.println("Sorry song is not Found..");
		}else {
			if (choice<=playList.size()) {
				System.out.println(playList.get(choice-1)+ "Delete Succesfully..");
				playList.remove(choice-1);
			}else {
				System.out.println(choice + "is not present in the List");
			}
		}
	}
	public void editSong() {
		if (playList.isEmpty()) {
			System.out.println("Sorry song is not Available..");
		}else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Which song you want to edit:- ");
			int songNo= scanner.nextInt();
			System.out.println("What you want to edit:- ");
			System.out.println("\n1: id\n2: song Name \n3: movie/Album Name \n4: composer \n5:duration \n6:lyrics Creater \n7;back");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter song id: ");
				playList.get(songNo-1).setId(scanner.nextInt());
				break;
			case 2:
				System.out.println("Enter song name: ");
				playList.get(songNo-1).setName(scanner.next());
				break;
			case 3:
				System.out.println("Enter song movie/album: ");
				playList.get(songNo-1).setMovie(scanner.next());
				break;
			case 4:
				System.out.println("Enter song Composer Name: ");
				playList.get(songNo-1).setComposer(scanner.next());
				break;
			case 5:
				System.out.println("Enter song Duration: ");
				playList.get(songNo-1).setDuration(scanner.nextFloat());
				break;
			case 6:
				System.out.println("Enter song lyrics creater Name: ");
				playList.get(songNo-1).setLyrics(scanner.next());
				break;
			default:
				System.out.println("Invalid choice?");
				break;
			}
			System.out.println("Update Succesfully..");
		}
	}
}
