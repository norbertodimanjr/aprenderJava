import java.util.Scanner;

public class AplicarAumento {
    public static void main(String[] args) {
        boolean valido;
        do {
            try {
                valido = true;
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o valor que deseja aplicar o aumento de 10%: ");
                String valor = sc.nextLine();
                System.out.println("O preço com aumento é: " + aplicarAumento(valor));
            } catch (Exception e) {
                System.out.println("Digite apenas números!!");
                valido = false;

            }

        } while (!valido);

    }

    public static double aplicarAumento(String valor) {
        double valorDouble = Double.parseDouble(valor);
        return valorDouble * 1.10;

    }
}
