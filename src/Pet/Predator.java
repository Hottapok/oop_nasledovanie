package Pet;

public class Predator extends Mammal{
    private String food;

    public Predator(String name, String year, String livingEnvironment, String speed, String food) {
        super(name, year, livingEnvironment, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food!=null || !food.isBlank() || !food.isEmpty()){
            this.food=food;
        }else {
            this.food="Не верные данные";
        }
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void walk() {
        super.walk();
    }
    public void hunting(){

    }
    @Override
    public String toString() {
        return "Название "+name + " ,возраст " + year + " ,место обитания " + livingEnvironment + " ,скорость " + speed + " пища " + food;
    }
}
