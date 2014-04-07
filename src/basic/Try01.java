package basic;

import java.io.*;
import java.util.*;

public class Try01 {

	public static void main(String[] args) {
		// 采集数据，生成文件，并且压缩
		 private String getDataZip() {
		  // 压缩文件名
		  String zipname = null;
		  // 当前时间
		  String time = String.valueOf(System.currentTimeMillis());
		  // 文件名
		  String filename = time + ".trs";
		  // 文件路径
		  String filepath = this.getClass().getClassLoader().getResource("")
		    .toString();
		 
		  filepath = filepath.substring(filepath.indexOf("/") + 1);

		  // 创建文件
		  File file = new File(filepath + filename);
		  if (!file.exists()) {
		   try {
		    file.createNewFile();
		   } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		  }

		  try {
		   TRSServerProperty tProperty = new TRSServerProperty();

		   TRSConnection trs = new TRSConnection();
		   trs.connect(tProperty.getServerhost(), tProperty.getServerport(),
		     tProperty.getUsername(), tProperty.getPassword());
		   TRSResultSet rs = new TRSResultSet();
		   rs.setConnection(trs);
		   rs.executeSelect(tProperty.getInstance(), "", false);
		   // 添加数据

		   for (int i = 0; i < rs.getRecordCount(); i++) {
		    StringBuffer string = new StringBuffer();
		    rs.moveTo(0, i);
		    // 避免中文乱码
		    FileOutputStream fStream = new FileOutputStream(file, true);
		    OutputStreamWriter oWriter = new OutputStreamWriter(fStream,
		      "UTF-8");
		    BufferedWriter bWriter = new BufferedWriter(oWriter);

		    System.out.println(rs.getString("URLTitle"));
		    string.append("<SID>=").append(rs.getString("SID"))
		      .append("<URLTitle>=").append(rs.getString("URLTitle"));

		    bWriter.write(string.toString());
		    bWriter.close();

		   }

		   System.out.println("pl");
		   // 压缩文件
		   zipname = "trsserver" + time + ".zip";// 压缩文件名
		   FileOutputStream fStream = new FileOutputStream(filepath + zipname);
		                       //运用CRC方式压缩
		   CheckedOutputStream cStream = new CheckedOutputStream(fStream,
		     new CRC32());
		   ZipOutputStream zos = new ZipOutputStream(cStream);
		  
		   BufferedOutputStream bStream = new BufferedOutputStream(zos);
		 
		   zos.setComment("trsserver导出数据");
		   //避免中文乱码
		   OutputStreamWriter oStreamWriter = new OutputStreamWriter(bStream,
		     "UTF-8");

		   BufferedReader bReader = new BufferedReader(new InputStreamReader(
		     new FileInputStream(filepath + filename), "UTF-8"));

		   zos.putNextEntry(new ZipEntry(filename));
		   String line;

		   while ((line = bReader.readLine()) != null)
		    oStreamWriter.write(line);
		   bReader.close();
		   bStream.flush();
		   bStream.close();

		  } catch (TRSException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } catch (FileNotFoundException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  // if (file.exists())
		  // file.delete();

		  return filepath + zipname;
		 }
	}
}
