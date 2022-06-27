public class DogLauncher {
    public static void main(String[] args) {
        // create a new dog + set weight
        Dog d = new Dog(15);

        Dog d2 = new Dog(100);

        //1法：公正法官
        //Dog bigger = Dog.maxDog(d,d2);
        // 2法：让dog自己评判
        Dog bigger = d.maxDog(d2);

        bigger.makeNoise();
    }
}