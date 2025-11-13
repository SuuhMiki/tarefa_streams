package src.test.java;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import src.main.java.Pessoa;

public class MainTest {
    
    private List<Pessoa> pessoas;
    
    @Before
    public void setUp() {
        pessoas = new ArrayList<>();
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
    }
    
    @Test
    public void testListaContemApenasMultheres() {
        // Filtra apenas as mulheres usando streams
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("F"))
                .collect(Collectors.toList());
        
        // Verifica se a lista não está vazia
        assertFalse("A lista de mulheres não deve estar vazia", mulheres.isEmpty());
        
        // Verifica se todas as pessoas na lista filtrada são mulheres
        boolean todasSaoMulheres = mulheres.stream()
                .allMatch(p -> p.getSexo().equals("F"));
        
        assertTrue("A lista deve conter apenas mulheres", todasSaoMulheres);
        
        // Verifica que nenhuma pessoa na lista é homem
        boolean nenhumHomem = mulheres.stream()
                .noneMatch(p -> p.getSexo().equals("M"));
        
        assertTrue("A lista não deve conter homens", nenhumHomem);
        
        // Verifica a quantidade esperada de mulheres (5 mulheres na lista original)
        assertEquals("Deve haver 5 mulheres na lista", 5, mulheres.size());
        
        System.out.println("Teste passou! A lista contém apenas mulheres:");
        mulheres.forEach(System.out::println);
    }
}
