import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leituraD = new Scanner(System.in);
        Scanner leituraS = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        double limite = leituraD.nextDouble();
        Cartao meuCartao = new Cartao(limite);
        int continuar = 1;

        while (continuar != 0) {
            System.out.println("\nDigite a descrição da compra:");
            String nomeDoProduto = leituraS.nextLine();

            System.out.println("\nDigite o preço da compra:");
            double precoCompra = leituraD.nextDouble();

            Mercado produto = new Mercado(nomeDoProduto, precoCompra);
            boolean compraRealizada = meuCartao.aprovarCompra(produto);

            if (compraRealizada) {
                System.out.println("Digite 0 para parar ou 1 para continuar");
                continuar = leituraD.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                continuar = 0;
            }

        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Mercado c : meuCartao.getLista()){
            System.out.printf("%s - R$ %.2f\n",c.getProduto(),  c.getPreco());
        }

        System.out.println("\n***********************");
        System.out.printf("\nSaldo do cartão: R$ %.2f ",meuCartao.getSaldo());
    }
}
