package basic;

import java.io.File;  
import java.io.IOException;  
  
public class TestFile {  
      
    public void createFile(String path){  
        File file=new File(path);  
        if(!file.exists()){//�ж��ļ��Ƿ����  
            try {  
                file.createNewFile();  //�����ļ�  
                  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
        /*��ȡ�ļ���*/  
        String name=file.getName();  
        /*��ȡ�ļ�·��*/  
        String path_=file.getPath();  
        /*��ȡ����·����*/  
        String absPath=file.getAbsolutePath();  
        /*��ȡ�����ļ�·��*/  
        String parent=file.getParent();  
        /*�ļ���С*/  
        long size=file.length();  
        /*���һ���޸�ʱ��*/  
        long time=file.lastModified();  
        System.out.println("�ļ���:"+name);  
        System.out.println("�ļ�·��:"+path_);  
        System.out.println("�ļ��ľ���·��:"+absPath);  
        System.out.println("�ļ��ĸ��ļ�·��:"+parent);  
        System.out.println("�ļ��Ĵ�С:"+size);  
        System.out.println("�ļ����һ���޸�ʱ��:"+time);  
        //file.delete();   //ɾ���ļ�  
          
    }  
      
    public void createDir(String path){  
        File file=new File(path);  
        if(!file.exists()){  
            file.mkdirs();  //�����ļ���  
        }  
          
        //file.delete();  ���ļ���Ϊ��,��ɾ���ļ���  
          
    }  
      
    /** 
     * �����ļ����е��ļ�����ʾ 
     */  
    public void fileTest(String path){  
        File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){  
                System.out.println(f.getName()+"���ļ�!");  
            }else if(f.isDirectory()){  
                fileTest(f.getPath());  
            }  
        }  
          
    }  
      
    public void reFileName(String fromPath,String toPath){  
        File file1=new File(fromPath);  
        File file2=new File(toPath);  
        /*�ж�file2�ļ���·���������,�������򴴽�*/  
        if(!file2.exists()){  
            new File(file2.getParent()).mkdirs();  
        }  
        file1.renameTo(file2);  //�޸��ļ���  
    }  
  
    public static void main(String[] args) {  
//      File file=new File("E:\\myjava\\1.txt");  //  Window·��\\  
//      File flie_=new File("E:/myjava","1.txt"); //linux·�� /  
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
        if(!file3.exists()){//�ж��ļ��Ƿ����  
            try {  
                file3.createNewFile();  //�����ļ�  
                  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
}  