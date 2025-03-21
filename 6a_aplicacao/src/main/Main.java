package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Aluno[][] escola = new Aluno[3][5];
		
		for(int i = 0; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "Alunos da classe " + (i+1));
			for(int j = 0; j < 5; j++) {
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
				String nota = JOptionPane.showInputDialog("Digite a nota do aluno: ");
				float numero = Float.parseFloat(nota);
				escola[i][j] = new Aluno(nome, numero);
				System.out.println(escola[i][j].nome + " " + escola[i][j].nota);
			}
		}
		
		float[] somasClasse = new float[5];
		float[] mediasClasse = new float[3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				somasClasse[i] += escola[i][j].nota;
			}
			mediasClasse[i] = (somasClasse[i]/5);
			JOptionPane.showMessageDialog(null, "Media da classe " + (i+1) + mediasClasse[i]);
		}
		
		float mediaGeral = 0;
		
		for(int i = 0; i < 3; i++) {
			mediaGeral += mediasClasse[i];
		}
		
		JOptionPane.showMessageDialog(null, "Media geral: " + (mediaGeral/3));
		
	}

}
