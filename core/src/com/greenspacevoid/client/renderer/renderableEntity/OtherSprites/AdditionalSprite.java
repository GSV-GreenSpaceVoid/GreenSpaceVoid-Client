package com.greenspacevoid.client.renderer.renderableEntity.OtherSprites;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.esotericsoftware.kryo.NotNull;
import com.greenspacevoid.client.renderer.renderableEntity.RenderedEntity;
import com.greenspacevoid.client.renderer.renderableEntity.vessel.Vessel;

public class AdditionalSprite extends RenderedEntity {
    private RenderedEntity parent;
    private float xOffset, yOffset;

    public AdditionalSprite(String texturePath, int ID, int UUID, float xOffset, float yOffset, int layer, float dir, float scaleX, float scaleY) {
        super(texturePath, ID, UUID, -50000, -50000, layer, dir, scaleX, scaleY);
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }


    public void setParent(RenderedEntity parent){
        this.parent = parent;
    }

    public float getxOffset() {
        return xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public RenderedEntity getParent(){
        return parent;



    }

    public void updatePositionToParent(){
        try {
            RenderedEntity parent = this.getParent();
            this.setPosition(parent.getX() + getxOffset(), parent.getY() + getyOffset());
        }catch(Exception Ignored) {
            System.out.println("Attempted to move engines to uninitialized parent!");
        }
    }




    public static class EngineSprite extends AdditionalSprite{

        /*
        Engine Sprite behavior is determined by parent ship behavior!


         */


        private static final int ID = -1;
        private static final int UUID = 0;
        private boolean isMoving;

        public EngineSprite(String texturePath, float xOffset, float yOffset, int layer, float dir, float scaleX, float scaleY) {
            super(texturePath, ID, UUID, xOffset, yOffset, layer, dir, scaleX, scaleY);

        }




        public boolean isMoving() {
            return isMoving;
        }

        public void setMoving(boolean moving) {
            isMoving = moving;
        }




        @Override
        public void draw(Batch batch) {
            if(!isMoving) {
                this.setAlpha(0);
            }else{
                this.setAlpha(1);
            }
            updatePositionToParent();
            super.draw(batch);
        }
    }


    public static class TurretSprite extends AdditionalSprite{
        RenderedEntity target;

        public TurretSprite(String texturePath, int ID, int UUID, float x, float y, int layer, float dir, float scaleX, float scaleY) {
            super(texturePath, ID, UUID, x, y, layer, dir, scaleX, scaleY);
        }





        public void target(){//Point at something!

            this.setRotation(target.getRotation());

            //Todo: Add trigonometry!






        }





    }











}
