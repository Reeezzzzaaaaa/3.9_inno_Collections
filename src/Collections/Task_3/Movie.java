package Collections.Task_3;

import java.util.Objects;

public class Movie {

    private String title;
    private double rating;
    private String genre;
    private String country;
    private boolean oskar;

    public Movie(String title, double rating, String genre, String country, boolean oskar) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oskar = oskar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Movie movie = (Movie) o;
        return Double.compare(rating, movie.rating) == 0 && oskar == movie.oskar
            && Objects.equals(title, movie.title) && Objects.equals(genre,
            movie.genre) && Objects.equals(country, movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rating, genre, country, oskar);
    }

    @Override
    public String toString() {
        return "Movie{" +
            "title='" + title + '\'' +
            ", rating=" + rating +
            ", genre='" + genre + '\'' +
            ", country='" + country + '\'' +
            ", oskar=" + oskar +
            '}';
    }
}
