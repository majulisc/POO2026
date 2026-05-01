public class Sala {
    private String nome;
    private boolean ocupada;
    private Aluno[] turma = new Aluno[10];
    private int diaDeAula = 0;

    public boolean  alternar (boolean ocupada){
        if (ocupada  == false){
            return true;
        }
        else{
            return false;
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    public int getDiaDeAula() {
        return diaDeAula;
    }

    public void setDiaDeAula(int diaDeAula) {
        this.diaDeAula = diaDeAula;
    }

   
}
