

public class Lutador {
  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates;
  private float altura, peso;

  public void apresentar(){
    System.out.println("CHEGOU A HORA APRESENTAMOS O LUTADOR " + this.getNome());
    System.out.println("Diretamente de " + this.getNacionalidade());
    System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura()+"m de altura");
    System.out.println("Pesando"+this.getPeso() + "kg");
    System.out.println("na categoria "+ this.getCategoria());
    System.out.println(this.getVitorias() + "VITORIAS");
    System.out.println(this.getDerrotas() + "DERROTAS");
    System.out.println(this.getEmpates() + "EMPATES");
  }

  public void status(){
    System.out.println(this.getNome() + "é um peso" + this.getCategoria());
    System.out.println("GANHOU"+ this.getVitorias()+"VEZES");
    System.out.println("PERDEU"+this.getDerrotas()+"VEZES");
    System.out.println("EMPATOU" +this.getDerrotas()+"VEZES");
  }

  public void ganharLuta(){
    this.setVitorias(this.getVitorias() + 1);
  }

  public void perderLuta(){
    this.setDerrotas(this.getDerrotas() + 1);
    
  }

  public void empate(){
    this.setEmpates(this.getEmpates() + 1);
    
  }
  public Lutador(String nome,int idade,float altura,String nacionalidade,float peso,int vitorias,int derrotas,int empates){
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.setPeso(peso);
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
  }
  public float getAltura() {
    return altura;
  }
  public String getCategoria() {
    return categoria;
  }
  public int getDerrotas() {
    return derrotas;
  }
  public int getEmpates() {
    return empates;
  }
  public int getIdade() {
    return idade;
  }
  public String getNacionalidade() {
    return nacionalidade;
  }
  public String getNome() {
    return nome;
  }
  public float getPeso() {
    return peso;
  }
  public int getVitorias() {
    return vitorias;
  }
  public void setAltura(float altura) {
    this.altura = altura;
  }
  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }
  private void setCategoria() {
    if(this.peso < 52.2){
      this.categoria = "invalido";
    }else if(this.peso <= 70.3){
      this.categoria = "leve";
    }else if(this.peso <= 83.9){
      this.categoria = "Médio";
    }else if (this.peso <= 120.2){
      this.categoria = "pesado";
    }else {
      this.categoria = "Inválido";
    }
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }
  public void setEmpates(int empates) {
    this.empates = empates;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }
}
