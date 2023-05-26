public interface DataBaseExecutor
{
    //the executor can be of type admin or non admin
    //admin can execute the query on the database
    //non admin can also execute the query on the database
    public abstract void executeQuery(String Type);
}
