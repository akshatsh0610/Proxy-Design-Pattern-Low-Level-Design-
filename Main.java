public class Main
{
    public static void main(String[] args)
    {
        DataBaseExecutor emp1 = new DataBaseProxy("NON ADMIN");
        emp1.executeQuery("READ");
        emp1.executeQuery("WRITE");
        emp1.executeQuery("DELETE");

        DataBaseExecutor emp2 = new DataBaseProxy("ADMIN");
        emp2.executeQuery("READ");
        emp2.executeQuery("WRITE");
        emp2.executeQuery("DELETE");

    }
}
