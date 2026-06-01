package generics1.demo;


public class Aquarium<T> {
    // T stands for Type, after this the Aquarium class accepts object creations only with a specific class's type.
    // The letter T is not mandatory, you can even use jargons 
    // What ever the class is passed as a parameter will be received in T and that class will be replaced here instead of T

    // Aquarium contains fish, fishes are:
    // GoldFish  fish1;
    // GoldFish fish2;
    private T fish1;
    private T fish2;
    // public Aquarium(GoldFish fish1, GoldFish fish2){
    //     this.fish1 = fish1;
    //     this.fish2 = fish2;
    // }
    public Aquarium(T fish1, T fish2){
        this.fish1 = fish1;
        this.fish2 = fish2;
    }
    public T getFish1(){
        return fish1;
    }
    public T getFish2(){
        return fish2;
    }
}

