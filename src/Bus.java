public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed,String fuel) {
        super(brand, model, year, country, color, maxSpeed,fuel);
    }

    @Override
    public void refill() {
        System.out.println("Тип топлива для автобуса "+ fuel+" ,заправка.");
    }
}
