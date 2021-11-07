package com.greenspacevoidclientcore.client.renderer.deprecated;

import com.greenspacevoidsharedAPI.networking.network.messages.gameEntity.VisualEntityMessage;

@Deprecated
public class Renderer {
    //protected static ArrayList<Entity>




    public static void updateSpritePositions(){



    }


























    public static String idGetPath(int id){

        //IDs 0-2048 WORLD
        //IDS 4096-16536 NON-WORLD
        //>15536 MISC




        switch (id) {
            case 0:


            //Asteroids
            case 1:
                return "smallAsteroid.png";
            case 2:
                return "mediumAsteroid.png";
            case 3:
                return "largeAsteroid.png";
            case 4:
                return "hugeAsteroid.png";
            case 5:
                return "planetoid.png";
            //Todo: So on and so forth...


        }
        return "idk";
    }


    public static void generateActor(VisualEntityMessage message){







    }





    public static class RenderData{
        int ID;
        int layer;








    }






























    /*

    public static class Entity{
        private int ID;
        private Texture texture;










    }
    */

}











