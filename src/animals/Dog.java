package animals;

/**
 * Created by marv on 6/4/2015.
 */
public class Dog implements Pet {
    private final Pet aPet;

    public Dog(final Pet pet) {
        this.aPet = pet;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int petAge() {
        return 0;
    }
}
