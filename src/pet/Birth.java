package pet;

public class Birth extends Animal{
     protected String livingEnvironment;

    public Birth(String name, String year, String livingEnvironment) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);
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

    @Override
    public void eat() {
        System.out.println("Птичка кушает");

    }

    @Override
    public void sleep() {
        System.out.println("Птичка спит");

    }

    @Override
    public void go() {
        System.out.println("Птичка летает");
    }
    public void hunting(){
        System.out.println("Птичка охотится");

    }
}
