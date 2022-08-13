class Main {
  public static void main(String[] arg) {

    Carro[] carro = {

        new Carro("Fiat Uno", 7000),
        new Carro("Jipe", 46000),
        new Carro("Brasilia", 16000),
        new Carro("Smart", 46000),
        new Carro("Gol Quadrado", 15000),
        new Carro("Kombi", 12000),
        new Carro("Fusca", 17000),
        new Carro("Lamborguini", 2000000)
    };

     //selectionSort(carro);
    insectionSort(carro);

 
}


  public static void insectionSort(Carro[] carro){



    for(int garagem = 1; garagem < (carro.length); garagem++){

      int carroSobAnalise = garagem;

      while (carroSobAnalise > 0 && carro[carroSobAnalise].getPreco() < carro[carroSobAnalise -1].getPreco()){
        
        Carro carroAnalisado = carro[carroSobAnalise];
        Carro carroAntecessor = carro[carroSobAnalise -1];

        carro[carroSobAnalise] = carroAntecessor;
        carro[carroSobAnalise -1] = carroAnalisado;
        
        carroSobAnalise --;
      }
    }
       for(Carro x : carro){
      System.out.println(x);
    }
  }
  

   public static void selectionSort(Carro[] carro) {
   for(int atual = 0; atual < (carro.length -1); atual++) {
      
    int menor = analisarMenorPreco(carro, atual, carro.length);
    
    Carro produtoAtual = carro[atual];
    Carro produtoMenor = carro[menor];
      
    carro[atual] = produtoMenor;
    carro[menor] = produtoAtual;
 }

  System.out.println("\n\n");
 for(Carro carros: carro){ System.out.println("\t"+ carros.getNome() + " " + carros.getPreco());}
      
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
