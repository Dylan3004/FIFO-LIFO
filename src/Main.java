public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] a = new int[10];
        Stos stos = new Stos(a);
        int b =0;
        for(int i =0;i<10;i++)
        {
            stos.push(b);
            stos.print();
            b++;
        }
        //stos.pop(3);
        //stos.pop(0);
       for(int i =0;i<10;i++)
        {
            stos.pop();
            stos.print();
        }
        //stos.pop(1);
        stos.print();

       StosWsk stosWsk = new StosWsk();
       //stosWsk.push(1);
       //stosWsk.push(2);
       //stosWsk.pop();
       //stosWsk.print();
        for(int i =0;i<20;i++)
        {
            stosWsk.push(i);
            stosWsk.print();
        }
        for(int i =0;i<20;i++)
        {
            stosWsk.pop();
            stosWsk.print();
        }
        int [] m = new int[10];
        Fifo fifo = new Fifo(m);
        for(int i=0;i<10;i++)
        {
            fifo.enqueue(i);
            fifo.print();
        }
        fifo.print();
        for(int i=0;i<10;i++)
        {
            fifo.dequeue();
            fifo.print();
        }
        fifo.print();


        FifoWsk fifo1 = new FifoWsk();
        for(int i =0;i<10;i++)
        {
            fifo1.enqueue(i);
            fifo1.print();
        }
        for(int i =0;i<10;i++)
        {
            fifo1.dequeue();
            fifo1.print();
        }
    }
}