package cz.punga.jecna.entity;

public abstract class Entity {
	protected String src;
	private boolean colidable;
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
	public boolean getColid()
	{
		return colidable;
	}
	public void setColid(boolean colidable)
	{
		this.colidable = colidable;
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
	public abstract void colide(Entity e);
}
