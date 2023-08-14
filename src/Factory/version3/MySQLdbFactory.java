package Factory.version3;

public class MySQLdbFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
