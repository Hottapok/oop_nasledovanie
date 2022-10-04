package pet;

public class Amphibian extends Animal {
    protected String livingEnvironment;

    public Amphibian(String name, String year, String livingEnvironment) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null || livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Не верные данные";
        }
    }

    @Override
    public void eat() {
        System.out.println("Земноводное делает кусь");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное делает Хр,хр");
    }

    @Override
    public void go() {
        System.out.println("Земноводное двигается");
    }

    public void hunting() {
        System.out.println("Земноводное охотиться");
    }

    @Override
    public String toString() {
        return "Название " + name + " ,возраст " + year + " ,место обитания " + livingEnvironment;
    }
}
