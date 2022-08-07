class Main {
  public static void main(String[] arg) {

    Carro carro[] = {

        new Carro("Lamborguini", 1000000.00),
        new Carro("Jipe", 46000.00),
        new Carro("Brasilia", 16000.00),
        new Carro("Smart", 46000.00),
        new Carro("Fusca", 17000.00)
    };

    int carroMaisBarato = 0;

    for (int carroSobAnalise = 0; carroSobAnalise <= (carro.length - 1); carroSobAnalise++) {

      if (carro[carroSobAnalise].getPreco() < carro[carroMaisBarato].getPreco()) {
        carroMaisBarato = carroSobAnalise;

      }
    }

    System.out.println("\n\n\tO carro mais barato é: " +
                       carro[carroMaisBarato].getNome() + ", custando: R$: " + carro[carroMaisBarato].getPreco());

  }
}
