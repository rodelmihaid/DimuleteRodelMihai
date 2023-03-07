package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {

    private String fileName = "";

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public ReaderAplicant(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    public void citesteAplicant(Scanner scanner, Aplicant aplicant){
        aplicant.setNume(scanner.next());
        aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctaj(scanner.nextInt());
        aplicant.setNrProiecte(scanner.nextInt());
        String[] denumiriProiecte = new String[aplicant.getNrProiecte()];
        for (int i = 0; i < aplicant.getNrProiecte(); i++)
            denumiriProiecte[i] = scanner.next();
        aplicant.setDenumiriProiect(denumiriProiecte);
    }
}
