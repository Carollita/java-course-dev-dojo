package academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.test;

import academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.model.Pet;

public class PetTest {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.name = "Meow";
        pet.breed = "Birman";
        pet.sex = 'M';

        System.out.println(pet.name + ", " + pet.breed + ", " + pet.sex);
    }
}
