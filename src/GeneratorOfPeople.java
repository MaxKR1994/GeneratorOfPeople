public class GeneratorOfPeople {
    public String name;
    public String surname;
    public int age;
    public int weight;
    public int height;

    public GeneratorOfPeople(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age + " years old" +
                ", weight=" + weight + " kg" +
                ", height=" + height + " cm" +
                '}';
    }

    public static String[] randomName(){
        return new String[] {"Maksym","Alex","George","John","Ivan","Demian","Igor","Andrey","Oleg","Dima","Peter"};
    }
    public static String[] randomSurname(){
        return new String[] {"Attwood","Barrington","Carter","Crossman","Davidson","Evans","Forster","Gill","Hawkins","Higgins","Waller"};
    }

    public static GeneratorOfPeople[] createHumans(String[] names, String[] surnames){
        GeneratorOfPeople[] human = new GeneratorOfPeople[100];
        for (int i = 0; i < 100; i++) {
            int k = (int) (Math.random() * 11);
            String name = names[k];
            int j = (int) (Math.random() * 11);
            String surname = surnames[j];
            int age = (int) (Math.random() * 40 + 20); //[20;60)
            int weight = (int) (Math.random() * 40 + 60); //[60;100)
            int height = (int) (Math.random() * 50 + 160); //[160;210)
            if (weight >= 60 && weight <= 70) {
                height = (int) (Math.random() * 20 + 160);
            } else if (weight >= 70 && weight <= 80) {
                height = (int) (Math.random() * 20 + 170);
            } else if (weight >= 80 && weight <= 90) {
                height = (int) (Math.random() * 20 + 180);
            } else if (weight >= 90 && weight < 100) {
                height = (int) (Math.random() * 20 + 190);
            }
            human[i] = new GeneratorOfPeople(name, surname, age, weight, height);
            System.out.println((i + 1) + " -> " + human[i]);
            }
                return human;
            }

}
