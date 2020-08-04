package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken: cuc tac cuc tac";
    }

    @Override
    public String howToEat() {
        return "co the lam ga ran";
    }
}

