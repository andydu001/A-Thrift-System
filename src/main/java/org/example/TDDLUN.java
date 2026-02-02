package org.example;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TTransportException;
import java.io.IOException;

public class TDDLUN extends TNonblockingSocket {

   public TDDLUN(String host, int port) throws IOException, TTransportException {
      super(host, port);
   }

   @Override
   public void open() throws TTransportException {
      super.open();
   }
}
