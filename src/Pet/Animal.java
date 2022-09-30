package Pet;

public abstract class Animal {
    protected String name ;
    protected String year;

    public Animal(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!= null || name.isEmpty() || name.isBlank()){
            this.name = name;
        }else {
            this.name="Не верные данные";
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (year!= null || year.isEmpty() || year.isBlank()){
            this.year = year;
        }else {
            this.year="Не верные данные";
        }
    }
    public abstract  void eat();

    public static void sleep(){

    }
    public abstract  void go();

}
