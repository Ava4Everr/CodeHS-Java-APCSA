public class WorkShift
{
    public static void main(String[] args)
    {
        int docHours = 20;
        int docMins = 42;
        int docSec = 16;
        docHours *= 60;
        docMins += docHours;
        docMins *= 60;
        docSec += docMins;
        System.out.println(docSec);
    }
}
