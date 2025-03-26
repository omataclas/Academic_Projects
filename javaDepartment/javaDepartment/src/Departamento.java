public class Departamento extends Instituto{

    private String nomeDep;

    public void setNomeDep(String newNomeDep){
        this.nomeDep = newNomeDep;
    }

    public String getNomeDep(){
        return nomeDep;
    }


    private String responsavel;

    public void setResponsavel(String newResponsavel){
        this.responsavel = newResponsavel;
    }

    public String getResponsavel(){
        return responsavel;
    }
}
