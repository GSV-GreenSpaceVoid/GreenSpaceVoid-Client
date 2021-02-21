package com.greenspacevoid.server.network.messages.entity;

import com.greenspacevoid.server.network.messages.SharedMessage;

import java.util.ArrayList;

public class NetworkedEntity{//Object Class. Data networking classes are nested in this file.



    //Entity
    AllRenderableEntities model;
    String playerName;
    int index;
    boolean isRendered;
    boolean distanceInAUs;
    double x,y,direction, distance;


    public NetworkedEntity(){
        super();
        //Best we leave this empty or else...
    }
    ///////////



    //To Client:
    public static class CLIENT_RECEIVE_AddEntitiesMessage extends SharedMessage{
        ArrayList<NetworkedEntity> entities = new ArrayList<>();
        public CLIENT_RECEIVE_AddEntitiesMessage(){
            super();
        }
    }

    public static class CLIENT_RECEIVE_FullEntityRefreshMessage extends SharedMessage{
        ArrayList<NetworkedEntity> entities = new ArrayList<>();

        public CLIENT_RECEIVE_FullEntityRefreshMessage() {
            super();
        }
    }

    public static class CLIENT_RECEIVE_RemoveEntitiesMessage extends SharedMessage{
        ArrayList<NetworkedEntity> entities = new ArrayList<>();
        public CLIENT_RECEIVE_RemoveEntitiesMessage(){
            super();
        }
    }

    public static class CLIENT_RECEIVE_UpdateEntitiesMessage extends SharedMessage{
        ArrayList<NetworkedEntity> entities = new ArrayList<>();
        public CLIENT_RECEIVE_UpdateEntitiesMessage(){
            super();

        }


    }















}
