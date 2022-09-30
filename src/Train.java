public class Train extends Transport{
    private String  priceOfTrip;
    private String timeOfTrip;
    private String departureOfStation;
    private String endStation;
    private String numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed,String fuel,
                 String priceOfTrip, String timeOfTrip, String departureOfStation, String endStation, String numberOfWagons) {
        super(brand, model, year, country, color, maxSpeed,fuel);
        this.priceOfTrip = priceOfTrip;
        this.timeOfTrip = timeOfTrip;
        this.departureOfStation = departureOfStation;
        this.endStation = endStation;
        this.numberOfWagons = numberOfWagons;
    }

    public String getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(String priceOfTrip) {
        if (priceOfTrip!=null && !priceOfTrip.isBlank() && !priceOfTrip.isEmpty()){
            this.priceOfTrip = priceOfTrip;
        }else {
            this.priceOfTrip="Не верные данные";
        }
    }

    public String getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(String timeOfTrip) {
        if (timeOfTrip!= null && timeOfTrip.isEmpty() && timeOfTrip.isBlank()){
            this.timeOfTrip = timeOfTrip;
        }else {
            this.timeOfTrip="Не верные данные";
        }
    }

    public String getDepartureOfStation() {
        return departureOfStation;
    }

    public void setDepartureOfStation(String departureOfStation) {
        if (departureOfStation!= null && departureOfStation.isEmpty() && departureOfStation.isBlank()){
            this.departureOfStation = departureOfStation;
        }else {
            this.departureOfStation="Не верные данные";
        }
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        if (endStation!= null && endStation.isEmpty() && endStation.isBlank()){
            this.endStation = endStation;
        }else {
            this.endStation="Не верные данные";
        }
    }

    public String getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(String numberOfWagons) {
        if (numberOfWagons!= null && numberOfWagons.isEmpty() && numberOfWagons.isBlank()){
            this.numberOfWagons = numberOfWagons;
        }else {
            this.numberOfWagons="Не верные данные";
        }
    }

    @Override
    public void refill() {
        System.out.println("Тип топлива для поезда "+ fuel+" ,заправка.");
    }
}
