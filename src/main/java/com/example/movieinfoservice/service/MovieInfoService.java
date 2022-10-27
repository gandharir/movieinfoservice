package com.example.movieinfoservice.service;

import com.example.movieinfoservice.model.Movie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MovieInfoService {

  public Movie getMovieDetails(String movieName) {
    List<Movie> movies = getListOfMovies();
    return movies.stream().filter(movie -> movie.getName().equalsIgnoreCase(movieName)).findFirst().orElse(null);
  }

  private List<Movie> getListOfMovies() {
    Movie movie1 = new Movie();
    movie1.setName("KGF");
    movie1.setHero("Yash");
    movie1.setReleaseDate(LocalDate.of(2020,1,1));
    movie1.setRating(4.5);
    Movie movie2 = new Movie();
    movie2.setName("BB");
    movie2.setHero("Prabhas");
    movie2.setReleaseDate(LocalDate.of(2019,1,1));
    movie2.setRating(4.6);
    Movie movie3 = new Movie();
    movie3.setName("SR");
    movie3.setHero("Ram");
    movie3.setReleaseDate(LocalDate.of(2022,1,1));
    movie3.setRating(5.0);
    Movie movie4 = new Movie();
    movie4.setName("Vikram");
    movie4.setHero("Kamal");
    movie4.setReleaseDate(LocalDate.of(2022,1,1));
    movie4.setRating(6.0);
    return List.of(movie1, movie2, movie3, movie4);
  }
}
