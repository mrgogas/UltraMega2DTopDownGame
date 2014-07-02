package cz.punga.jecna.entity;

import java.awt.Rectangle;
import java.util.ArrayList;

public class EntityManager {
	private static ArrayList<Entity> entityList = new ArrayList<Entity>();
	public static void add(Entity e)
	{
		entityList.add(e);
	}
	public static void now(){
		ArrayList<Entity> collideList = new ArrayList<Entity>();
		for(Entity en : entityList){
			if(en.getCollidablity())
				collideList.add(en);
		}
		for(Entity en : entityList){
			en.draw();
			if(en.getCollidablity()){
				Rectangle enRect = new Rectangle(en.getX(),en.getY(),en.getW(),en.getH());
				for(Entity cEn : collideList){
					Rectangle cEnRect = new Rectangle(cEn.getX(),cEn.getY(),cEn.getW(),cEn.getH());
					if(cEnRect.intersects(enRect))
						en.collide(cEn);
				}
			}
		}
	}
}