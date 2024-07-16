package com.nhnacademy;

import java.util.HashSet;
import java.util.Set;

public class Movie{
    private final long movieId;
    private final String title;
    private final Set<String> genres=new HashSet<>();

    public Movie(long movieId, String title) {
        this.movieId = movieId;
        this.title = title;
    }
}
