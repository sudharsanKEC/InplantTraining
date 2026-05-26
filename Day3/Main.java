import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hotels> hotels = new ArrayList<>();

        hotels.add(new Hotels("Hotel A", 1500, HotelType.THREE_STAR));
        hotels.add(new Hotels("Hotel B", 2500, HotelType.FIVE_STAR));
        hotels.add(new Hotels("Hotel C", 1800, HotelType.FIVE_STAR));
        hotels.add(new Hotels("Hotel D", 1000, HotelType.TWO_STAR));

        HotelService hotelService = new HotelService();

        // Filter by price
        //  ArrayList<Hotels> cheapHotels0 =
        //         hotelService.filterHotels(hotels, new FilterHotelByPrice());

        // using anonymous class, this simplifies our work of creating a seperate class for filtering condition
        ArrayList<Hotels> cheapHotels =
                hotelService.filterHotels(hotels, new FilteringCondition(){
                    public boolean test(Hotels hotel){
                        return hotel.getPrice() < 2000;
                    }
                });

        System.out.println("Hotels under 2000:");
        for (Hotels h : cheapHotels) {
            System.out.println(h);
        }

        System.out.println();

        // Filter by 5-star
        // ArrayList<Hotels> luxuryHotels =
        //         service.filterHotels(hotels, new FilterHotelByStar());


        // Filter by 5-star
        // ArrayList<Hotels> luxuryHotels =
        //         hotelService.filterHotels(hotels, new FilteringCondition(){
        //             public boolean test(Hotels hotel){
        //                 return hotel.getStars() == HotelType.FIVE_STAR;
        //             }
        //         });
        // lambdas are just syntactical sugars to implement the above, it will make implementation of the above more easier.
        
        // Internally, compiler converts the below code to the above code
        // ArrayList<Hotels> luxuryHotels =
        //         hotelService.filterHotels(hotels, (Hotels hotel)->{
        //             return hotel.getStars() == HotelType.FIVE_STAR;
        //         });
        // shorter form than the above is below
        ArrayList<Hotels> luxuryHotels =
                hotelService.filterHotels(hotels, hotel -> hotel.getStars() == HotelType.FIVE_STAR);
                // Java uses target typing to map the lambda expression to a functional interface, and infers parameter and return types from the abstract method of that interface.”
        // Note: Lambdas can only be used with functional interface

        System.out.println("5-Star Hotels:");
        for (Hotels h : luxuryHotels) {
            System.out.println(h);
        }
        // Comparator
    }
}


/*
Question:
ArrayList<Hotels> luxuryHotels =
    hotelService.filterHotels(
        hotels,
        hotel -> hotel.getStars() == HotelType.FIVE_STAR
    );

Why you have not given the type Hotels? The transition from anonymous function to this lambda is confusing.
(Hotels hotel)->{
                    return hotel.getStars() == HotelType.FIVE_STAR;
                }
How this is even connected to the interface FilteringCondition when there is no name related to it? Because we have new FilteringCondition(){...} in anonymous class, here FilteringCondition is used to link with the interface right, but what about this lambda function?


Answer:
This is the moment where lambdas click — your confusion is exactly what most people hit.

🔥 Core idea (don’t miss this)

👉 Lambda does NOT need the interface name explicitly
👉 Because Java already knows it from the context

This is called:

Target typing

🔴 Let’s compare step by step
🟢 Anonymous class (explicit)
new FilteringCondition() {
    public boolean test(Hotels hotel) {
        return hotel.getStars() == HotelType.FIVE_STAR;
    }
}

👉 Here you explicitly say:

“I am implementing FilteringCondition”

🔵 Lambda (implicit)
hotel -> hotel.getStars() == HotelType.FIVE_STAR

👉 No interface name visible
👉 But Java figures it out from where you pass it

🔥 Where does the connection happen?

This line is the key:

hotelService.filterHotels(hotels, * lambda here *);

Method signature:

filterHotels(ArrayList<Hotels> hotels, FilteringCondition condition)

👉 So Java thinks:

“Second parameter must be a FilteringCondition”

🧠 So Java interprets your lambda as:
FilteringCondition condition =
    hotel -> hotel.getStars() == HotelType.FIVE_STAR;
🔥 Now everything connects

Your lambda must match:

boolean test(Hotels hotel);

So Java checks:

hotel -> hotel.getStars() == HotelType.FIVE_STAR

✔ One parameter → Hotels hotel
✔ Returns boolean

👉 Perfect match ✅

🔴 Your question: why no (Hotels hotel)?

You can write it:

(Hotels hotel) -> hotel.getStars() == HotelType.FIVE_STAR

✔ This is valid

But Java allows type inference

Because it already knows:

boolean test(Hotels hotel)

👉 So it infers:

hotel is of type Hotels
🔥 Equivalent forms (all same)
// full form
(Hotels hotel) -> {
    return hotel.getStars() == HotelType.FIVE_STAR;
}

// shorter
(Hotels hotel) -> hotel.getStars() == HotelType.FIVE_STAR;

// shortest (type inferred)
hotel -> hotel.getStars() == HotelType.FIVE_STAR;
🔥 Big picture (THIS is the answer)
Anonymous Class	Lambda
Needs interface name	Uses context
Verbose	Short
Explicit implementation	Implicit mapping
new FilteringCondition()	inferred from method
🧠 Mental model

👉 Lambda = “just the method body of the interface”

Instead of writing:

class X implements FilteringCondition {
    public boolean test(Hotels hotel) { ... }
}

You only write:

hotel -> ...
🔥 Final one-line answer

👉 Lambda is linked to FilteringCondition by the method parameter type, not by explicitly naming it.


*/