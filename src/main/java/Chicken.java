public class Chicken implements Animal, Edible {
    @Override
    public String makeSound() {
        return  "cuc tac la chanh";
    }

    @Override
    public String howToEat() {
        return "thuc an cua ho";
    }
}
