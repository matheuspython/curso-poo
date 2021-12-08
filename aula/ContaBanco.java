
public class ContaBanco {
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  public void estadoAtual(){
    System.out.println("-------------------" );
    System.out.println("Conta " + this.getNumConta());
    System.out.println("Tipo " + this.getTipo());
    System.out.println("Dono " + this.getDono());
    System.out.println("Saldo " + this.getSaldo());
    System.out.println("Status " + this.getStatus());
    System.out.println("-------------------" );
  }
  
  public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if(t == "CC"){
      this.setSaldo(50);
    }else if(t == "CP"){
      this.setSaldo(150);
    }else{
      System.out.print("erro");
      return;
    }

  }

  public void fecharConta(){
    if(this.getSaldo() > 0){
      System.out.print("n da pra fechar");
    }else if(this.getSaldo()<0){
      System.out.print("n da pra fechar");
    }else{
      this.setStatus(false);
      System.out.print("conta fechada");
    }
  }
  public void depositar(float value){
    if(this.getStatus()){
      setSaldo(this.getSaldo() + value);
      System.out.print("deposito realizado");
    }else{
      System.out.print("cria uma conta antes meu filho");
      
    }
  }
  public void sacar(float value){
    if(this.getStatus()){
      if(this.getSaldo() >= value){
        this.setSaldo(this.getSaldo()-value);
        System.out.println("saldo realizado na conta dee" + this.getDono());
      }else{
        System.out.print("cria uma conta antes meu filho");
      }
    }
  }
  public void pagarMensal(){
    int value = 0;
    if (this.getTipo() == "CC") {
      value = 12;
    } else if(this.getTipo()=="CP"){
      value = 20;
    }
    if(this.getStatus()){
      this.setSaldo(this.getSaldo() - value);
      System.out.print("Mensalidade paga");
    }else{
      System.out.print("cria uma conta antes meu filho");
    }
  }

  public ContaBanco(){
    this.setStatus(false);
    this.setSaldo(0);

  }


  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getTipo() {
    return tipo;
  }
  public void setDono(String dono) {
    this.dono = dono;
  }
  public String getDono() {
    return dono;
  }
  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }
  public int getNumConta() {
    return numConta;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  public float getSaldo() {
    return saldo;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }
  public boolean getStatus() {
    return status;
  }
}
