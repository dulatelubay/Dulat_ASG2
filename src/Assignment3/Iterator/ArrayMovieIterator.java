package Assignment3.Iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < movies.length;
    }

    @Override
    public String next() {
        return hasNext() ? movies[position++] : null;
    }
}
