package NeXT;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class OrcEncodingWrite {

	FileOutputStream fos=new FileOutputStream(new File(s[1]));
	DataOutputStream  dos =new DataOutputStream(fos);
	collect.buffer.write(dos, 0, collect.buffer.size());
	dos.close();

}
