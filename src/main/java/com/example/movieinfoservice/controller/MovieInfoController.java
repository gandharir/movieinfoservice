package com.example.movieinfoservice.controller;

import com.example.movieinfoservice.model.Movie;
import com.example.movieinfoservice.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MovieInfoController {

  @Autowired
  MovieInfoService movieInfoService;

  @GetMapping("/movie/{movieName}")
  public ResponseEntity<Movie> getMovieDetails(@PathVariable String movieName) {
    return new ResponseEntity<>(movieInfoService.getMovieDetails(movieName), HttpStatus.OK);
  }
}
