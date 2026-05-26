public class FilterHotelByStar implements FilteringCondition {

    @Override
    public boolean test(Hotels hotel) {
        return hotel.getStars() == HotelType.FIVE_STAR;
    }
}