public class shoppingsrj{

    private String nome;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public shoppingsrj(String nome, String rua, int numero, String bairro, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome+ "\nNúmero: " + numero+ "\nBairro: " + bairro+ "\nCidade: " + cidade);
    }

    public static void main(String[] args) {
        shoppingsrj shopping = new shoppingsrj("Shopping Plaza Niterói", "Rua Quinze de Novembro", 8, "Centro", "Niterói");
        shopping.imprimirDados();
    }
}