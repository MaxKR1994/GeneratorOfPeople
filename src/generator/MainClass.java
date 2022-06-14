package generator;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static final int NUMBER_OF_PERSONS = 100;

    public static void main(String[] args) {
        MainClass thisProgram = new MainClass();
        //creation of objects should not be in the object class, but in the main method
        thisProgram.run();
    }

    private void run() {
        List<PeopleGenerator> listOfPeople = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
            listOfPeople.add(new PeopleGenerator());
        }
        for (PeopleGenerator person : listOfPeople) {
            System.out.println(person);
        }
    }
}
