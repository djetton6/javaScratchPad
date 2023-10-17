public class Dog {
    //fields
    float furLength;
    String color;
    String breed;
    int age;
    float weight;

    //methods
    void bark(){
        System.out.println("woof!");
    }

    void sleep(){
    System.out.println("zzzzz!");
    }

    void wagTail() {
        System.out.println("wagging");
    }

    void run() {
        System.out.println("zoom!");
    }
       public static void main(String[] args)
 {
        Dog pedro = new Dog();
        pedro.age  = 2;
        pedro.furLength = 20.545f;
        pedro.bark();

        Dog lassie = new Dog();
        lassie.age = 100;
        lassie.bark();
    }
}
