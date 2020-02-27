package io.littleworld.designpatterns;

public class Adapter {

    public static void main(String[] args) {
        Temperature temperature = new AmsterdamTemperature();

        TemperatureAdapter adapter = new FahrenheitAdapter(temperature);

        System.out.println(adapter.getTemperature());
    }
}

interface Temperature {
    double getTemperature();
}

interface TemperatureAdapter {
    double getTemperature();
}

class AmsterdamTemperature implements Temperature {
    @Override
    public double getTemperature() {
        return 15;
    }
}

class FahrenheitAdapter implements TemperatureAdapter {
    Temperature temperature;

    public FahrenheitAdapter(Temperature temperature) {
        this.temperature = temperature;
    }


    double convert(double temp) {
        return temp * 9 / 5 + 32;
    }

    @Override
    public double getTemperature() {
        return convert(temperature.getTemperature());
    }

}
