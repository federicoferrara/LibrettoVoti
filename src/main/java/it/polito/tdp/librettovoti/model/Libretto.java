package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti= new ArrayList<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	/*
	public void StampaVotiUguali(int punteggio) {
		//il libretto stampa da solo i voti
		System.out.println();
	}
	
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il chiamante a stamparli
		// Solo il NOME?
		// o TUTTO?
	}
	*/
	public List<Voto> listraVotiUguali(int punteggio){
		//restituisce solo i voti uguali al criterio
		List<Voto> risultato= new ArrayList<>();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio){
		Libretto risultato= new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s+=v.toString()+"\n";
		}
		return s;
	}
}
