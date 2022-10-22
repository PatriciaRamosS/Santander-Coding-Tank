import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Formulas formulas = new Formulas();

    // construtor
    Main() {
        scan = new Scanner(System.in);
        formulas = new Formulas();
    }

    public static void main(String[] args) {

        // tratamento de erro
        try {

            System.out.println("Digite quantas temperaturas deseja transformar: ");
            String quantidadeString = scan.next();

            int quantidade = Integer.parseInt(quantidadeString);

            // arrays
            double[] origensArray = new double[quantidade];
            double[] destinosArray = new double[quantidade];

            // estrutura de repetição
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Transformação " + (i + 1));
                opcoes();
                System.out.println("Escolha a temperatura de origem: ");
                String origemString = scan.next();
                int origem = Integer.parseInt(origemString);
                System.out.println("Qual o valor da origem? ");
                String origemValorString = scan.next();
                double origemValor = Double.parseDouble(origemValorString);
                origensArray[i] = origemValor;
                opcoes();
                System.out.println("Escolha a temperatura de destino: ");
                String destinoString = scan.next();
                int destino = Integer.parseInt(destinoString);

                // estrutura de condição
                if (origem == 1 && destino == 2) {
                    System.out.println("Celsius para Kelvin");
                    double kelvin =  formulas.celsiusToKelvin(origemValor);
                    System.out.println(origemValor + "°C = " + kelvin + " K");
                    destinosArray[i] = kelvin;
                } else if (origem == 1 && destino == 3) {
                    System.out.println("Celsius para Fahrenheit");
                    double fahrenheit = formulas.celsiusToFahrenheit(origemValor);
                    System.out.println(origemValor + "°C = " + fahrenheit + " °F");
                    destinosArray[i] = fahrenheit;
                } else if (origem == 2 && destino == 1) {
                    System.out.println("Kelvin para Celsius");
                    double celsius = formulas.kelvinToCelsius(origemValor);
                    System.out.println(origemValor + " K = " + celsius + " °C");
                    destinosArray[i] = celsius;
                } else if (origem == 2 && destino == 3) {
                    System.out.println("Kelvin para Fahrenheit");
                    double fahrenheit = formulas.kelvinToFahrenheit(origemValor);
                    System.out.println(origemValor + " K = " + fahrenheit + " °F");
                    destinosArray[i] = fahrenheit;
                } else if (origem == 3 && destino == 1) {
                    System.out.println("Fahrenheit para Celsius");
                    double celsius = formulas.fahrenheitToCelsius(origemValor);
                    System.out.println(origemValor + " °F = " + celsius + " °C");
                    destinosArray[i] = celsius;
                } else if (origem == 3 && destino == 2) {
                    System.out.println("Fahrenheit para Kelvin");
                    double kelvin = formulas.fahrenheitToKelvin(origemValor);
                    System.out.println(origemValor + " °F = " + kelvin + " K");
                    destinosArray[i] = kelvin;
                } else {
                    System.out.println("Selecione as opções corretamente");
                    System.out.println("Escolha a transformação " + (i + 1) + " novamente");
                    i--;
                }
                System.out.println("\n");
            }
            System.out.println("Media origens: " + formulas.media(origensArray, quantidade));
            System.out.println("Media transformações: " + formulas.media(destinosArray, quantidade));

        } catch (Exception e) {
            // tratamento de erro
            System.out.println("Houve um erro inesperado");
            System.out.println(e);
        }
    }

    // função
    static void opcoes() {
        System.out.println("1 - Celsius\n2 - Kelvin\n3 - Fahrenheit");
    }

}