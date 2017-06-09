package javalang.copy;

public class CopyTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Luka");

        System.out.println(dog.name);
        Dog dog2 = dog;
        dog2.name = "Jenny";
        System.out.println(dog.name);
    }

    private static class Dog{
        String name;

        Dog(String name){
            this.name = name;
        }
    }
}
