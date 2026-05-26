import java.util.ArrayList;

public class HotelService {

    public ArrayList<Hotels> filterHotels(ArrayList<Hotels> hotels, FilteringCondition condition) {
        ArrayList<Hotels> result = new ArrayList<>();

        for (Hotels hotel : hotels) {
            if (condition.test(hotel)) {
                result.add(hotel);
            }
        }

        return result;
    }
}