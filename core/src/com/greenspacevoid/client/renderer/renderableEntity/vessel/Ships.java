package com.greenspacevoid.client.renderer.renderableEntity.vessel;

import com.greenspacevoid.client.renderer.renderableEntity.OtherSprites.AdditionalSprite;
import com.greenspacevoid.client.renderer.renderableEntity.OtherSprites.Engines;

import java.util.ArrayList;
import java.util.Arrays;

public class Ships {
    public static class Military{

        public static class Edomite{

            public static class TestFighter extends Vessel{
                private static String texturePath = "EdomTestShip.png";
                private static final int ID = 1;
                private static final int layer = 6;
                private static final float scaleX = 0.1f, scaleY = 0.1f;




                public TestFighter(int UUID, float x, float y, float dir, ArrayList<AdditionalSprite.TurretSprite> turretSprites) {
                    super(texturePath, ID, UUID, x, y, layer, dir, scaleX, scaleY, turretSprites, new ArrayList<AdditionalSprite.EngineSprite>(Arrays.asList(
                            //new Engines.TinyRedEngine(x, y - 30, layer, dir)






                    )));


                }



            }











        }

        public static class Israeli{







        }




        public static class Ishmaeli{









        }






    }





    public static class NonMilitary{


        public static class Edomite{







        }

        public static class Israeli{







        }




        public static class Ishmaeli{









        }

















    }



















}
