package com.greenspacevoid.client.renderer.renderableEntity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.greenspacevoid.client.renderer.GSVClient;

public class RenderedEntity extends Sprite{
    private int ID, UUID;

    public RenderedEntity(String texturePath, int ID,int UUID, float x, float y, float dir, float scaleX, float scaleY){
        super(GSVClient.assetManager.get(texturePath, Texture.class));
        this.ID = ID;
        this.UUID = UUID;
        setPosition(x, y);
        setRotation(dir);
        setScale(scaleX,scaleY);
        setOriginCenter();


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
