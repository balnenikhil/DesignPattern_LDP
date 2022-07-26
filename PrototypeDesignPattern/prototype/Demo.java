package prototype;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        MovieShop movieShop = new MovieShop();
        movieShop.setShopName("Marvel Movie Shop");
        movieShop.loadData();


        MovieShop movieShop1 =movieShop.clone();
        movieShop.getMovies().remove(2);
        movieShop1.setShopName("DC Movie Shop");


        System.out.println(movieShop);
        System.out.println(movieShop1);
    }
}
