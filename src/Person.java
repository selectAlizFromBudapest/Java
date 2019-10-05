class PersonSchema {

    String name;
    int age;

    void speak() {
        System.out.println("I speak.");
    }

    int calculateYearsToRetirement() {
        int yearsToRetirement = 65 - age;
        return yearsToRetirement;
    }

    int getAge() {
        return age;
    }

    // Function with parameter
    public void saySomething(String whatYouSay){
        System.out.println(whatYouSay);
    }

    public void tellAddress(String address){
        System.out.println(address);
    }

    public void jump(String direction, double distance){
        System.out.println("Jumping to " + direction + " " + distance + " meters.");
    }

    public void height (int height){
        System.out.println("My height is: " + height + " cm.");
    }
}

public class Person {
     public static void main(String[] args) {
         PersonSchema person1 = new PersonSchema();
         person1.name = "Joe";
         person1.age = 35;

         person1.speak();

         int yearsToRetirement = person1.calculateYearsToRetirement();
         System.out.println("Years till retirement: " + yearsToRetirement);

         int age = person1.getAge();
         System.out.println("Age: " + age);

         // Function with parameter
         person1.saySomething("I say something.");
         String address = "2089 Telki, Búzavirág u. 2.";
         person1.tellAddress("My address is " + address);
         person1.jump("north", 2.3);
         person1.height(165);
     }
 }


