class Main {
  public static void main(String[] args) {
    int[] carro = { 1000000, 40000, 16000, 46000, 17000 };

    int carroMaisBarato = 0;

    for (int atual = 0; atual <= (carro.length -1); atual++) {
      if (carro[atual] < carro[carroMaisBarato]) {
        carroMaisBarato = atual;
      }
    }
    System.out.println("\n\n\tCarro mais barato: " + carroMaisBarato);
  }
}
