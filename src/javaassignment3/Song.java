package javaassignment3;
import java.util.Set;

class Song {

    private int serialNo;
    private String title;
    private Set<String> artists;
    private int releaseYear;
    private double rating;

    public Song(int serialNo, String title, Set<String> artists,
                int releaseYear, double rating) {

        this.serialNo = serialNo;
        this.title = title;
        this.artists = artists;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Getters
    public int getSerialNo() {
        return serialNo;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getArtists() {
        return artists;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtists(Set<String> artists) {
        this.artists = artists;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Song{" +
                "serialNo=" + serialNo +
                ", title='" + title + '\'' +
                ", artists=" + artists +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                '}';
    }
}