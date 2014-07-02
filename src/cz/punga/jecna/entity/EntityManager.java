package cz.punga.jecna.entity;

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
			
		}
	}
}