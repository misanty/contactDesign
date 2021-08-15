package test.execute.inputController;

import java.io.*;

public final class DataSerialization {

    public static void serialize(Object o, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        try (ObjectOutput output = new ObjectOutputStream(bufferedOutputStream)) {
            output.writeObject(o);
        }
    }
    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        try (ObjectInput objectInput = new ObjectInputStream(bufferedInputStream)){
           return objectInput.readObject();
        }
    }

}
