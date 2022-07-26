package database;

public class RepositoryImpl implements Repository{

    @Override
    public void repositoryQuery(String query) throws Exception {
        System.out.println("Executing Query:"+query);
    }
}
