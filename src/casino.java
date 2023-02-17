import java.util.Scanner;
public class casino extends conti {
	
	public casino(double contoGiocatore, double contoCasino) {
		super(contoGiocatore, contoCasino);
		
		}
	Scanner in=new Scanner(System.in);
	
	public void gioco () {
		while (true) {	
			System.out.println("Inserisci il numero su cui punti: ");
			int n=in.nextInt();
			if (n>6||n<1) {
				System.out.println("Il dado ha sei facce, prova con un numero da uno a sei se vuoi.");
			}
			else {
				System.out.println("Inserisci il valore della tua puntata");
				double importo=in.nextDouble();
				
				if (importo>contoGiocatore) {
					System.out.println("Importo non valido.");
				}
				else {
					int dado=(int)(Math.random()*7);
					if(n==dado) {
						System.out.println("Hai vinto.");
						contoGiocatore=contoGiocatore+(5*importo);
						contoCasino=contoCasino-(5*importo);
						System.out.println("Conto aggiornato: " + contoGiocatore);
					}
				
					else {
						System.out.println("Hai perso.");
						contoGiocatore=contoGiocatore-importo;
						contoCasino=contoCasino+importo;
						System.out.println("Conto aggiornato: " + contoGiocatore);
					}
				}	
			}
			
			
			if (contoGiocatore<=0) 
				break;
			System.out.println("Giocare nuovamente?");
			String risposta=in.next();
			if (risposta.equals("No") || risposta.equals("no"))
				break;
		}
		System.out.println("Okey il conto finale del giocatore è: " + contoGiocatore + "Il conto finale del casinò è: " + contoCasino);
	}
}
