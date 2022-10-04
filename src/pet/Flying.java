package pet;

public class Flying extends Birth{
    private String typeOfMovement;

    public Flying(String name, String year, String livingEnvironment, String typeOfMovement) {
        super(name, year, livingEnvironment);
        this.typeOfMovement = typeOfMovement;

    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public void eat() {
        System.out.println("Летающая птичка кушает");
    }

    @Override
    public void go() {
        System.out.println("Двигается");
    }
    public void fly(){
        System.out.println("Летает");

    }
    @Override
    public String toString() {
        return "Название "+name + " ,возраст " + year + " ,место обитания " + livingEnvironment+ ",способ перемещения "+typeOfMovement;
    }
}
