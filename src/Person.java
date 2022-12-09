public class Person {

    public int age;

    Person() {
        age = (int) Math.floor(Math.random() * (80 - 5 + 1) + 5);
    }

    void getLifeStage() {

        if (age <= 12) {
            System.out.println("Person is a child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Person is a teen");

        } else if (age >= 20 && age <= 59) {
            System.out.println("Person is an adult");
        } else {
            System.out.println("Person is a senior adult");

        }


    }
}
