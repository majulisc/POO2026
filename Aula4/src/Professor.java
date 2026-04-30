public class Professor {
private String nome;
private int idade;
private int matricula;
private Sala sala;


/*metodo -->iniciarAula == Verifica se a sala está desocupada (isOcupada() == false)
Se estiver desocupada → chama alternar para ocupar a sala e imprime a mensagem com nome e matrícula do professor
Se já estiver ocupada → imprime que a sala está ocupada */

public void iniciarAula (){
    if (sala.isOcupada()== false){
        sala.alternar(sala.isOcupada()); // muda para ocupada ESTUDAR MAIS ISSO!
        System.out.println("aual do professor: " + nome + " e matricula: " + matricula);
    }
    else{
        System.out.println("Sala ocupada.");
    }
}






public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public int getMatricula() {
    return matricula;
}
public void setMatricula(int matricula) {
    this.matricula = matricula;
}
public Sala getSala() {
    return sala;
}
public void setSala(Sala sala) {
    this.sala = sala;
}



}
