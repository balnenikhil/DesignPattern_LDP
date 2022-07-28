package example.file;

import example.web.WebManager;

public class BitBucket extends FileManager{

    WebManager webManagerType;

    public BitBucket(WebManager w){
        super(w);
        this.webManagerType=w;
    }

    @Override
    public void upload() {
        System.out.println("File uploaded-BitBucket:");
        webManagerType.upload();
    }

    @Override
    public void download() {
        System.out.println("File downloaded-BitBucket:");
        webManagerType.download();
    }
}
