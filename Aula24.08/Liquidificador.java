public class Liquidificador implements Tomada {
    public String marca;
    public String modelo;
    public int tensao;
    public boolean chave = false;
    
}

public Liquidificador (String marca, String modelo, int tensao){
    this.marca = marca;
    this.modelo = modelo;
    this.tensao = tensao;
}

public void ligar(){
    if(chave){
        System.out.println("");

    }
}
