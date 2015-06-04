package clinik;

/**
 * Created by marv on 6/4/2015.
 */
public class Clinik {
    private final Client[] clients;

    public Clinik (final int size) {
        this.clients = new Client[size];
    }
    public void addClient (final int position, final Client cliet){
        this.clients[position] = cliet;
            }
    public Client[] findClientByPetName(final String name){
    return new Client[]{};
    }
}
