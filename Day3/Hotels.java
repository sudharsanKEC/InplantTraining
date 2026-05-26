public class Hotels {
    private String name;
    private double price;
    private HotelType stars;

    public Hotels(String name, double price, HotelType stars) {
        this.name = name;
        this.price = price;
        this.stars = stars;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public HotelType getStars() {
        return stars;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStars(HotelType stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return name + " - Rs." + price + " - " + stars;
    }
}