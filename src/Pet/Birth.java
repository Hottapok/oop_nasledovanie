package Pet;

public class Birth extends Animal{
     protected String livingEnvironment;

    public Birth(String name, String year, String livingEnvironment) {
        super(name, year);
        this.livingEnvironment = livingEnvironment;
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

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }
    public void hunting(){

    }
}
