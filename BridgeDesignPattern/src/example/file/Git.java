package example.file;

import example.web.WebManager;

public class Git extends FileManager{

    WebManager webManagerType;

    public Git(WebManager w){
        super(w);
        this.webManagerType=w;
    }

    @Override
    public void upload() {
        System.out.println("File uploaded-Git:");
        webManagerType.upload();
    }

    @Override
    public void download() {
        System.out.println("File downloaded-Git:");
        webManagerType.download();
    }
}
