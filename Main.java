public class Main{
    public static void main(String[] args){
    Animal animal=new Animal("Generic Animal");
    Dog dog=new Dog("Fido");
    System.out.println(animal.getname());
    animal.makesound();
    System.out.println(dog.getname());
    dog.makesound();
    }
    }