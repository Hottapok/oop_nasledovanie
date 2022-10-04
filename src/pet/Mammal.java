package pet;

public class Mammal extends Animal{
    protected String livingEnvironment;
    protected String speed;

    public Mammal(String name, String year, String livingEnvironment, String speed) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment!= null || livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment="Не верные данные";
        }
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        if (speed!= null || speed.isBlank()){
            this.speed = speed;
        }else {
            this.speed="Не верные данные";
        }
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающие кушает");
    }

    @Override
    public void sleep() {
        System.out.println("Млекопитающие спит");

    }

    @Override
    public void go() {
        System.out.println("Млекопитающие двигается");

    }
    public void walk(){
        System.out.println("Млекопитающие гуляет");

    }
}
