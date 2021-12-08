public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void staus() {
    String estaTampada;
    if(tampada){
      estaTampada = "sim tampada";
    }else{
      estaTampada = "naõ ela esta destampada";
    }
    System.out.print("--------------------------");
      System.out.print("Modelo: " + this.modelo + "\n");
      System.out.print("Uma caneta " + this.cor + "\n");
      System.out.print("Ponta: " + this.ponta + "\n");
      System.out.print("carga: " + this.carga + "\n");
      System.out.print("esta tampada? " + estaTampada + "\n");
    System.out.print("--------------------------");
  }

  void rabiscar(){
    if(this.tampada){
    System.out.print("n da ela ta tampada \n");
    return; 
    }
    System.out.print("Rabiscando \n");
  }

  void tampar(){
    this.tampada = true;
  }
  
  void destampar(){
    this.tampada = false;
  }
}
