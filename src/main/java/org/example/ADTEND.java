package org.example;

import org.apache.thrift.TConfiguration;
import org.apache.thrift.transport.TEndpointTransport;
import org.apache.thrift.transport.TTransportException;

public class ADTEND extends TEndpointTransport {
    public ADTEND(TConfiguration config) throws TTransportException {
        super(config);
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void open() throws TTransportException {

    }

    @Override
    public void close() {

    }

    @Override
    public int read(byte[] buf, int off, int len) throws TTransportException {
        return 0;
    }

    @Override
    public void write(byte[] buf, int off, int len) throws TTransportException {

    }
}
