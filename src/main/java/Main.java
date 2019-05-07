public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Chicken c = new Chicken();
        Orange o = new Orange();
        Apple a = new Apple();

        System.out.println(t.makeSound());
        System.out.println(c.makeSound());

        System.out.println(o.howToEat() + " " + c.makeSound());
        System.out.println(a.howToEat() + " " + c.makeSound());
        System.out.println(c.howToEat() + " " + t.makeSound());

    }
}
