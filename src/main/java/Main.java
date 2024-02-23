import behavior.fly.FlyRocketPowered;
import duck.Duck;
import duck.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuak();
        mallardDuck.swim();
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
    }
}
