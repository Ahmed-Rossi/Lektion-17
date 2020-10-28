import java.util.Calendar;

public class Person {

    //Instansvariabler
    String firstName;
    String lastName;
    String dateOfBirth; //YY-MM-DD
    double height; // meter
    double weight;  // Kg

    //Kallas  för : Metoder eller Operationer eller Funkktioner

    public static String getName(Person p) {



        return p.firstName + " "+ p.lastName;
    }

    public static int getAge (Person p){

        //Hämta aktuel år
      String calendar = Calendar.getInstance().getTime().toString();
        System.out.println(calendar);
        String thisYearString = calendar.substring(calendar.lastIndexOf(' ')+1);
        System.out.println(thisYearString);
        int thisYear =Integer.parseInt(thisYearString);
        System.out.println(thisYear);

        //Hämta år från dateOfBirth (1973-02-

        String yearString =p.dateOfBirth.substring(0,4);
        int year = Integer.parseInt(yearString);
        System.out.println(yearString);


        int age = thisYear- year;

        return age;
    }
    //En klassmetod som beräknar BMI
    public static double getBMI(Person p){
        //  vikt / längd *längd

        return p.weight/ (p.height*p.height);

    }

    public static String getBmiCategory (Person p){

        double BMI = Person.getBMI(p);
        String category;
        if (BMI< 18.5)
            category="Undervikt";
        else if (BMI<25)
        category ="Normalvikt";

        else
            category= "Övervikt";




        return category;
    }

}
