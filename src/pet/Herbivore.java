package pet;

public class Herbivore extends Mammal {
    private String food;

    public Herbivore(String name, String year, String livingEnvironment, String speed, String food) {
        super(name, year, livingEnvironment, speed);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food != null || !food.isEmpty()) {
            this.food = food;
        } else {
            this.food = "Не верные данные";
        }
    }

    @Override
    public void eat() {
        System.out.println("Кушает травку");
    }

    @Override
    public void go() {
        System.out.println("Бегает");
    }

    @Override
    public void walk() {
        System.out.println("Гуляет");;
    }

    public void pasture() {
        System.out.println("Пасется");
    }

    @Override
    public String toString() {
        return "Название "+name + " ,возраст " + year + " ,место обитания " + livingEnvironment + " ,скорость " + speed + " пища " + food;
    }
}
