import java.sql.SQLOutput;

public class Stos {

    private int pozycja; // ta na ktora mozna cos wstawic
    private int [] stos;

    Stos(int []stos)
    {
        pozycja=-1;
        this.stos=stos;
    }

    int push(int liczba) throws ArrayIndexOutOfBoundsException
    {
        try{
            this.stos[this.pozycja+1]= liczba;
            this.pozycja++;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception:Stack overflow");
            System.exit(-1);
        }

        return pozycja;
    }
    void pop() throws ArrayIndexOutOfBoundsException
    {
        this.stos[pozycja]=0;
        pozycja--;


//        try {
//            for (int i = miejsce; i < pozycja; i++) {
//                this.stos[i] = this.stos[i + 1];
//            }
//            this.stos[pozycja] = 0;
//            this.pozycja--;
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Exception:Too many elements subtracted");
//            System.exit(-1);
//        }

    }
    int GetPozycja()
    {
        return pozycja;
    }
    int [] GetStos()
    {
        return stos;
    }
    void print ()
    {
        for(int i =0;i<pozycja+1;i++)
        {
            System.out.print(stos[i]+",");
        }
        System.out.println();
    }

}
