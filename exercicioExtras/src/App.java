public class App {
    public static void main(String[] args) throws Exception {
    Carro meuCarro = new Carro();   // 1. cria
    meuCarro.setMarca("Toyota");    // 2. configura
    meuCarro.acelerar(30);          // 3. chama método
    System.out.println("Velocidade : " + meuCarro.getVelocidade()); // 4. vê resultado


    ContaBancaria minhaConta = new ContaBancaria(); //cria
    minhaConta.setSaldo(2000);
    minhaConta.sacar(200);
    minhaConta.depositar(30);
    System.out.println("O salde é de: " + minhaConta.getSaldo());

   
}
}
