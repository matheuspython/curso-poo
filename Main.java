class Main {
  public static void main(String[] args) {
    Caneta caneta1 = new Caneta();    
    caneta1.cor = "azul";
    caneta1.ponta = 0.5f;
    caneta1.tampada = false;
    // caneta1.staus();
    // caneta1.tampar();
    // caneta1.staus();
    caneta1.rabiscar();
    caneta1.tampar();
    caneta1.rabiscar();
    
  }
}