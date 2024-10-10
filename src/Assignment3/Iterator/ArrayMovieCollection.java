package Assignment3.Iterator;

/**
 Добавление фильмов в уже существующий массив
 */
public class ArrayMovieCollection {
    private String[] movies;
    private int size = 0;

    public ArrayMovieCollection(int capacity) {
        movies = new String[capacity];
    }

    /**
     Добавление фильмов в массив
     */
    public ArrayMovieCollection addMovie(String movie) {
        if (size < movies.length) {
            movies[size++] = movie;
        } else {
            System.out.println("Array is full!");
        }
        return this;
    }

    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}
