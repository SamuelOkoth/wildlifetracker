import org.sql2o.*;
public class DB {

   // public static Sql2o sql2o=new Sql2o("jdbc:postgresql://localhost:5432/wildlife","postgres","12345");

    String connectionString = "postgres://aemeytohzveswb:e5de24bfc1feaed7ad956b61ebfd238e38bb8554a329d941d302c37bbff04d23@ec2-50-19-124-157.compute-1.amazonaws.com:5432/dehc35un3cufv1"; //!
    Sql2o sql2o = new Sql2o(connectionString, "aemeytohzveswb", "e5de24bfc1feaed7ad956b61ebfd238e38bb8554a329d941d302c37bbff04d23");
}


