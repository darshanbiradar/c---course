public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    @Override
    public void makesound(){
        System.out.println("The dog barks.");
    }
}
