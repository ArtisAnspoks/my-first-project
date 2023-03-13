package lv.acodemy.classroom;

import java.nio.channels.ScatteringByteChannel;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik","Grey","Russian Blue","male",true);


        barsik.setAge(14);
        System.out.println(barsik.getAge());
        barsik.setWeight(5.14);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        barsik.speak();
        barsik.feed();

        System.out.printf("My cat's name is : %s. My car is %d years old.\n", barsik.getName(), barsik.getAge());

        barsik.walk();
        barsik.walk();
        barsik.walk();
        barsik.walk();
        barsik.walk();
        barsik.walk();
        barsik.feed();
        System.out.println(barsik.getEnergy());
        barsik.feed();
        barsik.feed();
        barsik.feed();
        barsik.feed();
        barsik.feed();
        barsik.feed();


    }

}
