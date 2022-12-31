import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    List<FileSystem> fileSystemsObj;
    String directoryName;
    public Directory(String name){
        fileSystemsObj = new ArrayList<>();
        this.directoryName = name;
    }

    void add(FileSystem obj){
        fileSystemsObj.add(obj);
    }

    @Override
    public void ls() {

        System.out.println("Directory name is " + this.directoryName);
        for(FileSystem fileSystem: fileSystemsObj){
            fileSystem.ls();
        }

    }
}
