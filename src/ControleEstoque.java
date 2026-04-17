import java.util.Scanner;

public class ControleEstoque {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nome do produto: ");
    String nome = scanner.nextLine();

    System.out.print("Preço: ");
    double preco = scanner.nextDouble();

    System.out.print("Quantidade inicial em estoque: ");
    int estoque = scanner.nextInt();

    System.out.print("Quantidade vendida: ");
    int vendida = scanner.nextInt();

    System.out.println("\nProduto: " + nome);
    System.out.printf("Preço: R$ %.2f%n", preco);
    System.out.println("Estoque antes da venda: " + estoque + " unidades");

    if (vendida > estoque) {
      System.out.println("Estoque insuficiente para realizar a venda.");
    } else {
      int estoqueAtualizado = estoque - vendida;
      System.out.println("Venda realizada: " + vendida + " unidades");
      System.out.println("Estoque atualizado: " + estoqueAtualizado + " unidades");
    }

    scanner.close();
  }
}