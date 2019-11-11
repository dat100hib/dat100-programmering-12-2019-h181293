package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteLedig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while (pos < nesteLedig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			} else
				pos++;
		}
		if (funnet) {
			return pos;
		} else
			return -1;
		// Innlegg.erLik(innlegg);
	}

	public boolean finnes(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg) == -1;

		if (ny && nesteLedig < innleggtabell.length) {
			innleggtabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		} else
			return false;
	}

	public boolean ledigPlass() {
		if (nesteLedig < innleggtabell.length) {
			return true;
		} else
			return false;
	}

	public boolean leggTil(Innlegg innlegg) {
        
        boolean lagtTil = false;
        
        if(ledigPlass() && !finnes(innlegg)) {
            innleggtabell[nesteLedig] = innlegg;
            lagtTil = true;
            nesteLedig++;
            
        }
        return lagtTil;
    }		
	

	public String toString() {
	//	for (int i = 0; i < getAntall(); i++) {
		
	//	}
		return (Integer.toString(getAntall()) + "");
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}