package veera;
//Abstract class Animal
abstract class Animal {
abstract void sound();
}

//Subclass Lion
class Lion extends Animal {
void sound() {
   System.out.println("Lion roars");
}
}

//Subclass Tiger
class Tiger extends Animal {
void sound() {
   System.out.println("Tiger growls");
}
}

public class animal {
public static void main(String[] args) {
   Animal lion = new Lion();
   Animal tiger = new Tiger();
   
   lion.sound();
   tiger.sound();
}
}

public class animal1 {

}
