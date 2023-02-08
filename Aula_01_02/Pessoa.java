//Incompleto

package Java;

public class pessoa {
    private String nome;
    private int idade;
    private double altura;

    public pessoa (String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome+ "Idade: " + idade+ "Altura: " + altura);
    }

    public void saudacao(){
        System.out.print("Olá, meu nome é " + nome+ ", tenho " + idade+ "anos, e minha altura é " + altura);
    }
    public static void main(String[] args){
        pessoa pessoa = new pessoa("Daniel Nogueira", 19, 1.90);
        pessoa.saudacao();
    }
}