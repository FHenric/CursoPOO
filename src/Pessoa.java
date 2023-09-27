public class Pessoa {
    private String nome;
    private double altura;
    private int idade;

    public String apresentar(Pessoa pessoa) {
        return "Olá, meu nome é " + pessoa.getNome() + " tenho " + pessoa.getIdade() + " anos de idade e " + pessoa.getAltura() + "m de altura";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
}
