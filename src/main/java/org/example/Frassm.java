package org.example;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.layered.TFramedTransport;

public class Frassm extends TFramedTransport {

    public Frassm(TTransport transport, int maxLength) throws TTransportException {
        super(transport, maxLength);

    }
}
