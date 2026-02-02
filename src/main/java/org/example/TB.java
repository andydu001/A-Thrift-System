package org.example;

import org.apache.thrift.TException;

import org.apache.thrift.protocol.TJSONProtocol;

import org.apache.thrift.protocol.TMap;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.transport.TTransport;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class TB extends TJSONProtocol {


    public TB(TTransport trans) {
        super(trans);
    }

    public void json(byte[] b) throws TException {

        readJSONSyntaxChar(b);

   }
}
