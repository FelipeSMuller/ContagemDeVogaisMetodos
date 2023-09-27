package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class ContagemVogais {

	public static String contaVogal(String frase) {

		int contagem = 0;

		for (int i = 0; i < frase.length(); i++) {

			char caractere = frase.charAt(i);

			if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o'

					|| caractere == 'u') {

				contagem++;

			}

		}

		frase = frase.toUpperCase();

		if (contagem > 0) {

			JOptionPane.showMessageDialog(null, "A frase fornecida " + frase + " tem " + contagem + " vogais ");

		} else {
			
			JOptionPane.showMessageDialog(null, "A frase fornecida " + frase + " não tem nenhuma vogal ");

		}

		return frase;

	}

}
