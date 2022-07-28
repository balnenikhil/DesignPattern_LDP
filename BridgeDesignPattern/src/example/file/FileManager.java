package example.file;

import example.web.WebManager;

public abstract class FileManager {

    WebManager webManager;

    FileManager(WebManager w){
        this.webManager=w;
    }

    public abstract void upload();
    public abstract void download();

}
