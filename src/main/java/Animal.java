import java.util.Objects;
import org.sql2o.*;

import java.util.List;

public class Animal {
    public String name;
    public String type;
    private int id;

    public static final  String ANIMAL_TYPE="notEndangered";

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Animal(String name){
        this.name=name;
        this.type=ANIMAL_TYPE;

    }
    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof Animal)) {
            return false;
        }
        else{
            Animal newAnimal=(Animal) otherAnimal;
            return this.getName().equals(newAnimal.getName());

        }
    }
    public void saveAnimal(){
        try(Connection con=DB.sql2o.open()){
            String sql="INSERT INTO animals (name,type) VALUES (:name,:type)";
            this.id=(int) con.createQuery(sql, true)
                    .throwOnMappingFailure(false)
                    .addParameter("name",this.name)
                    .addParameter("type",this.type)
                    .executeUpdate()
                    .getKey();
        }
    }
    public static List<Animal> allAnimals(){
        String sql="SELECT * FROM animals";
        try(Connection con=DB.sql2o.open()){
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Animal.class);
        }

    }
    public static Animal find(int id){
        try (Connection con=DB.sql2o.open()){
            String sql="SELECT * FROM animals where id=:id";
            Animal animal=con.createQuery(sql)
                    .addParameter("id",id)
                    .throwOnMappingFailure(false)
                    .executeAndFetchFirst(Animal.class);
            return animal;
        }
    }
}
