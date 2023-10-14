import java.text.ParseException;
import java.util.List;

public interface Repository {
    void addAnimal(Animal animal);
    List<Animal> showAnimals();
    void findAnimal() throws ParseException;
    void deleteAnimal();
}
