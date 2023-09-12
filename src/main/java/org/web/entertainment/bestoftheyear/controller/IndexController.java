package org.web.entertainment.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.web.entertainment.bestoftheyear.model.Info;
import org.web.entertainment.bestoftheyear.model.Movie;
import org.web.entertainment.bestoftheyear.model.Song;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/")
public class IndexController {

    @GetMapping
    public String info(Model model){
        Info myInfo = new Info("Nikol", "Graminova");
        model.addAttribute("info", myInfo);
        return "index";
    }

    @GetMapping("/best-movies")
    public String bestMoviesList(Model model){
        List<Movie> moviesList = getBestMovies();
        model.addAttribute("movies", moviesList);
        return "best-movies";
    }

    private List<Movie> getBestMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(2394,"Home Alone"));
        movies.add(new Movie(2395,"Home Alone 2"));
        movies.add(new Movie(2396,"Home Alone 3"));
        return movies;
    }

    @GetMapping("/best-songs")
    public String bestSongsList(Model model){
        List<Song> songsList = getBestSongs();
        model.addAttribute("songs", songsList);
        return "best-songs";
    }

    private List<Song> getBestSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(3306, "Wicked games"));
        songs.add(new Song(5598,"Hell of a life"));
        return songs;
    }

}
