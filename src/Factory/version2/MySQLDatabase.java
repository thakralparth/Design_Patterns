package Factory.version2;

import Factory.version1.MySQLQuery;
import Factory.version1.Query;

public class MySQLDatabase implements Database{
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
