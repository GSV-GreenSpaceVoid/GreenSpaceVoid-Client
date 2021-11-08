package com.greenspacevoidcore.client.networking;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.greenspacevoidcore.client.GameWrapper;
import com.greenspacevoidsharedAPI.networking.network.Networking;
import com.greenspacevoidsharedAPI.networking.network.messages.SharedMessage;
import com.greenspacevoidsharedAPI.networking.network.messages.gameEntity.NetworkedEntity;
import com.greenspacevoidsharedAPI.networking.network.messages.login.NetworkedLogin;

import java.io.IOException;

public class ClientSide {
    public static ClientSide clientSide;


    public static final String SERVER_URL = "www.greenspacevoid.com";
    public static final int PORT = 30000;
    public static final int TIMEOUT_IN_MILLIS = 10000;

    private Client client;





    public ClientSide(){

        client = new Client();
        Networking.syncRegisters(client.getEndPoint().getKryo());
        client.start();




        //I guess listeners can go down here.


        client.addListener(new Listener(){
            @Override
            public void received(Connection connection, Object object) {
                if(object instanceof NetworkedEntity.CLIENT_RECEIVE.PlayerShipMessage){
                    



                }else if(object instanceof NetworkedLogin.CLIENT.CLIENT_RECEIVE_LoginStatusMessage){
                    if(((NetworkedLogin.CLIENT.CLIENT_RECEIVE_LoginStatusMessage) object).loginAccepted){
                        if(!GameWrapper.gameWrapper.isLoggedIn()){
                            GameWrapper.gameWrapper.enterLoggedInMode();
                        }

                        System.out.println("WE ARE LOGGED IN!");
                    }else{
                        ClientSide.clientSide.client.close();
                    }
                }





            }
        });





    }




    public <E> void sendMessage(SharedMessage message){
        try {
            client.sendTCP(message);
            System.out.println("Sent " + message.getClass() + " to " + client.getRemoteAddressTCP());
        } catch (Exception e){
            System.out.println("ERROR: Could not send "+ message.getClass() + "to " + client.getRemoteAddressTCP());
            e.printStackTrace();
        }
    }




    public void connectToServer() throws IOException {


            client.connect(TIMEOUT_IN_MILLIS, "localhost", PORT);//For testing purposes




    }























}