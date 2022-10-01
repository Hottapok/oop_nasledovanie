package pet;

public class NotFlying extends Birth{
    private String typeOfMovement;

    public NotFlying(String name, String year, String livingEnvironment, String typeOfMovement) {
        super(name, year, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public void eat() {
        System.out.println("Птичка кушает");
    }

    @Override
    public void go() {
        System.out.println("Птичка бегает");

    }
    public void walk(){
        System.out.println("Птичка гуляет");

    }
    @Override
    public String toString() {
        return "Название "+name + " ,возраст " + year + " ,место обитания " + livingEnvironment+ ",способ перемещения "+typeOfMovement;
    }
}
