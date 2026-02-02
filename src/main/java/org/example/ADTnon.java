package org.example;

import org.apache.thrift.TConfiguration;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TTransportException;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;

public class ADTnon extends TNonblockingTransport {
    public ADTnon(TConfiguration config) throws TTransportException {
        super(config);

    }


    @Override
    public boolean startConnect() throws IOException {
        return false;
    }

    @Override
    public boolean finishConnect() throws IOException {
        return false;
    }

    @Override
    public SelectionKey registerSelector(Selector selector, int interests) throws IOException {
        return new SelectionKey() {
            @Override
            public SelectableChannel channel() {


                return new SelectableChannel() {
                    @Override
                    public SelectorProvider provider() {
                        return selector.provider();
                    }

                    @Override
                    public int validOps() {
                        return 0;
                    }

                    @Override
                    public boolean isRegistered() {
                        return false;
                    }

                    @Override
                    public SelectionKey keyFor(Selector sel) {
                        return sel.keys().stream().findAny().get();
                    }

                    @Override
                    public SelectionKey register(Selector sel, int ops, Object att) throws ClosedChannelException {
                        return null;
                    }

                    @Override
                    public SelectableChannel configureBlocking(boolean block) throws IOException {
                        return null;
                    }

                    @Override
                    public boolean isBlocking() {
                        return false;
                    }

                    @Override
                    public Object blockingLock() {
                        return null;
                    }

                    @Override
                    protected void implCloseChannel() throws IOException {

                    }
                };
            }

            @Override
            public Selector selector() {
                return null;
            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public int interestOps() {
                return 0;
            }

            @Override
            public SelectionKey interestOps(int ops) {
                return null;
            }

            @Override
            public int readyOps() {
                return 0;
            }
        };
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
