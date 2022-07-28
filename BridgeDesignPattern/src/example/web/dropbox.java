package example.web;

public class dropbox implements WebManager{

    @Override
    public void upload() {
        System.out.println(" uploaded from dropbox ");
    }

    @Override
    public void download() {
        System.out.println(" downloaded from dropbox");
    }
}
