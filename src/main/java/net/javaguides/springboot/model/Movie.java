package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_year")
    private String movieYear;

    @Column(name = "movie_rating")
    private String movieRating;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String firstName) {
        this.movieName = firstName;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String lastName) {
        this.movieYear = lastName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String email) {
        this.movieRating = email;
    }
}
