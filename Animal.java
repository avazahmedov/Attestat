import java.util.Date;
import java.util.Iterator;

public abstract class Animal implements Iterable<Animal>{

    private int id;
    private String birthDate;
    private String name;
    private String animalClass;

    public Animal(int id, String birthDate, String name, String animalClass) {
        this.id = id;
        this.birthDate = birthDate;
        this.name = name;
        this.animalClass = animalClass;
    }
     public Animal(){

     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Animal animal) {
        if (this == animal)
            return true;

        if (animal == null)
            return false;

        return this.id == animal.id && this.name.equals(animal.name);
    }

    @Override
    public String toString() {
         return String.format("ID животного: " + id +
                 " Имя животного: " + name +
                 " Дата рождения: " + birthDate);
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public Iterator<Animal> iterator(){
        return new AnimalIterator();
    }

    class AnimalIterator implements Iterator<Animal>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Animal next() {
            return null;
        }
    }
}
