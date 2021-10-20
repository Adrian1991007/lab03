package ro.usv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Flota {
    private int NrNave;
    private Nava[] nave;

    public Flota() {
        nave = new Nava[10];
        NrNave = 0;
    }

    public Flota(String NumeFisier) throws FileNotFoundException {
        NrNave = 0;
        String line;
        String[] Result;

        Scanner scanner = new Scanner(new File(NumeFisier));

        int Numar = Integer.parseInt(scanner.nextLine());
        nave = new Nava[Numar];
        while (scanner.hasNextLine()) {
            {
                line = scanner.nextLine();
                line = line.replaceAll("\\s", "");
                Result = line.split(",");
                switch (Result[2]) {
                    case "NavaCroaziera" -> this.AdaugaNava(new NavaCroaziera(Result[0], Result[1], Integer.parseInt(Result[3])));
                    case "Cargo" -> this.AdaugaNava(new Cargou(Result[0], Result[1], Integer.parseInt(Result[3])));
                    case "Feribot" -> this.AdaugaNava(new Feribot(Result[0], Result[1], Integer.parseInt(Result[3]), Integer.parseInt(Result[4])));
                }
            }
        }
        scanner.close();
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(NrNave == 0)
            return "Nu exista nave in flota";
        else
        {
            for(int i = 0; i < NrNave; i++)
                stringBuilder.append(i+ 1).append(". ").append(nave[i].toString()).append("\n");
        }
        return "Floata: \n" + stringBuilder;
    }

    public void utilizare() {
        System.out.println("Utilizare flota:");
        for(int i = 0; i< NrNave; i++)
        {
            System.out.print(nave[i].getNume() + " - ");
            nave[i].utilizare();
        }
    }

    public void AdaugaNava(Nava x)
    {
        if (NrNave == nave.length) {
            nave = Arrays.copyOf(nave, nave.length + 1);
            nave[NrNave ] = x;
        }
        nave[NrNave++] = x;
    }

    public static void main(String[] args) throws FileNotFoundException {
//        Flota flota1= new Flota();

//        NavaCroaziera sv = new NavaCroaziera("Suceava", "RO", 1000);
//        flota1.AdaugaNava( sv);
//
//        flota1.AdaugaNava(new NavaCroaziera("Victoria", "RO", 5000));
//        flota1.AdaugaNava(new Cargou("Carpati", "RO", 10000));
//        flota1.AdaugaNava(new Feribot("Dunarea", "BG", 100, 20));
//
//        System.out.println(flota1);
//        flota1.utilizare();

        Flota flota2 = new Flota("flota.txt");
        System.out.println(flota2);
        flota2.utilizare();
    }

}


