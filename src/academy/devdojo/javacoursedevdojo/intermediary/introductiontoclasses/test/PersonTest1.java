package academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.test;

import academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.model.Person;

public class PersonTest1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Oreki";
        person.age = 18;
        person.gender = 'M';

        System.out.println(person); // academy.devdojo.javacoursedevdojo.intermediary.introductionToClasses.model.Person@7a81197d
        System.out.println(person.name); // Oreki
    }
}
