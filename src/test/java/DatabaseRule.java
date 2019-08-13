import org.junit.rules.ExternalResource;
import org.sql2o.*;
public class DatabaseRule extends ExternalResource{
    @Override
    protected void  before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife", "postgres", "12345");

        }
    @Override
       public void after(){
        try(Connection con=DB.sql2o.open()){
            String deleteAnimalsQuery="DELETE FROM animals *;";
            con.createQuery(deleteAnimalsQuery).executeUpdate();
        }
    }

}
