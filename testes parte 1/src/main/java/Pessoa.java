package src.main.java;

public class Pessoa {
    private String nome;
    private String sexo;
    
    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    @Override
    public String toString() {
        String sexoCompleto = sexo.equals("M") ? "Masculino" : "Feminino";
        return nome + " - " + sexoCompleto;
    }
}
