package org.web.entertainment.bestoftheyear.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;
import org.web.entertainment.bestoftheyear.model.Song;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    @GetMapping
    public String bestSongsList(Model model) {
        List<Song> songsList = getBestSongs();
        model.addAttribute("songs", songsList);
        return "best-songs";
    }

    @GetMapping("/{id}")
    public String songDetail(@PathVariable("id") int songId, Model model) {
        List<Song> songs = getBestSongs();
        Song songToFind = null;
        for (Song s : songs) {
            if (s.getId() == songId) {
                songToFind = s;
            }
        }
        if (songToFind == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "id " + songId + "not found");
        }
        model.addAttribute("song", songToFind);
        return "song-detail";
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Wicked games"));
        songs.add(new Song(2, "Hell of a life"));
        return songs;
    }
}
