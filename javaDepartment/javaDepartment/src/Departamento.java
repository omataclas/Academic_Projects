public class Departamento extends Instituto{ // CRIAÇÃO DA CLASSE

    private String nomeDep; // CRIAÇÃO DE ATRIBUTO ESPECIFICO DA CLASSE

    public void setNomeDep(String newNomeDep){ // METHODO SET
        this.nomeDep = newNomeDep;
    }

    public String getNomeDep(){ // METHODO GET
        return nomeDep;
    }


    private String responsavel;

    public void setResponsavel(String newResponsavel){ // TODOS OS METHODOS SET E GET
        this.responsavel = newResponsavel;             // DEMONSTRAM ENCAPSULAMENTO
    }

    public String getResponsavel(){
        return responsavel;
    }
}
