package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OnlineMusicPlaylist {
    public static void main(String[] args) {
        ArrayList<String> songNames = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Add Song\n2.Remove Song\n3.DisplayPlaylist\n4.Shuffle Songs");
        System.out.println("Enter you choice:");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Song name:");
                String songAdd = scan.nextLine();
                scan.next();
                songNames.add(songAdd);
                System.out.println("Song added to playlist!");
                break;
            case 2:
                System.out.println("Enter Song name:");
                String songRemove = scan.nextLine();
                songNames.remove(songRemove);
                System.out.println("Song removed from the playlist!");
                break;
            case 3:
                System.out.println(songNames);
                break;
            case 4:
                Collections.shuffle(songNames);
                System.out.println("Song are Shuffled");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }


    }
}
