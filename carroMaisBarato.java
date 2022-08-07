class Main {
  public static void main(String[] args) {
    int[] precos = { 1000000, 40000, 16000, 46000, 17000 };

    int carroMaisBarato = 0;


    for (int atual = 0; atual <= (precos.length -1); atual++) {
      if (precos[atual] < precos[carroMaisBarato]) {
        carroMaisBarato = atual;
      }
    }
    System.out.println("\n\n\tCarro mais barato: " + carroMaisBarato);
  }
}
