package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private Integer salariu;
	public static Integer sumaFinantata;

	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public Integer getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();

	}


	public static void setSumaFinantata(Integer sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}

	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
				+ Arrays.toString(denumiriProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}


	public void afisareFinantare() {
		// TODO Auto-generated method stub
		System.out.println("Angajatul "+ super.getNume()+ " " + super.getPrenume()+" primeste "+ Angajat.sumaFinantata +" Euro/zi in proiect.");
	}

}
