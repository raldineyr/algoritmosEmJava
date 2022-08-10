class Main {
  public static void main(String[] arg) {

    Carro[] carro = {

        new Carro("Lamborguini", 1000000),
        new Carro("Fiat Uno", 7000),
        new Carro("Ferrari", 2000000),// 0
        new Carro("Jipe", 46000), // 01
        new Carro("Brasilia", 16000), // 02
        new Carro("Smart", 46000), // 03
        new Carro("Gol Quadrado", 15000), // 04
        new Carro("Kombi", 12000), // 05
        new Carro("Fusca", 17000) // 06
    };

     ordenar(carro);
}
  

   public static void ordenar(Carro[] carro) {
       for(int atual = 0; atual < carro.length -1; atual++) {
      
    int menor = analisarMenorPreco(carro, atual, carro.length);
    
    Carro produtoAtual = carro[atual];
    Carro produtoMenor = carro[menor];
      
    carro[atual] = produtoMenor;
    carro[menor] = produtoAtual;
 }
      
 for(Carro carros: carro){ System.out.println(carros.getNome() + " " + carros.getPreco());}
      
}


  public static int analisarMenorPreco(Carro[] carro, int inicio, int quantidadeElementos) {

    int carroMaisBarato = quantidadeElementos -1;
    quantidadeElementos = carro.length - 1;

    for (int carroSobAnalise = inicio; carroSobAnalise <= quantidadeElementos; carroSobAnalise++) {

      if (carro[carroSobAnalise].getPreco() < carro[carroMaisBarato].getPreco()) {
        carroMaisBarato = carroSobAnalise;

      }

    }
    return carroMaisBarato;
  }

}
