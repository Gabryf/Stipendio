package lavoro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dipendente extends Anagrafica {

    public int stipendio = 1400;
    
public void scegliLivello() {

    int stipendioconliv;
    boolean controllo = false;
    int valore = 0;
    
    InputStreamReader inp = new InputStreamReader(System.in);
  BufferedReader tastiera = new BufferedReader(inp);
  
  do {
  try {
  System.out.println("Inserisci il movimento che vuoi eseguire:");
  System.out.println("-------------------------------------------");
  System.out.println("Inserisci 1 per avere uno stipendio senza aggiunta");
  System.out.println("Inserisci 2 per avere un agginunta del 10%");
  System.out.println("Inserisci 3 per avere un agginunta del 20%");
  System.out.println("Inserisci 4 per avere un agginunta del 30%");
  System.out.println("Inserisci 5 per avere un agginunta del 40%");
  System.out.println("Inserisci 6 per avere un agginunta del 50%");
  System.out.println("Inserisci 7 per avere un agginunta del 60%");
  System.out.println("Inserisci 8 per uscire dal programma!");
  System.out.println("-------------------------------------------");
  valore = Integer.valueOf(tastiera.readLine());
  if (valore <= 0 || valore >= 9) {
  throw new Exception();
  }
  } catch (Exception e) {
  System.err.println("Errore durante l'inserimento!");
  controllo = false;
  continue; }
  
  switch (valore) {

  case 1:
      stipendioconliv = stipendio;
      System.out.println("Lo stipendio del dipendente è uguale a = " + stipendioconliv);
      controllo = false;
  break;

  case 2:
      stipendioconliv = stipendio + ((10*stipendio)/100);
      System.out.println("Lo stipendio del dipendente è uguale a = " + stipendioconliv);
      controllo = false;      
  break;

  case 3:
      stipendioconliv = stipendio + ((20*stipendio)/100);
      System.out.println("Lo stipendio del dipendente è uguale a = " + stipendioconliv);
  break;

  case 4:
      stipendioconliv = stipendio + ((30*stipendio)/100);
      System.out.println("Lo stipendio del dipendente è uguale a = " + stipendioconliv);
      controllo = false;
  break;
 
  case 5:
      stipendioconliv = stipendio + ((40*stipendio)/100);
      System.out.println("Lo stipendio del dipendente è uguale a = " + stipendioconliv);
      controllo = false;
  break;
  
  case 6:
      stipendioconliv = stipendio + ((50*stipendio)/100);
      System.out.println("Lo stipendio del dipendente è uguale a = " + stipendioconliv);
      controllo = false;
  break;
  
  case 7:
      stipendioconliv = stipendio + ((60*stipendio)/100);
      System.out.println("Lo stipendio del dipendente è uguale a = " + stipendioconliv);
      controllo = false;
  break;
  
  case 8:
      controllo = true;
  break;

  default:
  System.out.println("Errore, hai sbagliato qualcosa nel programma!");
  controllo = true;
  break;
  }
  }while(controllo == false);
  }
   
public void stampaStipendio() {

System.out.println("Stipendio = " + stipendio);
    
}

}
