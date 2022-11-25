public class Fifo {

        // dopisac modulo do dodawania liczb jak kolejka jest poelna od gory i niepelna od dolu
    int [] tab ;
    int ostatniNumerek;
    int poprzedniostatniNumerek;
    int index;
    int ilosc_elementow;
    Fifo(int [] tab)
    {
        this.tab=tab;
        ostatniNumerek=-1;
        poprzedniostatniNumerek =0;
        ilosc_elementow=0;
        index=0;
    }

    void enqueue(int liczba)
    {
        this.tab[ostatniNumerek+1]=liczba;
        poprzedniostatniNumerek=ostatniNumerek;
        ilosc_elementow++;
        ostatniNumerek++;
    }
    void dequeue()
    {
        this.tab[index]=0;
        index++;
        ilosc_elementow--;

    }
    void print()
    {
        for(int i =index;i<ilosc_elementow+index;i++)
        {
            System.out.print(tab[i]+",");
        }
        System.out.println();
    }
}
