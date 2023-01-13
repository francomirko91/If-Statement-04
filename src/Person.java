public class Person {

    public int age;

    Person() {
        age = (int) Math.floor(Math.random() * (80 - 5 + 1) + 5);
    }

    void getLifeStage() {

        if (age <= 12) {
            System.out.println("Person is a child stage of life");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Person is a teen stage of life");

        } else if (age >= 20 && age <= 59) {
            System.out.println("Person is an adult stage of life");
        } else {
            System.out.println("Person is a senior adult stage of life");

        }


    }
}
