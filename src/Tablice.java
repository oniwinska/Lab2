import java.util.Arrays;
import java.util.stream.IntStream;
public class Tablice
{
    public static void main(String[] args)
    {
        int tab1[]= {1,2,3,4,5};
        int tab2[]= {6,7,8,9};

        int suma1 = Arrays.stream(tab1).sum();
        int suma2 = Arrays.stream(tab2).sum();
        int wynik = suma1+suma2;
        System.out.println("Suma tablic: "+ wynik);


        int max1 = Arrays.stream(tab1).max().getAsInt();
        int min1 = Arrays.stream(tab1).min().getAsInt();

        int max2 = Arrays.stream(tab2).max().getAsInt();
        int min2 = Arrays.stream(tab2).min().getAsInt();

        System.out.println("Maksimum tablicy 1: "+ max1);
        System.out.println("Minimum tablicy 1: "+ min1);

        System.out.println("Maksimum tablicy 2: "+ max2);
        System.out.println("Minimum tablicy 2: "+ min2);



        double srednia1 = Arrays.stream(tab1).average().getAsDouble();
        double srednia2 = Arrays.stream(tab2).average().getAsDouble();

        System.out.println("Srednia tablicy 1: "+ srednia1);
        System.out.println("Srednia tablicy 2: "+ srednia2);



        int[] kopiaTab1 = Arrays.copyOf(tab1, tab1.length);
        int[] kopiaTab2 = Arrays.copyOf(tab2, tab2.length);


        int[] tablicaLiczbMniejszychOd4 = Arrays.stream(tab1).filter(element -> element < 4).toArray();
        System.out.print("Tablica liczb mniejszych od 4: ");
        for (int i = 0; i < tablicaLiczbMniejszychOd4.length; i++)
        {
            System.out.print(tablicaLiczbMniejszychOd4[i] + " ");
        }
        System.out.println();



        int[] tablicaLiczbBez7 = Arrays.stream(tab2).filter(element -> element != 7).toArray();
        System.out.print("Tablica liczb bez 7: ");
        for (int i = 0; i < tablicaLiczbBez7.length; i++)
        {
            System.out.print(tablicaLiczbBez7[i] + " ");
        }
        System.out.println();




        int[] polaczoneTablice = IntStream.concat(Arrays.stream(tab1), Arrays.stream(tab2)).toArray();
        System.out.print("Polaczone tablice: ");
        for (int i = 0; i < polaczoneTablice.length; i++)
        {
            System.out.print(polaczoneTablice[i] + " ");
        }
        System.out.println();




        int szukanaLiczba = 3;
        long wystapienia =Arrays.stream(polaczoneTablice).filter(element -> element== szukanaLiczba).count();
        System.out.println("Liczba wystapien wartosci " + szukanaLiczba + ": "+ wystapienia);
    }





}
