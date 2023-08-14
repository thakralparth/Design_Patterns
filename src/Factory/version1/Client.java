package Factory.version1;

public class Client {
    public static void main(String[] args) {
        Database db;

        Query q;

        if(db instanceof PotgreSqlDatabase){
            q=new PostgreSqlQuery();
        }else if(db instanceof MySQLDatabase){
            q=new MySQLQuery();
        }
    }
}
