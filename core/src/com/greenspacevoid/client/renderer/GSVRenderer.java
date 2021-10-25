package com.greenspacevoid.client.renderer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.backends.lwjgl.LwjglAWTCanvas;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.greenspacevoid.client.renderer.renderableEntity.RenderedEntity;
import com.greenspacevoidsharedAPI.networking.network.messages.gameEntity.VisualEntityMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GSVRenderer extends ApplicationAdapter {
	public static AssetManager assetManager;
	public static RenderedEntity PlayerShip;
	public static ArrayList<RenderedEntity> renderedEntities;
	private Camera camera;
	private Viewport viewport;

	SpriteBatch batch;
	Texture img;
	Texture img2;
	Sprite s, s2;

	int x = 0, y = 0;

	RenderedEntity e;
	//Todo: renderer go brrrrt
	@Override
	public void create () {

		assetManager = new AssetManager();
		AssetWrapper.loadAssets();
		assetManager.finishLoading();

		camera = new OrthographicCamera();
		viewport = new ExtendViewport(150 , 150, camera);
		viewport.apply();
		camera.position.set(camera.viewportWidth/2, camera.viewportHeight/2,0);


		renderedEntities = new ArrayList<>();


		batch = new SpriteBatch();
		img = new Texture("img3.png");
		img2 = new Texture("badlogic.jpg");

		s = new Sprite(img);
		s2 = new Sprite(img2);



	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//renderLayers(); //Renders all objects, in order, on their respective layers.
		//background = new Texture(Gdx.files.internal("stars.png"));

		//s2.setPosition((float)Math.sin(x++), (float)Math.cos(y++));


		batch.begin();

		for(RenderedEntity e : renderedEntities){

			e.draw(batch);






		}


		s2.draw(batch);
		//batch.end();






		//batch.enableBlending();


// then use special blending.

		//batch.begin();
		//Gdx.gl.glEnable(GL20.GL_BLEND);
		//Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
		//e.draw(batch);
		//batch.draw(s2, 2, 2);

		//Gdx.gl.glDisable(GL20.GL_BLEND);




		batch.end();
	}


	@Override
	public void resize(int width, int height){
		viewport.update(width, height);
		System.out.println(width + "" + height);
		camera.update();


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










	public static class GameWindowFrame extends JInternalFrame{



		public GameWindowFrame(LwjglApplicationConfiguration config){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			final Container container = getContentPane();
			container.setLayout(new BorderLayout());


			LwjglAWTCanvas canvas = new LwjglAWTCanvas(new GSVRenderer(), config);

			container.add(canvas.getCanvas(), BorderLayout.CENTER);

			pack();
			setVisible(true);
			setSize(1600, 900);
			this.setResizable(true);

			this.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					GameWindowFrame.super.moveToBack();
					System.out.println("TRIGERED");
				}

				@Override
				public void mousePressed(MouseEvent e) {

				}

				@Override
				public void mouseReleased(MouseEvent e) {

				}

				@Override
				public void mouseEntered(MouseEvent e) {

				}

				@Override
				public void mouseExited(MouseEvent e) {

				}
			});


		}








	}



























}

