import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Controller {

    public Animal addNewAnimal() {
        Scanner sc = new Scanner(System.in);
        AnimalsRepo animalsRepo = new AnimalsRepo();
        System.out.println("Какого класса животное Вы хотите добавить?\n" +
                "1. Домашнее - 1\n" +
                "2. Вьючее -2");
        int numClass = sc.nextInt();
        switch (numClass) {
            case 1:
                System.out.println("Какое животное вы хотите добавить?\n" +
                        "1. Собака - 1\n" +
                        "2. Кот - 2\n" +
                        "3. Козёл - 3");
                int numaAnim = sc.nextInt();
                switch (numaAnim) {
                    case 1:
                        Dog dog = new Dog();
                        System.out.println("Ввдеита ID собаки: ");
                        int idDog = sc.nextInt();
                        dog.setId(idDog);
                        sc.nextLine();
                        System.out.println("Введите дату рождения собаки (в формате yyyy-MM-dd):");
                        String date = sc.nextLine();
                        dog.setBirthDate(date);
                        System.out.println("Введите имя собаки: ");
                        String nameDog = sc.nextLine();
                        dog.setName(nameDog);
                        System.out.println("Введите класс собаки: ");
                        String classDog = sc.nextLine();
                        dog.setAnimalClass(classDog);
                        return dog;
                    case 2:
                        Cat cat = new Cat();
                        System.out.println("Ввдеита ID кота/кошки: ");
                        int idCat = sc.nextInt();
                        cat.setId(idCat);
                        sc.nextLine();
                        System.out.println("Введите дату рождения кота/кошки (в формате yyyy-MM-dd):");
                        String dateCat = sc.nextLine();
                        cat.setBirthDate(dateCat);
                        System.out.println("Введите имя кота/кошки: ");
                        String nameCat = sc.nextLine();
                        cat.setName(nameCat);
                        System.out.println("Введите класс кота/кошки: ");
                        String classCat = sc.nextLine();
                        cat.setAnimalClass(classCat);
                        return cat;
                    case 3:
                        Goat goat = new Goat();
                        System.out.println("Ввдеита ID козла: ");
                        int idGoat = sc.nextInt();
                        goat.setId(idGoat);
                        sc.nextLine();
                        System.out.println("Введите дату рождения козла (в формате yyyy-MM-dd):");
                        String dateGoat = sc.nextLine();
                        goat.setBirthDate(dateGoat);
                        System.out.println("Введите имя козла: ");
                        String nameGoat = sc.nextLine();
                        goat.setName(nameGoat);
                        System.out.println("Введите класс козла: ");
                        String classGoat = sc.nextLine();
                        goat.setAnimalClass(classGoat);
                        return goat;
                }
                break;
            case 2:
                System.out.println("Какое животное вы хотите добавить?\n" +
                        "1. Лошадь - 1\n" +
                        "2. Осёл - 2\n" +
                        "3. Веблюд - 3");
                int numaBAnim = sc.nextInt();
                switch (numaBAnim) {
                    case 1:
                        Horse horse = new Horse();
                        System.out.println("Ввдеита ID лошади: ");
                        int idHorse = sc.nextInt();
                        horse.setId(idHorse);
                        sc.nextLine();
                        System.out.println("Введите дату рождения лошади (в формате yyyy-MM-dd):");
                        String date = sc.nextLine();
                        horse.setBirthDate(date);
                        System.out.println("Введите имя лошади: ");
                        String nameHorse = sc.nextLine();
                        horse.setName(nameHorse);
                        System.out.println("Введите класс лошади: ");
                        String classHorse = sc.nextLine();
                        horse.setAnimalClass(classHorse);
                        return horse;
                    case 2:
                        Donkey donkey = new Donkey();
                        System.out.println("Ввдеита ID осла: ");
                        int idDonkey = sc.nextInt();
                        donkey.setId(idDonkey);
                        sc.nextLine();
                        System.out.println("Введите дату рождения осла (в формате yyyy-MM-dd):");
                        String dateDonkey = sc.nextLine();
                        donkey.setBirthDate(dateDonkey);
                        System.out.println("Введите имя осла: ");
                        String nameDonkey = sc.nextLine();
                        donkey.setName(nameDonkey);
                        System.out.println("Введите класс осла: ");
                        String classDonkey = sc.nextLine();
                        donkey.setAnimalClass(classDonkey);
                        return donkey;
                    case 3:
                        Camel camel = new Camel();
                        System.out.println("Ввдеита ID козла: ");
                        int idCamel = sc.nextInt();
                        camel.setId(idCamel);
                        sc.nextLine();
                        System.out.println("Введите дату рождения козла (в формате yyyy-MM-dd):");
                        String dateCamel = sc.nextLine();
                        camel.setBirthDate(dateCamel);
                        System.out.println("Введите имя козла: ");
                        String nameCamel = sc.nextLine();
                        camel.setName(nameCamel);
                        System.out.println("Введите класс козла: ");
                        String classCamel = sc.nextLine();
                        camel.setAnimalClass(classCamel);
                        return camel;
                }
        }
        return null;
    }
    public void showCommands(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Команды какого класса хотите просмотреть?\n" +
                "1. Домашние животние\n" +
                "2. Вьючие животные");
        int com = sc.nextInt();
        switch (com){
            case 1:
                Command[] domesticArr = Command.getDomesticComands();
                for (Command command: domesticArr) {
                    System.out.println(command);
                };
                break;
            case 2:
                Command[] baggageArr = Command.getBaggageComands();
                for (Command command: baggageArr) {
                    System.out.println(command);
                };
                break;
        }
    }
}
