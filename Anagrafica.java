package lavoro;

import java.io.*;
        
public class Anagrafica {

//Attributi pubblici
public String nome;
public String cognome;

//Attributi privati
private String email;
private boolean registra;

public void registraEmail(String email){

    this.email = email;
    registra = true;

}

public void stampaDati() {

System.out.println("Nome =  " + nome);
System.out.println("Nome =  " + cognome);

if(registra){

    System.out.println("Email  = " + email);

}

else {

System.out.println("Email non registrata!");
    
}

}

}
