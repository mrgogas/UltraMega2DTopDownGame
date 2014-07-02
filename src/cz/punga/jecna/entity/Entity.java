package cz.punga.jecna.entity;

public abstract class Entity {
	protected String src;
	private boolean collidable;
	private int x;
	private int y;
	private int w;
	private int h;
	
	public Entity(int x, int y,int w,int h)
	{
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public Entity(int x, int y,int w,int h,String src)
	{
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.src = src;
	}
	public boolean getCollidablity()
	{
		return collidable;
	}
	public void setCollidabily(boolean colidable)
	{
		this.collidable = colidable;
	}
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void addX(int x)
	{
		setX(getX()+x);
	}
	public void addY(int y)
	{
		setX(getY()+y);
	}	
	public int getW()
	{
		return w;
	}
	public void setW(int w)
	{
		this.w = w;
	}
	public int getH()
	{
		return h;
	}
	public void setH(int h)
	{
		this.h = h;
	}
	public abstract void draw();
	public abstract void collide(Entity e);
}
