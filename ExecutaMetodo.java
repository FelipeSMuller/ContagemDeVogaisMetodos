package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class ExecutaMetodo {

	public static void main(String[] args) {

		/*
		 * Exercício 3: Contagem de Vogais Crie um método que aceite uma string como
		 * parâmetro e retorne o número de vogais (letras 'a', 'e', 'i', 'o', 'u') na
		 * string. O método deve contar as vogais, independentemente de estarem em
		 * maiúsculas ou minúsculas.
		 */

		String frase;

		do {

			try {

				frase = JOptionPane.showInputDialog(null,
						"Digite uma frase, o programa verificará a quantidade de vogais presentes");

				if (frase == null) {

					JOptionPane.showMessageDialog(null, "Você precisa preencher o campo!!!");

					break;
				}

			} catch (NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente");

				break;

			}

			ContagemVogais.contaVogal(frase);

		} while (frase != null);

	}

}
