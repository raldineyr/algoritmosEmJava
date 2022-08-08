class Main {
  public static void main(String[] arg) {

    Carro[] carro = {

        new Carro("Lamborguini", 1000000),
        new Carro("Jipe", 46000),
        new Carro("Brasilia", 16000),
        new Carro("Smart", 46000),
        new Carro("Gol Quadrado", 15000),
        new Carro("Kombi", 12000),
        new Carro("Fusca", 17000)
    };

    int carroMaisBarato = analisarMenorPreco(carro, 0, 9);

    System.out.println("\n\n\tO carro mais barato é: " +
                       carro[carroMaisBarato].getNome() +
                       ", custando: R$: " + carro[carroMaisBarato].getPreco());

  }

  
  public static int analisarMenorPreco(Carro[] carro, int inicio, int termino) {

    int carroMaisBarato = 0;
    termino = carro.length - 1;
    
    for (int carroSobAnalise = inicio; carroSobAnalise <= termino; carroSobAnalise++) {

      if (carro[carroSobAnalise].getPreco() < carro[carroMaisBarato].getPreco()) {
        carroMaisBarato = carroSobAnalise;
        
      }
    }

    return carroMaisBarato;

  }

}
