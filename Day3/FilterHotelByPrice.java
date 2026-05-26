public class FilterHotelByPrice implements FilteringCondition {

    @Override
    public boolean test(Hotels hotel) {
        return hotel.getPrice() < 2000;
    }
}