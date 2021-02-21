package com.greenspacevoid.server.shared.network.messages.entity;

import com.greenspacevoid.server.shared.network.messages.SharedMessage;
import com.greenspacevoid.server.shared.renderer.AllRenderableEntities;
import com.greenspacevoid.server.shared.renderer.AnimationStates;

import java.util.ArrayList;
import java.util.Date;

public class NetworkedEntity{//Object Class. Data networking classes are nested in this file.



    //Entity

    int index; //THIS NUMBER IS SINGLE HANDEDLY THE MOST IMPORTANT OF THEM ALL! It unifies the data between
    //server and client without using fixed-size arrays.
    AllRenderableEntities model;
    AnimationStates animationState;
    String playerName;


    //Renderer specific info
    boolean isRendered;//<-Imagine this variable as being the dividing line of the forest and the trees that make up the forest
    //"I can't see the asteroid field because the asteroids are in the way!:"
    double x,y,direction, distance;


    //UI Specific info
    boolean hasHealthpool, isTargetable, distanceInAUs;; //IMPORTANT: So that we do NOT render what doesn't need to be rendered.
    double currentShield, maxShield, currentHealth, maxHealth, currentHull, maxHull;



    //X and Y work off of a server-processed local origin. Yes, the server can do everything. Better more CPU work on server
    //than loss of bandwidth sending over big, unintelligible degrees. 2 numbers are better than 4.

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
        //Functions as a complete repaint
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


    public static class CLIENT_SEND_RequestRefreshMessage extends SharedMessage{
        Date date = new Date();
        public CLIENT_SEND_RequestRefreshMessage(){
            super();
        }
    }






}
