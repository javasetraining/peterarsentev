package animals;

/**
 * Created by marv on 6/4/2015.
 */
public class CatDog implements Pet {
    private final Pet cat;
    private final Pet dog;


    public CatDog(Pet cat, Pet dog) {
        this.cat = cat;
        this.dog = dog;
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
        return 15;

    }

    public static void main(String[] args) {
    }
}
