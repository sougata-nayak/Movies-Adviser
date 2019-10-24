package com.example.movieadviser;

import java.util.ArrayList;
import java.util.List;

public class MovieExpert {
    List<String> ReturnMovies(String options){
        List<String> movies = new ArrayList<String>();
        if(options.equals("Action")){
            movies.add("John Wick");
            movies.add("Kill Bill");
            movies.add("Matrix");
        }
        if(options.equals("Thriller")){
            movies.add("Psycho");
            movies.add("Shutter Islands");
            movies.add("The Usual Suspects");
        }
        if(options.equals("Comedy")){
            movies.add("The Hangover");
            movies.add("American Pie");
            movies.add("21 Jump Street");
        }
        if(options.equals("Horror")){
            movies.add("The conjuring");
            movies.add("The ring");
            movies.add("The exorcist");
        }
        if(options.equals("Romance")){
            movies.add("Titanic");
            movies.add("La La Land");
            movies.add("The Fault in our Stars");
        }
        return movies;

    }
}
