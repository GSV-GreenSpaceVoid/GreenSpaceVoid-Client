package com.greenspacevoidcore.client.renderer.renderableEntity.vessel;
/*
import com.greenspacevoid.client.renderer.renderableEntity.RenderedEntity;
import com.greenspacevoid.client.renderer.renderableEntity.OtherSprites.AdditionalSprite;

import java.util.ArrayList;

public class Vessel extends RenderedEntity{

    private ArrayList<AdditionalSprite.TurretSprite> turretSprites;
    private ArrayList<AdditionalSprite.EngineSprite> engineSprites;
    private boolean isMoving;



    public Vessel(String texturePath, int ID, String UUID, float x, float y, int layer, float dir, float scaleX, float scaleY, ArrayList<AdditionalSprite.TurretSprite> turretSprites, ArrayList<AdditionalSprite.EngineSprite> engineSprites) {
        super(texturePath, ID, x, y, layer, dir, scaleX, scaleY);

        for(AdditionalSprite.EngineSprite sprite : engineSprites){
            sprite.setParent(this);
        }





    }


    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;

        if(isMoving = true){
            for(AdditionalSprite.EngineSprite engineSprite : engineSprites){
                engineSprite.setMoving(true);
            }
        }else{
            for(AdditionalSprite.EngineSprite engineSprite : engineSprites){
                engineSprite.setMoving(false);
            }
        }
    }
}
*/