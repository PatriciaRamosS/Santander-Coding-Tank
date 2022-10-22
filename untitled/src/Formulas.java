public class Formulas {

    double FATOR = 9.0/5.0;
    double FATOR2 = 5.0/9.0;

    // construtor
    Formulas() {}

    // metodo
    double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    double celsiusToFahrenheit(double celsius) {
        return (celsius * FATOR) + 32;
    }

    double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * FATOR + 32;
    }

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * FATOR2;
    }

    double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * FATOR2 + 273.15;
    }

    double media(double[] valores, int quantidade) {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += valores[i];
        }
        return total / quantidade;
    }

}
