package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	public static Integer sumaFinantata;


	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte +  ", DenumireProiect=" + Arrays.toString(denumiriProiect) + "Facultate=" + facultate + ", An_studii=" + an_studii ;
	}

	public static void setSumaFinantata(Integer sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}
	public void afisareFinantare() {
		int s=20;
		System.out.println("Studentul "+super.getNume()+" "+super.getPrenume()+" primeste "+ Student.sumaFinantata +" Euro/zi in proiect.");
	}

}
