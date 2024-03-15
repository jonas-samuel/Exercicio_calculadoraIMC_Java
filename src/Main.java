import java.util.Scanner;

class CalculadoraIMC {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo à Calculadora de IMC!");
    System.out.println("Por favor, insira seu peso em quiligramas: ");
    double peso = scanner.nextDouble();

    System.out.println("Agora insira sua altura em metros: ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    System.out.printf("Seu Índice de Massa Corporal (IMC) é: %.2f\n", imc);

    if (imc < 18.5) {
        System.out.println("Você está abaixo do peso ideal.");
    } else if (imc >= 18.5 && imc < 25) {
        System.out.println("Você está com o peso ideal.");
    } else if (imc >= 25 && imc < 30){
        System.out.println("Você está acima do peso ideal.");
    } else {
        System.out.println("Você está na categoria de obesidade.");
    }
    scanner.close();
    }
}



