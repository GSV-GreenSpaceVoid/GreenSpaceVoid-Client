package com.greenspacevoid.client.renderer.renderableEntity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.greenspacevoid.client.renderer.GSVRenderer;

public class RenderedEntity extends Sprite{
    private int ID, UUID;
    private int layer; //From 1-7 1 being the lowest layer, and 7 being the highest.
    public RenderedEntity(String texturePath, int ID,int UUID, float x, float y, int layer, float dir, float scaleX, float scaleY){
        super(GSVRenderer.assetManager.get(texturePath, Texture.class));
        this.ID = ID;
        this.UUID = UUID;
        this.layer = layer;
        setOriginCenter();
        setPosition(x, y);
        setRotation(dir);
        setScale(scaleX,scaleY);



    }
















    public static Texture convertIDtoTexture(int ID){

        //TODO: IMPLEMENT ASSET MANAGER

        switch (ID) {
            case 1:
                return new Texture("badlogic.jpg");
            case 2:
                return new Texture("img.png");








        }



        return null;

    }


    public int getUUID(){//Useful for updating/keeping track of already initiated sprites. (Serverside managed)
        return UUID;




    }




}
