package pet;

public class Predator extends Mammal {
    private String food;

    public Predator(String name, String year, String livingEnvironment, String speed, String food) {
        super(name, year, livingEnvironment, speed);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food != null || !food.isBlank()) {
            this.food = food;
        } else {
            this.food = "Не верные данные";
        }
    }

    @Override
    public void eat() {
        System.out.println("Хищник кушает");
    }

    @Override
    public void go() {
        System.out.println("Хищник двигается");
    }

    @Override
    public void walk() {
        System.out.println("Хищник гуляет");
    }

    public void hunting() {
        System.out.println("Хищник охотится");

    }

    @Override
    public String toString() {
        return "Название " + name + " ,возраст " + year + " ,место обитания " + livingEnvironment + " ,скорость " + speed + " пища " + food;
    }
}
