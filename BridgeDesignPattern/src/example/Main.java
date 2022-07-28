package example;

import example.file.BitBucket;
import example.file.FileManager;
import example.file.Git;
import example.web.drive;
import example.web.dropbox;

public class Main {

    public static void main(String[] args) {

        FileManager gitFromDrive = new Git(new drive());
        gitFromDrive.upload();
        System.out.println();

        FileManager gitFromDropbox = new Git(new dropbox());
        gitFromDropbox.upload();
        System.out.println();

        FileManager bitBucketFromDrive = new BitBucket(new drive());
        bitBucketFromDrive.upload();
        System.out.println();

        FileManager bitBucketFromDropBox = new BitBucket(new dropbox());
        bitBucketFromDropBox.upload();
        System.out.println();
    }
}
