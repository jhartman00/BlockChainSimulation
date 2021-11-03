package blockchain;

import java.io.*;

public class Serialization {

	public static void serialize(Object object, String fileName) throws IOException {

		BufferedOutputStream bos;
		FileOutputStream fos = new FileOutputStream(fileName);
		bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(object);
		oos.close();
	}

	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
}
