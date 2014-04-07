package basic;

import java.io.File;  
import java.io.IOException;  
  
public class TestFile {  
      
    public void createFile(String path){  
        File file=new File(path);  
        if(!file.exists()){//判断文件是否存在  
            try {  
                file.createNewFile();  //创建文件  
                  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
        /*获取文件名*/  
        String name=file.getName();  
        /*获取文件路径*/  
        String path_=file.getPath();  
        /*获取绝对路径名*/  
        String absPath=file.getAbsolutePath();  
        /*获取父亲文件路径*/  
        String parent=file.getParent();  
        /*文件大小*/  
        long size=file.length();  
        /*最后一次修改时间*/  
        long time=file.lastModified();  
        System.out.println("文件名:"+name);  
        System.out.println("文件路径:"+path_);  
        System.out.println("文件的绝对路径:"+absPath);  
        System.out.println("文件的父文件路径:"+parent);  
        System.out.println("文件的大小:"+size);  
        System.out.println("文件最后一次修改时间:"+time);  
        //file.delete();   //删除文件  
          
    }  
      
    public void createDir(String path){  
        File file=new File(path);  
        if(!file.exists()){  
            file.mkdirs();  //创建文件夹  
        }  
          
        //file.delete();  若文件夹为空,则删除文件夹  
          
    }  
      
    /** 
     * 遍历文件夹中的文件并显示 
     */  
    public void fileTest(String path){  
        File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){  
                System.out.println(f.getName()+"是文件!");  
            }else if(f.isDirectory()){  
                fileTest(f.getPath());  
            }  
        }  
          
    }  
      
    public void reFileName(String fromPath,String toPath){  
        File file1=new File(fromPath);  
        File file2=new File(toPath);  
        /*判断file2文件夹路径存在与否,不存在则创建*/  
        if(!file2.exists()){  
            new File(file2.getParent()).mkdirs();  
        }  
        file1.renameTo(file2);  //修改文件名  
    }  
  
    public static void main(String[] args) {  
//      File file=new File("E:\\myjava\\1.txt");  //  Window路径\\  
//      File flie_=new File("E:/myjava","1.txt"); //linux路径 /  
//        
        TestFile tf=new TestFile();  
        //tf.createFile("E:\\myjava\\1.txt");  
        //tf.fileTest("E:/wepull");  
        //tf.createDir("e:/sunxiao/abc/1.txt");  
        //tf.reFileName("E:\\my\\2.txt","E:\\myjava\\1.txt");  
        tf.copyFlie("E:\\myjava","F:\\");  
        //tf.
    }  
  
    private void copyFlie(String src, String to) {  
        File file1=new File(src);  
        String topath=to+"\\"+file1.getName();  
        File file2=new File(topath);  
        if(!file2.exists()){  
            file2.mkdirs();  
        }  
        System.out.println(topath);  
        File[] file=file1.listFiles();  
        for (File f : file) {  
            if(f.isFile()){  
                String path2=topath+"\\"+f.getName();  
                Creatfile(path2);  
            }else if(f.isDirectory()){  
                String s=f.getPath();  
                copyFlie(s,topath);  
            }  
        }  
          
    }  
  
    private void Creatfile(String path2) {  
        File file3=new File(path2);  
        if(!file3.exists()){//判断文件是否存在  
            try {  
                file3.createNewFile();  //创建文件  
                  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
}  