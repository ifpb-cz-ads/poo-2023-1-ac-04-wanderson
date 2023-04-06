import java.util.Scanner;

public class CTq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade >= 16 && idade <= 17 || idade > 65) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        sc.close();
    }
}
