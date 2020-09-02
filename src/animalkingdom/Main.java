package animalkingdom;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private static List<AbstractAnimals>filterAnimals(List<AbstractAnimals> animals, CheckAnimal tester) {
        List<AbstractAnimals> tempList = new ArrayList<>();
        for (AbstractAnimals a : animals) {
            if (tester.test(a)) {
                tempList.add(a);
            }
        }
        return tempList;
    }
    public static void main(String[] args) {
        System.out.println("Wild kingdom rules!!!");

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1875);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<AbstractAnimals> myAnimals = new ArrayList<>();
        myAnimals.add(panda);
        myAnimals.add(zebra);
        myAnimals.add(koala);
        myAnimals.add(sloth);
        myAnimals.add(armadillo);
        myAnimals.add(raccoon);
        myAnimals.add(bigfoot);
        myAnimals.add(pigeon);
        myAnimals.add(peacock);
        myAnimals.add(toucan);
        myAnimals.add(parrot);
        myAnimals.add(swan);
        myAnimals.add(salmon);
        myAnimals.add(catfish);
        myAnimals.add(perch);

        System.out.println("*** The ArrayList ***");
        System.out.println(myAnimals.toString());

        System.out.println();
        System.out.println("\n*** Alphabetical List ***");
        myAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(myAnimals);

        System.out.println("\n\n*** Descending order by year named ***");
        myAnimals.sort((a1, a2) -> Integer.compare(a2.getYear(), a1.getYear()));
        System.out.println(myAnimals);

        System.out.println("\n\n*** How they move ***");
        myAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(myAnimals);

        System.out.println("\n\n*** How they breath ***");
        List<AbstractAnimals> filteredList = filterAnimals(myAnimals, (a) -> a.breath() == "lungs");
        System.out.println(filteredList);

        System.out.println("\n\n*** Breath with lungs only and named in 1758 ***");
        List<AbstractAnimals> filteredListLByBreathOnly = filterAnimals(myAnimals, (a) -> a.breath() == "lungs" && a.getYear() == 1758);
        System.out.println(filteredListLByBreathOnly);

        System.out.println("\n\n*** Breath with lungs and lays eggs ***");
        List<AbstractAnimals> filteredListLByLaysEgg = filterAnimals(myAnimals, (a) -> a.breath() == "lungs" && a.reproduce() == "eggs");
        System.out.println(filteredListLByLaysEgg);

        System.out.println("\n\n*** Named in 1758 ***");
        List<AbstractAnimals> filteredListLByYear = filterAnimals(myAnimals, (a) -> a.getYear() == 1758);
        filteredListLByYear.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(filteredListLByYear);




    }
}