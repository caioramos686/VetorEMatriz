package secao07;
//Vetores part2
public class Programa17 {

	public static void main(String[] args) {
		int num[] = new int[10];
		int vet[] = new int[10];
		
		
		System.out.println("Tamanho do vetor: " + num.length);
		for(int i=0; i<num.length; i++) {
			num[i] = i + 3;
		}
		for(int i=0; i<num.length; i++) {
			System.out.println("Numero: " + num[i]);
		}
		
		System.out.println("-------VETOR 2--------");
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = (int)Math.round(Math.random() * 10);
		}
		for(int i=0; i<vet.length; i++) {
			System.out.println("Numero: " + vet[i]);
		}
		
		System.out.println("---------PARTE 3---------");
		
		for (int i : num) {
			System.out.println(i);
		}
		

	}

}
