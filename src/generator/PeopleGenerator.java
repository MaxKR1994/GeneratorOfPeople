package generator;

import java.util.Random;
import java.util.Set;

public class PeopleGenerator {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private int height;
    private final Random random = new Random();

    public PeopleGenerator(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public PeopleGenerator(){
        createHumans(randomName(), randomSurname());
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age + " years old" +
                ", weight = " + weight + " kg" +
                ", height = " + height + " cm} \n";
    }

    public static String[] randomName() {
        Set<String> names = DataReader.readData("resources/listOfNames.txt");
        return names.toArray(new String[0]);
    }

    public static String[] randomSurname() {
        Set<String> surNames = DataReader.readData("resources/listOfSurnames.txt");
        return surNames.toArray(new String[0]);
    }

    private void createHumans(String[] names, String[] surnames) {

        name = names[random.nextInt(100)];
        surname = surnames[random.nextInt(100)];
        age = random.nextInt(40) + 20; //[20;60)
        weight = random.nextInt(40) + 60; //[60;100)
        height = random.nextInt(50) + 160; //[160;210)

        //I understand the weight-height ratio, but what's the logic of this?
        if (weight >= 60 && weight < 70) {
            height = random.nextInt(20) + 160;
        } else if (weight >= 70 && weight < 80) {
            height = random.nextInt(20) + 170;
        } else if (weight >= 80 && weight < 90) {
            height = random.nextInt(20) + 180;
        } else if (weight >= 90 && weight < 100) {
            height = random.nextInt(20) + 190;
        } else {
            //added to avoid exception
            height = random.nextInt(20) + 200;
        }
    }

}
