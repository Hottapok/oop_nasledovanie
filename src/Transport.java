public  abstract class Transport {
    protected String brand;
    protected String model;
    protected int year;
    protected String country;
    protected String color;
    protected int maxSpeed;
    protected String fuel;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed,String fuel) {
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.country = country;
        if (color==null || color.isBlank() ){
            this.color= "Нет данных";
        }else {
            this.color=color;
        }
        this.maxSpeed = maxSpeed;
        if (fuel==null || fuel.isBlank() ){
            this.fuel="Нет данных";
        }else {
            this.fuel=fuel;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }else {
            this.brand="Не верно введено значение";
        }
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model!= null && !model.isBlank() && !model.isBlank()){
            this.model = model;
        }else {
            this.model="Не верно введено значение";
        }
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
            this.color=color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed<=0){
            this.maxSpeed = 1;
        }else {
            this.maxSpeed = maxSpeed;
        }
    }
    public abstract void refill();
}
