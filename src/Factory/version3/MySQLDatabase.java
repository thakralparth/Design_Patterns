package Factory.version3;

import javax.xml.crypto.Data;

public class MySQLDatabase implements Database{
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySQLdbFactory();
    }
}
