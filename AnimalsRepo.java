import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalsRepo implements Repository {
    public List<Animal> animals = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public AnimalsRepo() {

    }


    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void deleteAnimal(){
        System.out.println("Введите ID животного которого хотите удалить: \n");
        int delID = sc.nextInt();
        int a = 0;
        for (Animal animal: animals) {
            if (animal.getId() == delID) {
                a++;
                animals.remove(animal);
            }
        }
        if(a==0) System.out.println("Такого животного не существует!");
    }

    public List<Animal> showAnimals(){
        return animals;
    }

    public void findAnimal() {
        int a = 0;
        List<Animal> animalFind = new ArrayList<>();
        System.out.println("По каким данным вы хотите искать животного?\n" +
                "1. ID - 1\n" +
                "2. Имя животного - 2\n" +
                "3. Дата рождения - 3\n");
        int findNum = sc.nextInt();
        switch (findNum) {
            case 1:
                System.out.println("Введите ID животного: \n");
                int findID = sc.nextInt();
                for (Animal animal : animals) {
                    if (animal.getId() == findID) {
                        a++;
                        System.out.println(animal);
                    }
                }
                sc.nextLine();

                if (a == 0) System.out.println("Такого животного не существует!");
                break;
            case 2:
                System.out.println("Введите имя животного: \n");
                String findName = sc.nextLine();
                for (Animal animal : animals) {
                    if (animal.getName().equals(findName)) {
                        a++;
                        animalFind.add(animal);
                    }
                }
                sc.nextLine();
                if (a == 0) System.out.println("Такого животного не существует!");
                else System.out.println(animalFind);
                break;
            case 3:
                System.out.println("Введите дату рождения животного (в формате yyyy-MM-dd): \n");
                String findDate = sc.nextLine();
                for (Animal animal : animals) {
                    if (animal.getBirthDate().equals(findDate)) {
                        a++;
                        animalFind.add(animal);
                    }
                }
                sc.nextLine();
                if (a == 0) System.out.println("Такого животного не существует!");
                else System.out.println(animalFind);
                break;
        }
    }
}
