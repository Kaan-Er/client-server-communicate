package communicate;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class P1 {
    public static void main(String[] args) throws IOException{


        try {
            Socket socket = new Socket("localhost", 9091);
            OutputStream os = socket.getOutputStream();
            Ogrenci ogrenci = new Ogrenci("Ayşe","Ateş","1234567","Computer Science");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(ogrenci);
            socket.close();

            ServerSocket ss = new ServerSocket(9092);
            Socket socket2 = ss.accept();
            InputStream is = socket2.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            Ogrenci obj1=(Ogrenci) ois.readObject();
            System.out.println(obj1.toString());

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

