
/**
 * @author Alunos
 */
public class Pessoa {

    // atributos significa característica
    public String nome, sobrenome, cpf;
    public byte idade;
    public float peso, altura;
    public char sexo;

    @Override
    public String toString(){
        return "Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nSexo: " + sexo
                + "\nCPF: " + cpf;
    }
}
