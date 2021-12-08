public class Caneta {
  private String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;

  public Caneta(String modelo, String cor, float ponta){
    this.tampar();
    this.cor = cor;
    this.modelo = modelo;
    this.ponta = ponta;
  }
  
  public void setCarga(int carga) {
    this.carga = carga;
  }
  public int getCarga() {
    return carga;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public String getModelo(){
    return this.modelo;
  }
  public void setTampada(boolean tampada) {
    this.tampada = tampada;
  }
  public boolean getTampada() {
    return tampada;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  public String getCor() {
    return cor;
  }
  public float getPonta(){
    return this.ponta;
  }
  public void setPonta(float ponta) {
    this.ponta = ponta;
  }


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

  public void rabiscar(){
    if(this.tampada){
    System.out.print("n da ela ta tampada \n");
    return; 
    }
    System.out.print("Rabiscando \n");
  }

  public void tampar(){
    this.tampada = true;
  }
  
  public void destampar(){
    this.tampada = false;
  }
}
