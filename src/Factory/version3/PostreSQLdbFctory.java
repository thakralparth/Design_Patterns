package Factory.version3;

public class PostreSQLdbFctory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new PostgreSQLQuery();
    }
}
