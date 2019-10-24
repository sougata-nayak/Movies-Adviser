package com.example.movieadviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MovieExpert expert = new MovieExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getMovies(View view){
        TextView movies = (TextView) findViewById(R.id.movies);
        Spinner options = (Spinner) findViewById(R.id.options);
        String movieType = String.valueOf(options.getSelectedItem());
        /* movies.setText(movieType); */
        List<String> movieList = expert.ReturnMovies(movieType);
        StringBuilder moviesFormatted = new StringBuilder();
        for(String movie : movieList){
            moviesFormatted.append(movie).append('\n');
        }
        movies.setText(moviesFormatted);
    }
}