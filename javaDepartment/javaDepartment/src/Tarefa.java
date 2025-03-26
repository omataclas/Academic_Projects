public class Tarefa extends Departamento{
    
    private String nomeTar;

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
}
