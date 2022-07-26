package database;

import java.util.Objects;

public class RepositoryProxy implements Repository{

    boolean admin;
    RepositoryImpl repository;

    public RepositoryProxy(String name, String password){
        if(Objects.equals(name, "Admin") && Objects.equals(password, "Admin@123")){
            admin = true;
            repository = new RepositoryImpl();
        }
    }
    @Override
    public void repositoryQuery(String query) throws Exception {
        if(admin){
            repository.repositoryQuery(query);
        }
        else{
            if(query.equals("DELETE")){
                throw new Exception("Delete not allowed for non-admin user");
            } else {
                repository.repositoryQuery(query);
            }
        }
    }
}
