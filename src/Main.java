public class Main {

    public static void main(String[] args) {

        //Skapa instanser av klassen Person

        Person p1; //p1 är en referensvariabel
        p1 = new Person();

        System.out.println(p1);
        System.out.println(p1.firstName);
        System.out.println(p1.lastName);
        System.out.println(p1.dateOfBirth);
        System.out.println(p1.height);
        System.out.println(p1.weight);

        //Ändra namnet
        p1.firstName = "Ahmed";
        p1.lastName = "Rossi";

        //Skriv ut hela namnet med metod.
        String name = Person.getName(p1);

        System.out.println(name);
        System.out.println(Person.getName(p1));

        // Arbeta med ålder
        p1.dateOfBirth = "1973-02-02";
        Person.getAge(p1);
        System.out.println("ålder: " + Person.getAge(p1));


        //Arbeta med BMI
        double BMI = Person.getBMI(p1);
        p1.height = 1.70;
        p1.weight = 85;

        System.out.println(" BMI = " + Person.getBMI(p1));


        //Visa viktklassen
        String viktklass = Person.getBmiCategory(p1);


        System.out.println(viktklass);


    }
}
