package one.digitalinovation;

public class Test {
    public static void main(String[] args) {

        // Testes relacionados ao Design Patterm Singleton:
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        lazy = SingletonLazy.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        lazy = SingletonLazy.getInstance();
        System.out.println(holder);


    }
}
