import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    private double engine;
    private String transmission;
    private String bodyType;
    private String number;
    private int numberOfSeats;
    private String tire;
    Matcher m = Pattern.compile("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d").matcher(number.toUpperCase());

    @Override
    public void refill() {
        System.out.println("Тип топлива для автомобиля "+ fuel+" ,заправка.");
    }

    public  class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            setRemoteEngineStart(remoteEngineStart);
            setKeylessAccess(keylessAccess);
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = "Не корректные данные";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            if (keylessAccess == null || keylessAccess.isEmpty()) {
                this.keylessAccess = "Не корректные данные";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }
    }

    public  class Insurance {
        private double insuranceValidityPeriod;
        private int costOfInsurance;
        private String numberOfInsurance;

        public void setInsuranceValidityPeriod(double insuranceValidityPeriod) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
        }

        public void setCostOfInsurance(int costOfInsurance) {
            this.costOfInsurance = costOfInsurance;
        }

        public void setNumberOfInsurance(String numberOfInsurance) {
            this.numberOfInsurance = numberOfInsurance;
        }

        public Insurance(int insuranceValidityPeriod, int costOfInsurance, String numberOfInsurance) {
            if (insuranceValidityPeriod == 0) {
                System.out.println("Не верная информация");
            } else {
                setInsuranceValidityPeriod(insuranceValidityPeriod);
            }
            if (costOfInsurance == 0) {
                System.out.println("Не верная информация");
            } else {
                setCostOfInsurance(costOfInsurance);
            }
            if (numberOfInsurance == null|| numberOfInsurance.isEmpty()) {
                System.out.println("Не верная информация");
            }else {
                setNumberOfInsurance(numberOfInsurance);
            }

        }
        public void insurancePeriod(){
            int year = LocalDate.now().getYear();
            if (insuranceValidityPeriod>year){
                System.out.println("Срок действия страховки закончен");
            }
        }
        public void numberOfInsurance(){
            if (this.numberOfInsurance.length()!=9){
                System.out.println("Номер страховки некорректный");
            }
        }
    }

    public Car(String brand, String model, double engine, String color, int year, String country,String fuel,
               String transmission, String bodyType, String number, int numberOfSeats, String tire,int maxSpeed) {
        super(brand,model,year,color,country,maxSpeed,fuel);
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "Неверные данные";
        } else {
            setTransmission(transmission);
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "Неверные данные";
        } else {
            setBodyType(bodyType);
        }

        if (m.find()) {
            this.number = number;
        } else {
            this.number = " некорректный номер ";
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 1;
        } else {
            setNumberOfSeats(numberOfSeats);
        }
        if (tire!=null &&  !tire.isBlank()) {
            setTire(tire);
        } else {
            this.tire = "Не корректные данные";
        }
        if (engine == 0) {
            this.engine = 1.5;
        } else {
            this.engine = engine;
        }
    }
    public double getEngine() {
        return engine;
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }
}
