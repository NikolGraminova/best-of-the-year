package org.web.entertainment.bestoftheyear.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;
import org.web.entertainment.bestoftheyear.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {
    List<Movie> moviesList = getBestMovies();

    @GetMapping
    public String bestMoviesList(Model model) {
        model.addAttribute("movies", moviesList);
        return "best-movies";
    }

    @GetMapping("/{id}") // variable part of path
    public String movieDetail(@PathVariable("id") int movieId, Model model) {
        List<Movie> movieList = getBestMovies();
        Movie movieToFind = null;
        for (Movie m : movieList) {
            if (movieId == m.getId()) {
                movieToFind = m;
            }
        }
        if (movieToFind == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "id " + movieId + "not found");
        }
        model.addAttribute("movie", movieToFind);
        return "movie-detail";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Home Alone"));
        movies.add(new Movie(2, "Home Alone 2"));
        movies.add(new Movie(3, "Home Alone 3"));
        return movies;
    }

}
