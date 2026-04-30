public class Sala {
    private String nome;
    private boolean ocupada;
    private Aluno[] turma = new Aluno[[10];
    private int diaDeAula = 0;

    public boolean  alternar (boolean ocupada){
        if (ocupada  == false){
            return true;
        }
        else{
            return false;
        }
    }
}
