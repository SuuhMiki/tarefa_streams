package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        
        // Adicionando pessoas fictícias
        pessoas.add(new Pessoa("Maria Silva", "F"));
        pessoas.add(new Pessoa("João Santos", "M"));
        pessoas.add(new Pessoa("Ana Costa", "F"));
        pessoas.add(new Pessoa("Pedro Oliveira", "M"));
        pessoas.add(new Pessoa("Juliana Souza", "F"));
        pessoas.add(new Pessoa("Carlos Ferreira", "M"));
        pessoas.add(new Pessoa("Beatriz Lima", "F"));
        pessoas.add(new Pessoa("Rafael Alves", "M"));
        pessoas.add(new Pessoa("Camila Pereira", "F"));
        pessoas.add(new Pessoa("Lucas Rodrigues", "M"));
        
        System.out.println("\n--- Lista completa de pessoas ---");
        pessoas.forEach(p -> System.out.println(p));
        
        // Usando expressões lambda para filtrar apenas as mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("F"))
                .collect(Collectors.toList());
        
        System.out.println("\n--- Lista de mulheres ---");
        mulheres.forEach(p -> System.out.println(p));
    }
}
