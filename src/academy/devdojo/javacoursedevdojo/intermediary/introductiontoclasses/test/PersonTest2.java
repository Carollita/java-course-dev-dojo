package academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.test;

import academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.model.Person;

public class PersonTest2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Chitanda";
        person.age = 18;
        person.gender = 'F';

        System.out.println(person);
        System.out.println(person.name); 
    }
}
