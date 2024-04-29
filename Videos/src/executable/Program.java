package executable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ArquivoDeVideo;
import entities.VideoDeBiblioteca;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ArquivoDeVideo> list = new ArrayList<>();
		
		System.out.print("Quantos vídeos deseja cadastrar? ");
		int n = sc.nextInt();
		for (int i = 1;i<=n;i++) {
			System.out.print("video normal ou video de biblioteca? n/b");
			char ch = sc.next().charAt(0);
			switch(ch){
				case 'n':
					System.out.print("Quantas horas inteiras tem o vídeo? ");
					double horas = sc.nextDouble();
					sc.nextLine();
					System.out.print("E quantos minutos?");
					double minutos = sc.nextDouble();
					sc.nextLine();
					System.out.print("Qual o formato do vídeo? ");
					String formato = sc.nextLine();
					ArquivoDeVideo av = new ArquivoDeVideo(horas,minutos,formato);
					list.add(av);
					break;
				case 'b':
					System.out.print("Quantas horas inteiras tem o vídeo? ");
					horas = sc.nextDouble();
					sc.nextLine();
					System.out.print("E quantos minutos?");
					minutos = sc.nextDouble();
					sc.nextLine();
					System.out.print("Qual o formato do vídeo? ");
					formato = sc.nextLine();
					System.out.print("Qual o autor do vídeo? ");
					String autor = sc.nextLine();
					System.out.print("O vídeo está emprestado? y/n ");
					boolean emp;
					char resp = sc.next().charAt(0);
					if (resp == 'y') {
						emp = true;
					} else if (resp == 'n') {
						emp = false;
					} else {
						emp = false;
					}
					ArquivoDeVideo bb = new VideoDeBiblioteca(horas,minutos,formato,autor,emp);
					list.add(bb);
						break;
				default:
					System.out.println("ERRO");
					break;
			}
		}
		for (ArquivoDeVideo arq : list) {
			System.out.println(arq.toString());
			System.out.println();
		}
		sc.close();
	}

}
