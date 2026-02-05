package org.example;

import org.apache.thrift.TDeserializer;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TTransportException;

public class AndStruc extends TDeserializer{


    public AndStruc(TProtocolFactory protocolFactory) throws TTransportException {
        super(protocolFactory);

    }

}
