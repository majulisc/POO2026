public class ContaBancaria {
private double saldo;

public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}
//metodos
public void depositar (double valor){
    this.saldo = saldo + valor;

}

public void sacar (double valor){
    if ( valor <= saldo){
        this.saldo= saldo - valor;
}
else{
    System.out.println("saldo insuficiente");
}
}


}
