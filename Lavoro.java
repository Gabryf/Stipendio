package lavoro;

import java.io.BufferedReader;     //Libreria per l'input.
import java.io.InputStreamReader;  //Libreria per l'input.
import java.io.IOException;        //Libreria per la correzione di errori.

public class Lavoro {

public static void main(String[] argv) {

boolean controllo = false;
    
InputStreamReader inp = new InputStreamReader(System.in);
  BufferedReader tastiera = new BufferedReader(inp);
  
  //creazione dell'oggetto!
  Anagrafica contatto = new Anagrafica();
  
 do {
   try {
    System.out.println("Inserisci il nome del dipendente:");
    contatto.nome = tastiera.readLine();
    if (contatto.nome.length() > 0 || contatto.nome.length() < 70) {
    controllo = true;
    } else {
    throw new IOException();
    }
   } catch (IOException e) {
   System.err.println("Errore nell'inserimento, inserire nuovamente il nome del dipendente rispettando le dimensioni! ");
   controllo = false;
   }
  } while (controllo == false);

do {
   try {
    System.out.println("Inserisci il cognome del dipendente:");
    contatto.cognome = tastiera.readLine();
    if (contatto.cognome.length() > 0 || contatto.cognome.length() < 70) {
    controllo = true;
    } else {
    throw new IOException();
    }
   } catch (IOException e) {
   System.err.println("Errore nell'inserimento, inserire nuovamente il cognome del dipendente rispettando le dimensioni! ");
   controllo = false;
   }
  } while (controllo == false);

   try {
    System.out.println("Inserisci l'email del dipendente:");
    String email = tastiera.readLine();
    contatto.registraEmail(email);
   }catch (IOException e) {}
   

System.out.println("Ecco i dati del dipendente:");
contatto.stampaDati();
    }
    
}
