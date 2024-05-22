package Interfaces;

interface DbSupertype {
    Boolean connect();
    String getData();
}

public class DataProcessor {
    public String process(DbSupertype db){
        if( db.connect() ) {
            String s = db.getData();
            System.out.println(s);
            return s;
        } else return "";
    }

    public static void main(String[] args) {
//        new DbSupertype().x;
//        System.out.println(DbSupertype.x);
        new DataProcessor().process(new OracleDb());
        new DataProcessor().process(new SqlServerDb());
        new DataProcessor().process(new PostgressDb());
    }
}

class OracleDb implements DbSupertype{
    @Override
    public Boolean connect() {
        return true;
    }

    @Override
    public String getData() {
        return "Oracle";
    }
}
class SqlServerDb implements DbSupertype{
    @Override
    public Boolean connect() {
        return true;
    }

    @Override
    public String getData() {
        return "SqlServer";
    }
}
class PostgressDb implements DbSupertype{
    @Override
    public Boolean connect() {
        return true;
    }

    @Override
    public String getData() {
        return "Postgres";
    }
}