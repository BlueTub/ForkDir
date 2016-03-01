package control;

import java.io.File;

public class Pastas extends Thread {
	private String nome;
	private StringBuffer sbDir = new StringBuffer();

	public Pastas(String nome, StringBuffer sbDir) {
		this.sbDir = sbDir;
		this.nome = nome;
	}

	@Override
	public void run() {
		AbrePasta();
	}

	public void AbrePasta() {

		String caminho = "";
		String caminho2 = "";

		for (int i = 0; i < 10; i++) {

			// //nome = (nome + i);
			File newDir = new File(sbDir.toString() + nome);
			caminho2 = "";
			if (!newDir.exists()) {
				newDir.mkdir();

			}
			for (int j = 0; j < 1000; j++) {
				caminho2 = (caminho2 + "\\" + nome + j);
				caminho = (sbDir.toString() + nome + caminho2);
				File newDir1 = new File(caminho);
				if (!newDir1.exists()) {
					newDir1.mkdir();
				}
			}

		}

	}// abrepasta
}// class
