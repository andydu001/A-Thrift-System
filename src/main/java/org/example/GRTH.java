package org.example;

import org.apache.thrift.TException;
import org.apache.thrift.server.THsHaServer;

import java.io.FileNotFoundException;

public class GRTH extends THsHaServer {
    /**
     * Create the server with the specified Args configuration
     *
     * @param args
     */
    public GRTH(Args args) throws FileNotFoundException, TException {
        super(args);

      /*  TBinaryProtocol tBinaryProtocol = new TB(new GF(new FileOutputStream(new File("C:\\Users\\andyd\\OneDrive\\Documents\\Ac.txt"))) ,false,false);//new TBinaryProtocol(new AutoExpandingBufferReadTransport(new TConfiguration(),8));

        tBinaryProtocol.writeString("No");

        new TGuide(tBinaryProtocol);

*/


        getInvoker().submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Shit");
            }
        });
        if (startListening()){

            System.out.println("We start listening for connections:\t"+args.maxWorkerThreads);
        }

        LOGGER.debug("Andyr");


        setServing(true);
    }
}
