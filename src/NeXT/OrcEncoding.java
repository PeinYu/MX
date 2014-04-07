package NeXT;

import ORC.OutStream;
import ORC.RunLengthIntegerWriter;
import ORC.TestInStream;

public class OrcEncoding {

	TestInStream.OutputCollector collect = new TestInStream.OutputCollector();
	RunLengthIntegerWriter out = new RunLengthIntegerWriter(
			new OutStream("test", 1000, codec, collect), true);
	for (int i = 0; i < fileLong; i++) {
		//cw.writeInteger(dis.readInt());

		out.write(initValues[i]);
	}
	
	out.flush();

}
