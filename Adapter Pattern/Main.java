public class Main {
    public static void main(String[] args) {
        FahrenheitTemperatureSensor fahrenheitTemperatureSensor=new FahrenheitTemperatureSensor();

        FahrenheitToCelsiusAdapter fahrenheitToCelsiusAdapter=new FahrenheitToCelsiusAdapter(fahrenheitTemperatureSensor);

        System.out.println("Celsius Tempreture (Via Adapter) "+fahrenheitToCelsiusAdapter.getCelsiusTempreture());
    }
}
