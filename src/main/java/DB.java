import org.sql2o.*;
public class DB {


   static String connectionString = "jdbc:postgresql://ec2-50-19-124-157.compute-1.amazonaws.com:5432/dehc35un3cufv1"; //!
    static Sql2o sql2o = new Sql2o(connectionString, "aemeytohzveswb", "e5de24bfc1feaed7ad956b61ebfd238e38bb8554a329d941d302c37bbff04d23");
}


