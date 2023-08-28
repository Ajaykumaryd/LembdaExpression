import java.util.List;

public class Main {

//    public static void printPersonOlderThan(List<Person> people,int age)
//    {
//        for(Person p: people) {
//            if(p.getAge() >= age) {
//                p.printPerson();
//            }
//        }
//    }

   public static void printPersonInRange(List<Person>people,int low,int high){
    for(Person p:people){
         if(p.getAge()>low && p.getAge()<high){
             p.printPerson();
         }
    }
   }


    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Person> people = Person.generateDefaultList();
//        printPersonOlderThan(people,20);
        printPersonInRange(people,10,30);

    }
}