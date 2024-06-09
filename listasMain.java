package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import listasDeFuncionarios.Funcionario;

public class listasMain {

	public static void main(String[] args) {
		listaCompletaDeFuncionarios();
	}

	public static void listaCompletaDeFuncionarios() {
		List<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(new Funcionario("josé", "masculino"));
		funcionarios.add(new Funcionario("maria", "Feminino"));
		funcionarios.add(new Funcionario("marcos", "Masculino"));
		funcionarios.add(new Funcionario("Carlos", "Masculino"));
		funcionarios.add(new Funcionario("Yasmin", "Feminino"));
		funcionarios.add(new Funcionario("Antonio", "Masculino"));
		funcionarios.add(new Funcionario("Tabata", "Feminino"));
		
		
		Collections.sort(funcionarios);
		
		System.out.println(funcionarios);

	}

}
