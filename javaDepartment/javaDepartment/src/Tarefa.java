public class Tarefa extends Departamento{ // CRIAÇÃO DA SUBCLASSE
    
    public String nomeTar;

    public void setNomeTar(String newNomeTar){
        this.nomeTar = newNomeTar;
    }

    public String getNomeTar(){
        return nomeTar;
    }
    
    
    private Boolean isCompleta = false;

    public void setIsCompleta(Boolean newIsCompleta){
        this.isCompleta = newIsCompleta;
    }

    public Boolean getIsCompleta(){
        return isCompleta;
    }
} // A SUBCLASSE TEM HERANÇA DA CLASSE DEPARTAMENTO E DA CLASSE INSTITUTO
