public class Carro {
private String marca;
private int velocidade;

public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public int getVelocidade() {
    return velocidade;
}
public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
}
//metodos
public void acelerar (int soma){
    velocidade = this.velocidade + soma;


}
}
