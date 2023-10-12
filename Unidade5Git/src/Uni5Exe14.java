import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int qtdLucroMenor10 = 0;
     int qtdLucroEntre10e20 = 0;
     int qtdLucroMaior20 = 0;
     double valorTotalCompra = 0;
     double valorTotalVenda = 0;

     for (int i = 1; i <= 20; i++) {
         System.out.print("Digite o nome da mercadoria " + i + ": ");
         String nome = input.nextLine();
         System.out.println(nome);

         System.out.print("Digite o preço de compra da mercadoria " + i + ": ");
         double precoCompra = input.nextDouble();

         System.out.print("Digite o preço de venda da mercadoria " + i + ": ");
         double precoVenda = input.nextDouble();

         input.nextLine(); // limpa o buffer do teclado

         double percentualLucro = (precoVenda - precoCompra) / precoCompra * 100;

         if (percentualLucro < 10) {
             qtdLucroMenor10++;
         } else if (percentualLucro <= 20) {
             qtdLucroEntre10e20++;
         } else {
             qtdLucroMaior20++;
         }

         valorTotalCompra += precoCompra;
         valorTotalVenda += precoVenda;
     }

     double lucroTotal = valorTotalVenda - valorTotalCompra;

     System.out.println("Quantidade de mercadorias com lucro menor que 10%: " + qtdLucroMenor10);
     System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: " + qtdLucroEntre10e20);
     System.out.println("Quantidade de mercadorias com lucro maior que 20%: " + qtdLucroMaior20);
     System.out.println("Valor total de compra das mercadorias: R$ " + valorTotalCompra);
     System.out.println("Valor total de venda das mercadorias: R$ " + valorTotalVenda);
     System.out.println("Lucro total: R$ " + lucroTotal);
     input.close();
    }
}
/* Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. 
Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual 
de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total. */