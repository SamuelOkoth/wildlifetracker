import org.sql2o.Connection;

import java.util.List;

public class Endangered extends Animal {
    private int id;
    private String location;
    private String time;
    private String age;
    private String rangerName;
    private String healthStatus;

    public Endangered(String name, String location, String age, String rangerName, String healthStatus) {
        super(name);
        this.location = location;
        this.time = time;
        this.age = age;
        this.rangerName = rangerName;
        this.healthStatus = healthStatus;
        this.type="endangered";
    }

    @Override
    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getAge() {
        return age;
    }

    public String getRangerName() {
        return rangerName;
    }

    public String getHealthStatus() {
        return healthStatus;
    }
    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof Endangered)) {
            return false;
        } else {
            Endangered newEndangered = (Endangered) otherAnimal;
            return this.getName().equals(newEndangered.getName());
        }
    }
        public void saveEndangered(){
        try(Connection con= DB.sql2o.open()){
            String sql="INSERT INTO animals (name,age,health,location,rangerName,type) VALUES (:name,:age,:health,:location,:rangerName,:type)";
            this.id=(int) con.createQuery(sql,true)
                    .addParameter("name",this.name)
                    .addParameter("age",this.age)
                    .addParameter("health",this.healthStatus)
                    .addParameter("location",this.location)
                    .addParameter("rangerName",this.rangerName)
                    .addParameter("type",this.type)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }
    }
    public static List<Endangered> allEndangered(){
        String sql="SELECT * FROM animals";
        try(Connection con=DB.sql2o.open()){
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Endangered.class);
        }
    }
}