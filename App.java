import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class App  {
    Scanner sc = new Scanner(System.in);
    public void appButton() throws ParseException {
        Controller controller = new Controller();
        AnimalsRepo animalsRepo = new AnimalsRepo();
        while (true) {
            System.out.println("Выберите действие: \n" +
                    "1. Добавить животное - 1 \n" +
                    "2. Удалить животное - 2\n" +
                    "3. Найти животное - 3\n" +
                    "4. Просмотр всех животных - 4\n" +
                    "5. Просмотр команд классов - 5");
            int numApp = sc.nextInt();
            switch (numApp) {
                case 1:
                    Animal animal = controller.addNewAnimal();
                    System.out.println("Животное |" + animal + "| добавлен в список!");
                    animalsRepo.addAnimal(animal);
                    break;
                case 2:
                    animalsRepo.deleteAnimal();
                    break;
                case 3:
                    animalsRepo.findAnimal();
                    break;
                case 4:
                    List<Animal> showAnimal = animalsRepo.showAnimals();
                    System.out.println(showAnimal);
                    break;
                case 5:
                    controller.showCommands();
                    break;
            }
        }
    }
}
