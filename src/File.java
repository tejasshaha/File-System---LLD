public class File implements FileSystem{
    String fileName;
    File(String fileSystem){
        this.fileName = fileSystem;
    }

    @Override
    public void ls() {
        System.out.println("File name is:"+ this.fileName);
    }
}
