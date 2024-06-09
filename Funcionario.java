package listasDeFuncionarios;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private String genero;

	public Funcionario(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String toString() {
		return "Funcionario{nome='" + nome + "', genero='" + genero + "'}";
	}
	public int compareTo(Funcionario other) {
        return this.nome.compareTo(other.nome);
    }
}
