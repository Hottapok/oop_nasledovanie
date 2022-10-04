package pet;

public abstract class Animal {
    protected String name ;
    protected String year;

    public Animal(String name, String year) {
        setName(name);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!= null || name.isBlank()){
            this.name = name;
        }else {
            this.name="Не верные данные";
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (year!= null || year.isBlank()){
            this.year = year;
        }else {
            this.year="Не верные данные";
        }
    }
    public abstract  void eat();

    public abstract void sleep() ;

    public abstract  void go();

}
