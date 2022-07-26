package service;

import database.Repository;
import database.RepositoryProxy;

public class databaseOperations {

    public static void main(String[] args)  throws Exception{

        //Repository notAdmin = new RepositoryProxy("NotAdmin","NotAdmin@!23");
        //notAdmin.repositoryQuery("DELETE");

       Repository admin = new RepositoryProxy("Admin", "Admin@123");
        admin.repositoryQuery("DELETE");
    }
}
