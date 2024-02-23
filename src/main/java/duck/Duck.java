package duck;

import behavior.fly.FlyBehavior;
import behavior.quack.QuackBehavior;
import lombok.Setter;

@Setter
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

//    public void setFlyBehavior(behavior.fly.FlyBehavior flyBehavior) {
//        this.flyBehavior = flyBehavior;
//    }
//
//    public void setQuackBehavior(behavior.quack.QuackBehavior quackBehavior) {
//        this.quackBehavior = quackBehavior;
//    }

    public Duck() {

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuak() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
