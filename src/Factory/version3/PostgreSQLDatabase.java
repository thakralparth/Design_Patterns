package Factory.version3;

public class PostgreSQLDatabase implements Database{
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostreSQLdbFctory();
    }
}
