package javaassignment3;

import java.time.LocalDate;
import java.util.
import java.util.*;
import java.util.stream.Collectors;

public class MediaApp {

	static List<Song> songs = new ArrayList<>();

	// 1.1 ADD SONG
	public static void addSong(Song song) {
		songs.add(song);
	}

	// 1.2 REMOVE SONG
	public static void removeSong(int serialNo) {
		Iterator<Song> iterator = songs.iterator();
		while (iterator.hasNext()) {
			Song song = iterator.next();

			if (song.getSerialNo() == serialNo) {
				iterator.remove();
				System.out.println("Song removed.");
				return;
			}
		}
		
		System.out.println("Song not found.");
	}

	// 1.3 UPDATE SONG
	public static void updateSong(int serialNo, String title, Set<String> artists, int releaseYear, double rating) {
		for (Song song: songs) {
			if (song.getSerialNo() == serialNo) {
				song.setTitle(title);
				song.setArtists(artists);
				song.setReleaseYear(releaseYear);
				song.setRating(rating);
				System.out.println("Song updated.");
				return;
			}
		}
		
		System.out.println("Song not found.");
	}
	
	// 1.4 DISPLAY SONGS
	public static void displaySongs() {
		for(Song song: songs) {
			System.out.println(song);
		}
	}
	
	// 2. SORT SONGS BY TITLE
	public static void sortByTitle() {
		songs.sort(
                Comparator.comparing(Song::getTitle)
        );

        System.out.println("Songs sorted by title.");
	}
	
	// 3. SEARCH SONG BY TITLE
	public static void searchByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Song found:");
                System.out.println(song);
                return;
            }
        }
        System.out.println("Song not found.");
    }
	
	// 4. SONGS RELEASED IN CURRENT YEAR
    public static List<Song> songsOfCurrentYear() {
        int currentYear = LocalDate.now().getYear();
        List<Song> result = new ArrayList<>();

        for (Song song : songs) {
            if (song.getReleaseYear() == currentYear) {
                result.add(song);
            }
        }
        return result;
    }
    
    // 5. SONGS BY SPECIFIC ARTIST
    public static List<Song> songsByArtist(String artist) {
        List<Song> result = new ArrayList<>();

        for (Song song : songs) {
            if (song.getArtists().contains(artist)) {
                result.add(song);
            }
        }
        return result;
    }

    // 6. TITLE + RELEASE YEAR
    public static void titleAndYearListing() {
        for (Song song : songs) {
            System.out.println(
                    song.getTitle() +
                    " - " +
                    song.getReleaseYear()
            );
        }
    }

    // 7. LOWEST AND HIGHEST RATING
    public static void lowestHighestRating() {
        if (songs.isEmpty()) {
            System.out.println("No songs available.");
            return;
        }

        Song lowest = songs.get(0);
        Song highest = songs.get(0);

        for (Song song : songs) {
            if (song.getRating() < lowest.getRating()) {
                lowest = song;
            }

            if (song.getRating() > highest.getRating()) {
                highest = song;
            }
        }

        System.out.println("Lowest rated song:");
        System.out.println(lowest);

        System.out.println("\nHighest rated song:");
        System.out.println(highest);
    }
    
    // 8. GROUP SONGS BY RELEASE YEAR
    public static void groupByYear() {
        Map<Integer, List<Song>> groupedSongs = songs.stream()
                .collect(Collectors.groupingBy(Song::getReleaseYear));

        for (Map.Entry<Integer, List<Song>> entry : groupedSongs.entrySet()) {
            System.out.println("Year: " + entry.getKey());
            for (Song song : entry.getValue()) {
                System.out.println("  -> " + song);
            }
        }
    }
    
    // MAIN
    public static void main(String[] args) {

        // Artists
        Set<String> artists1 = new HashSet<>();
        artists1.add("Imagine Dragons");

        Set<String> artists2 = new HashSet<>();
        artists2.add("Ed Sheeran");

        Set<String> artists3 = new HashSet<>();
        artists3.add("Coldplay");
        artists3.add("The Chainsmokers");

        Set<String> artists4 = new HashSet<>();
        artists4.add("Adele");

        // Songs
        Song s1 = new Song(1, "Believer", artists1, 2017, 4.8);
        Song s2 = new Song(2, "Perfect", artists2, 2017, 4.7);
        Song s3 = new Song(3, "Something Just Like This", artists3, 2017, 4.6);
        Song s4 = new Song(4, "Hello", artists4, 2015, 4.5);

        // Add songs
        addSong(s1);
        addSong(s2);
        addSong(s3);
        addSong(s4);

        // 1. Display
        System.out.println("========== ALL SONGS ==========");
        displaySongs();

        // 2. Sort
        System.out.println("\n========== SORTED BY TITLE ==========");
        sortByTitle();
        displaySongs();

        // 3. Search
        System.out.println("\n========== SEARCH ==========");
        searchByTitle("Believer");

        // 4. Current year
        System.out.println("\n========== CURRENT YEAR SONGS ==========");
        List<Song> currentYearSongs = songsOfCurrentYear();
        for (Song song : currentYearSongs) {
            System.out.println(song);
        }

        // 5. Songs by artist
        System.out.println("\n========== SONGS BY ARTIST ==========");
        List<Song> coldplaySongs = songsByArtist("Coldplay");
        for (Song song : coldplaySongs) {
            System.out.println(song);
        }

        // 6. Title + year
        System.out.println("\n========== TITLE + YEAR ==========");
        titleAndYearListing();

        // 7. Lowest + highest
        System.out.println("\n========== RATINGS ==========");
        lowestHighestRating();

        // Remove
        System.out.println("\n========== REMOVE ==========");
        removeSong(4);
        displaySongs();

        // Update
        System.out.println("\n========== UPDATE ==========");
        Set<String> updatedArtists = new HashSet<>();
        updatedArtists.add("Adele");

        updateSong(
                3,
                "Something Just Like This - Updated",
                updatedArtists,
                2017,
                4.9
        );

        displaySongs();
        
        // 8. Group by year
        System.out.println("\n========== GROUP SONGS BY YEAR ==========");
        groupByYear();
    }
}