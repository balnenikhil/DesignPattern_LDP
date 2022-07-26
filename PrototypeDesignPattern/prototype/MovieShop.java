package prototype;

import java.util.ArrayList;
import java.util.List;

public class MovieShop implements Cloneable{
    private String shopName;
    List<Movie> movies = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void loadData(){
        for (int i= 1; i<=10; i++){
            Movie movie = new Movie();
            movie.setMovieId(i);
            movie.setMovieName("movie "+ i);
            getMovies().add(movie);
        }
    }

    @Override
    public String toString() {
        return "MovieShop{" +
                "shopName='" + shopName + '\'' +
                ", movies=" + movies +
                '}';
    }


    @Override
    protected MovieShop clone() throws CloneNotSupportedException {
        MovieShop  shop = new MovieShop();
        for (Movie m : this.getMovies())
        {
            shop.getMovies().add(m);
        }
        return shop;
    }

}
