package e.network;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        //sample.sendSocketSample();
        sample.sendAndReceiveSocketData();
    }

    public void sendSocketSample() {
        for (int i=0;i<3;i++) {
            sendSocketData("I liked java at " + new Date());
        }
        sendSocketData("EXIT");
    }

    public void sendSocketData(String data) {
        Socket socket = null;
        try {
            System.out.println("Client:Connection");
            socket=new Socket("127.0.0.1",9999);
            System.out.println("Client:Connect status="+socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client:Sent data");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket!=null){
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void sendAndReceiveSocketData() {
        Socket socket = null;
        try {
            System.out.println("Client:Connection");
            socket=new Socket("127.0.0.1",9999);
            System.out.println("Client:Connect status="+socket.isConnected());
            Thread.sleep(1000);
            InputStream stream = socket.getInputStream();
            BufferedInputStream in = new BufferedInputStream(stream);
            byte[] readBytes = new byte[256];
            in.read(readBytes);
            System.out.println("Client:received data="+new String(readBytes).trim());
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket!=null){
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
