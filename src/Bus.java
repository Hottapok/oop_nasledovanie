public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed,String fuel) {
        super(brand, model, year, country, color, maxSpeed,fuel);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Тип топлива для автобуса "+ fuel+" ,заправка.");
    }
}
