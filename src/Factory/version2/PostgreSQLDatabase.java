package Factory.version2;

import Factory.version1.PostgreSqlQuery;
import Factory.version1.Query;

public class PostgreSQLDatabase implements Database{
    @Override
    public Query createQuery() {
        return new PostgreSqlQuery();
    }
}
