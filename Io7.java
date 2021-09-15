import java.io.*;

class IO7
{

    public static void getPaths(File f) throws IOException {
        System.out.println("Name : "+f.getName());
        System.out.println("Path : "+f.getPath());
        System.out.println("Parent : "+f.getParent());

    }

    public static void getInfo(File f) throws IOException {
        if(f.exists() )
        {
            System.out.println("File exists");
            System.out.println(f.canRead() ? "and is Readable" : "");
            System.out.println(f.canWrite() ? "and is Writable" : "");
            System.out.println("File is last modified : "+f.lastModified());
            System.out.println("File is "+f.length()+"bytes");
        }
        else {
            System.err.println("File does not exist.");
        }
    }
    public static void main(String args[]) throws IOException{

        File filetoCheck ;
        if(args.length>0){
            for(int i=0;i<args.length;i++){
                filetoCheck = new File(args[i]);
                getPaths(filetoCheck);
                getInfo(filetoCheck);
            }
        }
        else 
            System.out.println("Usage : Java file test <filename (s)>");
        
    }
}