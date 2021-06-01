package com.greenspacevoid.client.renderer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.greenspacevoidsharedAPI.networking.network.messages.gameEntity.VisualEntityMessage;

import java.util.ArrayList;

public class GSVClient extends ApplicationAdapter {
	AssetManager assetManager;




	SpriteBatch batch;
	Texture img;
	Texture img2;
	Sprite s, s2;
	//Todo: renderer go brrrrt
	@Override
	public void create () {
		assetManager = new AssetManager();
		loadAssets();
		assetManager.finishLoading();



		batch = new SpriteBatch();
		img = new Texture("img3.png");
		img2 = new Texture("badlogic.jpg");

		s = new Sprite(img);
		s2 = new Sprite(img2);
	}

	@Override
	public void render () {

		//renderLayers(); //Renders all objects, in order, on their respective layers.













		batch.enableBlending();


// then use special blending.

		batch.begin();
		//Gdx.gl.glEnable(GL20.GL_BLEND);
		//Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
		s.draw(batch);
		batch.draw(s2, 2, 2);

		//Gdx.gl.glDisable(GL20.GL_BLEND);




		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}


	public void renderEntities(ArrayList<VisualEntityMessage> visualEntities){
		for(VisualEntityMessage visualEntityMessage : visualEntities){
			//if(visualEntity





		}








	}










	/*

	Format is as follows assetManager.load("Path", type.class);
	i.e,
	assetManager.load("img.png", Texture.class);
	assetManager.load("fart_reverb.mp3", Music.class);


	 */





	public void loadAssets(){
		loadShipAssets();
		loadWorldAssets();
		loadParticleAssets();
		loadMiscAssets();
	}

	public void loadShipAssets(){




	}


	public void loadWorldAssets(){






	}


	public void loadParticleAssets(){



	}

	public void loadMiscAssets(){




	}

































}

