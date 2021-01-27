public class Problem1 {

    public static void main(String[] args ){
        Animal[] anis = {new Animal(), new Panda(), new Tiger()};
        System.out.println("----------");
        for (Animal ani : anis) {
            ani.getName();
            System.out.println("----------");
        }
    }
}
