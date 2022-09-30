package Pet;

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
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }
    public void fly(){

    }
    @Override
    public String toString() {
        return "Название "+name + " ,возраст " + year + " ,место обитания " + livingEnvironment+ ",способ перемещения "+typeOfMovement;
    }
}
