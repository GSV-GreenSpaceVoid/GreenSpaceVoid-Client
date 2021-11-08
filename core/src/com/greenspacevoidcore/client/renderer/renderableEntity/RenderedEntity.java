package com.greenspacevoidcore.client.renderer.renderableEntity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.greenspacevoidcore.client.renderer.GSVRenderer;
import com.greenspacevoidsharedAPI.networking.renderer.EntityIndex;

import java.util.ArrayList;



public class RenderedEntity extends Sprite{
    private String entityID;
    private int layer; //From 1-7 1 being the lowest layer, and 7 being the highest.
    public RenderedEntity(EntityIndex index, String entityID, float x, float y, int layer, float dir, float scaleX, float scaleY){
        super(GSVRenderer.assetManager.get(getTexturePathFromEntityIndex(index), Texture.class));
        this.entityID = entityID;
        this.layer = layer;
        this.setOriginCenter();
        this.setPosition(x, y);
        this.setRotation(dir);
        this.setScale(scaleX,scaleY);


    }

    public static class T extends GSVRenderer{


        public static final int SKOOGUS = 1234;
        public T(){

        }







    }




    public static ArrayList<RenderedEntity> renderedEntitiesFactory(EntityIndex index, String entityID, float x, float y, float dir, int layer){
        ArrayList<RenderedEntity> renderedEntities = new ArrayList<>();





        switch(index) {
            //case GIDEON:


        }



        return null;



    }


    public static String getTexturePathFromEntityIndex(EntityIndex index){







        return null;



    }


}
