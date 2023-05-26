import java.util.Objects;

public class DataBaseProxy implements DataBaseExecutor
{
    String id;

    DataBase db;
    private DataBaseProxy()
    {

    }
    public DataBaseProxy(String id)
    {
        this.id = id;
        db = new DataBase();        //connection
    }

    @Override
    public void executeQuery(String QueryType)
    {
        if(QueryType.equals("DELETE") && !Objects.equals(this.id, "ADMIN"))
        {
            System.out.println("cannot execute the query , admin permission is needed");
            return;
        }
         db.execute(QueryType,this.id);
    }
}
