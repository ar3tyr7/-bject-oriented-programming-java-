package Work2_animals;

public class Dolphin extends Predator implements Swimable{
    public Dolphin(String nickname) {
        super(nickname);
    }
    public String toString() {
        return "I'm dolphin. " + super.toString() + "My speed of swim is " + speedOfswim();
    }
    public String say(){
        return "KKKQk";
    }
    @Override
    public int speedOfswim() {
        return 75;
    }
}
