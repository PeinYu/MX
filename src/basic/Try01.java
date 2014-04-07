package basic;

import java.io.*;
import java.util.*;

public class Try01 {

	public static void main(String[] args) {
		// �ɼ����ݣ������ļ�������ѹ��
		 private String getDataZip() {
		  // ѹ���ļ���
		  String zipname = null;
		  // ��ǰʱ��
		  String time = String.valueOf(System.currentTimeMillis());
		  // �ļ���
		  String filename = time + ".trs";
		  // �ļ�·��
		  String filepath = this.getClass().getClassLoader().getResource("")
		    .toString();
		 
		  filepath = filepath.substring(filepath.indexOf("/") + 1);

		  // �����ļ�
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
		   // �������

		   for (int i = 0; i < rs.getRecordCount(); i++) {
		    StringBuffer string = new StringBuffer();
		    rs.moveTo(0, i);
		    // ������������
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
		   // ѹ���ļ�
		   zipname = "trsserver" + time + ".zip";// ѹ���ļ���
		   FileOutputStream fStream = new FileOutputStream(filepath + zipname);
		                       //����CRC��ʽѹ��
		   CheckedOutputStream cStream = new CheckedOutputStream(fStream,
		     new CRC32());
		   ZipOutputStream zos = new ZipOutputStream(cStream);
		  
		   BufferedOutputStream bStream = new BufferedOutputStream(zos);
		 
		   zos.setComment("trsserver��������");
		   //������������
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
