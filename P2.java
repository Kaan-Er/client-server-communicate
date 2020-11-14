package communicate;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class P2 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9091);
        {
            Socket socket = ss.accept();
            try {
                InputStream is = socket.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                Ogrenci obj1=(Ogrenci) ois.readObject();
                System.out.println(obj1.toString());
                obj1.setOgrenciAd("Ali");


                Socket socket2 = new Socket("localhost", 9092);
                OutputStream os = socket2.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(obj1);
                socket2.close();
            }
            catch (Exception e){

            }
        }
    }
}
