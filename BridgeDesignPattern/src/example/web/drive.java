package example.web;

public class drive implements WebManager{

    @Override
    public void upload() {
        System.out.println(" uploaded from google drive");
    }

    @Override
    public void download() {
        System.out.println(" downloaded from google drive");
    }
}
