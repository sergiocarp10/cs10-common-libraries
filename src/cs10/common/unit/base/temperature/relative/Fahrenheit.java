package cs10.common.unit.base.temperature.relative;

import cs10.common.unit.Conversion;

public class Fahrenheit extends RelativeTemperature {

    public Fahrenheit(){}

    public Fahrenheit(double value){
        setValue(value);
    }

    public Fahrenheit(Celsius celsius){
        setValue(celsius.getValue() * Conversion.FAHRENHEIT_INTERVAL.getNumber() +
                Conversion.FAHRENHEIT_OFFSET.getNumber());
    }

    @Override
    public Celsius getInCelsius() {
        return new Celsius(this);
    }

    @Override
    protected char getLetter() {
        return 'F';
    }
}
