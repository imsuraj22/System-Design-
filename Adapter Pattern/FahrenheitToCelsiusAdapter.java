public class FahrenheitToCelsiusAdapter implements CelsiusTempratureProvider {
    FahrenheitTemperatureSensor fahrenheitTemperatureSensor;
    public FahrenheitToCelsiusAdapter(FahrenheitTemperatureSensor fahrenheitTemperatureSensor){
        this.fahrenheitTemperatureSensor=fahrenheitTemperatureSensor;
    }
    @Override
    public double getCelsiusTempreture() {
        double FahrenheitTemp=fahrenheitTemperatureSensor.getFahrenheitTemperature();

        return (FahrenheitTemp-32.0)*5.0/9.0;
    }

}
