package clinik;


import animals.Pet;

/**
 * Created by marv on 6/4/2015.
 */
public class Client {
    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    private final String id;
    private final Pet pet;

}
