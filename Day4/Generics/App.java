package generics1.demo;
public class App{
    public static void main(String[] args) {
        // Aquarium aquarium = new Aquarium(new GoldFish(),new SharkFish());
        
        // Object fish1 = aquarium.getFish1();
        // Object fish2 = aquarium.getFish2();
        // In the above the problem is the fish1 and fish2 are the types of Object class, we cant use those objects to access methods in the GoldFish class, like the below:
        // fish1.swim(); // error, so to access swim() method we can typecast these objects to GoldFish
        // GoldFish fish1 = (GoldFish)aquarium.getFish1();
        // GoldFish fish2 = (GoldFish)aquarium.getFish2(); // trhows exception at runtime because of type mismatch, thats why we need generics.
        // fish1.swim();
        // fish2.swim();
        // But this approach is also having a problem, that is the getFish1() and getFish2() is returning a type of Object and we again want to cast it here using (GoldFish).
        // So its not returning in the exact type of the fish.

        // System.out.println(fish1 +" "+fish2);

        // Aquarium aquarium2 = new Aquarium(new StarFish(),new StarFish());// this is not possible because the Constructor Aquarium() accepts only GoldFish objects as arguments
        // So here is the problem occurs, when we want to send objects of different types of Fish class to Aquarium, it doesn't accepts because aquarium constructor and the fields fish1 and fish2 are tightly coupled to GoldFish.
        // But we want to make it accept any type of object of may be a StarFish class or may be a fighter fish class.
        // For that we can make the GoldFish class object in the Aquarium as Object class.

        // After Adding generic to Aquarium
        Aquarium<GoldFish> aquarium3 = new Aquarium<GoldFish>(new GoldFish(), new GoldFish());
        GoldFish fish1 = aquarium3.getFish1(); // now, no type casting is needed because the getFish1() itself resturns a goldFish().
        GoldFish fish2 = aquarium3.getFish2();
        fish1.swim();
        fish1.swim();
        System.out.println(fish1+" "+fish2);
        Aquarium<StarFish> aquarium4 = new Aquarium<StarFish>(new StarFish(),new StarFish());
        StarFish fish3 = aquarium4.getFish1(); // now, no type casting is needed because the getFish1() itself resturns a goldFish().
        StarFish fish4 = aquarium4.getFish2();
    
        System.out.println(fish3+" "+fish4);
        // Now the above are called parameterized type

        // Now, there is no need for casting, because we had made that the Aquarium class can accept any class as a parameter and can give its objects.
        // Aquarium<StarFish> aquarium4 = new Aquarium<StarFish>(new StarFish(),new GoldFish()); - this throws error at compile time itself, so forces us to handle these type or errors at compile time instead of runtime and getting errors at productions, which would be risky.
        Aquarium aquarium5 = new Aquarium(null, null); // This is a bad practice, because in Aquarium the class type T will treated as a general Object class.
        
    }
}