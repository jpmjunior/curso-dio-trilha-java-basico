public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(3, 5);
        System.out.println("O resultado da soma é: " + soma);
    }
}
