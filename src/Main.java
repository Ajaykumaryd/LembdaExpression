import java.util.List;
import java.util.Scanner;

public class Main {

    interface CheckPerson {
        boolean test(Person p);
    }


    static class CheckPersonEligibleForSelectiveSearch
            implements CheckPerson {

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.FEMALE &&
                    p.getAge() >= 1 &&
                    p.getAge() <=25;
        }
    }















//    public static void printPersonOlderThan(List<Person> people,int age)
//    {
//        for(Person p: people) {
//            if(p.getAge() >= age) {
//                p.printPerson();
//            }
//        }
//    }

    public static void printPeople(List<Person> people,
                                   CheckPerson tester) {
        for(Person p: people) {
            if(tester.test(p)) {
                p.printPerson();
            }
        }
    }

   public static void printPersonInRange(List<Person>people,int low,int high){
    for(Person p:people){
         if(p.getAge()>low && p.getAge()<high){
             p.printPerson();
         }
    }
   }


    public static void main(String[] args) {


        List<Person> people = Person.generateDefaultList();
//        printPersonOlderThan(people,20);
        printPersonInRange(people,10,30);
         printPeople(people,new CheckPersonEligibleForSelectiveSearch());


        printPeople(people, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.MALE &&
                        p.getAge() >= 18 &&
                        p.getAge() <=25;
            }
        });


        printPeople(people,p -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <=25);



    }
}