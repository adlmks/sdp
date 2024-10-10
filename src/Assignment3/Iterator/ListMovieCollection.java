package Assignment3.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 Предоставляет коллекцию фильмов, хранящуюся в списке.
 */
public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    /**
     Добавляет фильм в коллекцию
     */
    public ListMovieCollection addMovie(String movie) {
        movies.add(movie);
        return this;
    }

    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}
