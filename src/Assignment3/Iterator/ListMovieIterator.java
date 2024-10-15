package Assignment3.Iterator;

import java.util.List;

public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int position;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < movies.size();
    }

    @Override
    public String next() {
        return hasNext() ? movies.get(position++) : null;
    }
}
