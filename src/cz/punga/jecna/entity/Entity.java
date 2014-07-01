package cz.punga.jecna.entity;

public abstract class Entity {
protected String src;
private int x;
private int y;

public Entity(int x, int y)
{
	this.x = x;
	this.y = y;
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
public abstract void draw();
public abstract void colide();
}
