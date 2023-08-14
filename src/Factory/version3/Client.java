package Factory.version3;

public class Client {
    public static void main(String[] args) {
        Database db;

//        DatabaseFactory dbf;
//        if(db instanceof MySQLDatabase){
//            dbf = new MySQLdbFactory();
//        }else if(db instanceof PostgreSQLDatabase){
//            dbf = new PostreSQLdbFctory();
//        }
//

        DatabaseFactory dbf = db.createDatabaseFactory();

        Query q = dbf.createQuery();

    }
}
