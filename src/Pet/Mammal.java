package Pet;

public class Mammal extends Animal{
    protected String livingEnvironment;
    protected String speed;

    public Mammal(String name, String year, String livingEnvironment, String speed) {
        super(name, year);
        this.livingEnvironment = livingEnvironment;
        this.speed = speed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment!= null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment="Не верные данные";
        }
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        if (speed!= null || speed.isEmpty() || speed.isBlank()){
            this.speed = speed;
        }else {
            this.speed="Не верные данные";
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }
    public void walk(){

    }
}
