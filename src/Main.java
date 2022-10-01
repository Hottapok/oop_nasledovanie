import pet.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Grande", 1.7, "Желтый", 2015, "Россия", "Бензин", "Auto", null, "x012zx012", 2, "Лето", 150);
        Car car2 = new Car("Audi", "A8", 3.0, "Черный", 2020, "Германия", "Бензин", "Auto", null, "asa456122", 4, "Лето", 200);
        Car car3 = new Car("BMW", "Z8", 3.0, "Black", 2021, "Germany", "Бензин", "Auto", null, "aasasss6122", 7, "Лето", 220);
        Car car4 = new Car("KIA", "Sportage", 2.4, "Red", 2018, "South Korea", "Бензин", "Auto", null, "a154aa455", 4, "Лето", 200);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea", "Бензин", "Auto", null, "asa4561aa", 8, "Лето", 170);
        infoAboutCar(car1);
        infoAboutCar(car2);
        infoAboutCar(car3);
        infoAboutCar(car4);
        infoAboutCar(car5);
        Train train1 = new Train("Ласточка", "В-901", 2011, "Россия",
                null, 301, "Дизель", "3500", null, "Белорусский вокзал",
                "Минск-пассажирский", "11");
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, "Дизель", "1700", null, "Ленинградский вокзал",
                "Ленинград-пассажирский", "8");
        infoAboutTrain(train1);
        infoAboutTrain(train2);
        Bus bus1 = new Bus("Икарус", "123", 1987, "СССР", "Желтый", 150, "Дизель");
        Bus bus2 = new Bus("Лиаз", "885", 1977, "СССР", "Красный", 110, "Дизель");
        Bus bus3 = new Bus("ПАЗ", "111", 1991, "СССР", "Белый", 150, "Дизель");
        infoAboutBus(bus1);
        infoAboutBus(bus2);
        infoAboutBus(bus3);

        train1.refill();
        bus1.refill();
        car3.refill();

        Herbivore gazelle = new Herbivore("Газель", "20", "Африка", "30", "Трава");
        Herbivore giraffe = new Herbivore("Жираф", "10", "Африка", "10", "Трава");
        Herbivore horse = new Herbivore("Лошадь", "8", "Россия", "20", "Трава");
        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(gazelle.toString());
        System.out.println(giraffe.toString());
        System.out.println(horse.toString());

        Predator hyena = new Predator("Гиена", "3", "Африка", "15", "Мясо");
        Predator tiger = new Predator("Тигр", "7", "Азия", "21", "Мясо");
        Predator bear = new Predator("Медведь", "18", "Россия", "15", "Мясо");
        System.out.println(hyena.equals(bear));
        System.out.println(hyena.equals(tiger));
        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());

        Amphibian frog = new Amphibian("Лягушка", "1", "Болото");
        Amphibian snakeOfWater = new Amphibian("Уж", "2", "Водоемы");
        System.out.println(frog.equals(snakeOfWater));
        System.out.println(frog.toString());
        System.out.println(snakeOfWater.toString());

        NotFlying peacock = new NotFlying("Павлин","3","Болото","Ходьба");
        NotFlying penguin = new NotFlying("Пингвин","3","Аргентина","Ходьба");
        NotFlying dodo = new NotFlying("Додо","1","Маврика","Ходьба");
        System.out.println(peacock.equals(penguin));
        System.out.println(peacock.equals(dodo));
        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
        System.out.println(dodo.toString());

        Flying seagull = new Flying("Чайка","7","Побережье","Полет");
        Flying albatross = new Flying("Альбатрос","3","Побережье","Полет");
        Flying falcon = new Flying("Сокол","7","Россия","Полет");
        System.out.println(seagull.equals(albatross));
        System.out.println(seagull.equals(falcon));
        System.out.println(seagull.toString());
        System.out.println(albatross.toString());
        System.out.println(falcon.toString());
    }

    private static void infoAboutCar(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " " + ",год выпуска " + car.getYear()
                + " ," + "цвет кузова " + car.getColor() + " ," + "место сборки " + car.getCountry() +
                " ," + "объем двигателя " + car.getEngine() + ", коробка передач " + car.getTransmission() +
                ", тип кузова " + car.getBodyType() + ", регистрационный номер " + car.getNumber() + ", количество мест " +
                car.getNumberOfSeats() + ", резина " + car.getTire() + " ,Максимальная скорость " + car.getMaxSpeed() + " ,тип топлива " + car.fuel);
    }

    private static void infoAboutTrain(Train train) {
        System.out.println("Поезд " + train.brand + " ,модель " + train.getModel() + " ,год выпуска " + train.getYear()
                + " ,страна производства " + train.getCountry() + " ,тип топлива " + train.fuel + " ,цвет " + train.getColor() + " ,скорость передвижения "
                + train.getMaxSpeed() + " км/ч" + " , отходит от " + train.getDepartureOfStation() + " и следует до станции "
                + train.getEndStation() + ".Цена поездки " + train.getPriceOfTrip() + " ,в поезде " + train.getNumberOfWagons() + " вагонов.");
    }

    private static void infoAboutBus(Bus bus) {
        System.out.println("Автобус " + bus.getBrand() + " ,модель " + bus.getModel()
                + " ,год выпуска " + bus.getYear() + " ,страна производства " + bus.getCountry()
                + " , цвет кузова " + bus.getColor() + " ,максимальная скорость " + bus.getMaxSpeed() + " км/ч " + ", тип топлива " + bus.fuel);
    }
}