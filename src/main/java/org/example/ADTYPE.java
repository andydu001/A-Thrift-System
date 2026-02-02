package org.example;

import org.apache.thrift.TConfiguration;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClient;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TTransportException;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public   class  ADTYPE {

    ADTYPE() throws IOException, TTransportException {

 new ADSch(new TAsyncClient(new TCompactProtocol.Factory(), new TAsyncClientManager(), new TNonblockingTransport(new TConfiguration()) {
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
         return null;
     }
 }) {
 }, new TCompactProtocol.Factory(), new TNonblockingTransport(new TConfiguration()) {
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
         return null;
     }
 }, new AsyncMethodCallback() {
     @Override
     public void onComplete(Object response) {

     }

     @Override
     public void onError(Exception exception) {

     }
 },false);

    }
}
