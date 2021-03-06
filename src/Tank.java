

import org.newdawn.slick.Image;

/**
 *
 * @author Ujitha
 */
public class Tank {
    
    private int X_cordination,Y_cordination;
    private int direction;
    private int health,coins;
    private int points,whether_shot;
    private String name;
    private Image tankImg;
    
    
    
    public Tank(Image img)
    {
        this.tankImg=img;
        this.health=100;
        this.coins=0;
        this.points=0;
    }
    public Tank (int dir,Image img,int x,int y)
    {
        this.tankImg=img;
        this.direction=dir;
        
       if(this.direction==1)
        {
            this.tankImg.setRotation(0);
        }
        else if (this.direction==2)
        {
            this.tankImg.setRotation(90);
        }
        else if(this.direction==3)
        {
            this.tankImg.setRotation(180);
        }
        else if(this.direction==0)
        {
            this.tankImg.setRotation(270);
        }
       
       this.X_cordination=x;
       this.Y_cordination=y;
            
    }
    
    
    /**
     * @return the X_cordination
     */
    public int getX_cordination() {
        return X_cordination;
    }

    /**
     * @param X_cordination the X_cordination to set
     */
    public void setX_cordination(int X_cordination) {
        this.X_cordination = X_cordination;
    }

    /**
     * @return the Y_cordination
     */
    public int getY_cordination() {
        return Y_cordination;
    }

    /**
     * @param Y_cordination the Y_cordination to set
     */
    public void setY_cordination(int Y_cordination) {
        this.Y_cordination = Y_cordination;
    }

    /**
     * @return the diretion
     */
    public int getDiretion() {
        return direction;
    }

    /**
     * @param diretion the diretion to set
     */
    public void setDirection(int diretion) {
        this.direction = diretion;
        
         if(this.direction==1)
        {
            this.tankImg.setRotation(0);
        }
        else if (this.direction==2)
        {
            this.tankImg.setRotation(90);
        }
        else if(this.direction==3)
        {
            this.tankImg.setRotation(180);
        }
        else if(this.direction==0)
        {
            this.tankImg.setRotation(270);
        }
        
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the coins
     */
    public int getCoins() {
        return coins;
    }

    /**
     * @param coins the coins to set
     */
    public void setCoins(int coins) {
        this.coins = coins;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * @return the whether_shot
     */
    public int getWhether_shot() {
        return whether_shot;
    }

    /**
     * @param whether_shot the whether_shot to set
     */
    public void setWhether_shot(int whether_shot) {
        this.whether_shot = whether_shot;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tankImg
     */
    public Image getTankImg() {
        return tankImg;
    }

    /**
     * @param tankImg the tankImg to set
     */
    public void setTankImg(Image tankImg) {
        this.tankImg = tankImg;
    }    
}


class Brick{
    
    private Image brick;
    private int X_cordinates,Y_cordinates;
    private int damage;
    
    public Brick(Image img)
    {
        this.brick=img;
        
    }

    /**
     * @return the brick
     */
    public Image getBrick() {
        return brick;
    }

    /**
     * @param brick the brick to set
     */
    public void setBrick(Image brick) {
        this.brick = brick;
    }

    /**
     * @return the X_cordinates
     */
    public int getX_cordinates() {
        return X_cordinates;
    }

    /**
     * @param X_cordinates the X_cordinates to set
     */
    public void setX_cordinates(int X_cordinates) {
        this.X_cordinates = X_cordinates;
    }

    /**
     * @return the Y_cordinates
     */
    public int getY_cordinates() {
        return Y_cordinates;
    }

    /**
     * @param Y_cordinates the Y_cordinates to set
     */
    public void setY_cordinates(int Y_cordinates) {
        this.Y_cordinates = Y_cordinates;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
}



class Stone {

    private int xCord;
    private int yCord;
    private Image image;

    public Stone(Image img) {
        this.image = img;
    }

    public void setxy(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public Image getImage() {
        return image;
    }

    public int getxCord() {
        return xCord;
    }

    public int getyCord() {
        return yCord;
    }
}


class Water{
    
    private int X_cod,Y_cod;
    private Image waterimg;
    
    public Water(int X,int Y,Image img)
    {
        this.X_cod=X;
        this.Y_cod=Y;
        this.waterimg=img;      
        
    }
    public Water(Image img)
    {
        this.waterimg=img;
    }
    
    public void setCordinates(int X,int Y)
    {
        this.X_cod=X;
        this.Y_cod=Y;
    }
    
    public int getX()
    {
        return X_cod;
    }
    
    public int getY()
    {
        return Y_cod;
    }
    
    public Image getimage()
    {
        return waterimg;
    }
    
}

class coinpile{
    
    private int X_cod,Y_cod;
    private int lifetime;
    private int appeartime;
    private Image coin;
    private int value;
    
    public coinpile(Image img,int appeartime)
    {
        this.coin=img;
        this.appeartime=appeartime;
    }
    
    public void setCordinates(int X,int Y)
    {
        this.X_cod=X;
        this.Y_cod=Y;
    }
    
    public void setValue(int val)
    {
        this.value=val;
    }
    
    public int getValue()
    {
        return value;
    }

    /**
     * @return the X_cod
     */
    public int getX_cod() {
        return X_cod;
    }

    /**
     * @return the Y_cod
     */
    public int getY_cod() {
        return Y_cod;
    }

    /**
     * @return the lifetime
     */
    public int getLifetime() {
        return lifetime;
    }

    /**
     * @param lifetime the lifetime to set
     */
    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    /**
     * @return the appeartime
     */
    public int getAppeartime() {
        return appeartime;
    }

    /**
     * @param appeartime the appeartime to set
     */
    public void setAppeartime(int appeartime) {
        this.appeartime = appeartime;
    }

    /**
     * @return the coin
     */
    public Image getCoin() {
        return coin;
    }

    /**
     * @param coin the coin to set
     */
    public void setCoin(Image coin) {
        this.coin = coin;
    }
     
}

class Health{
    
    private int X_cod,Y_cod;
    private int appeartiem;
    private int lifetime;
    private Image healthimg;
    
    public Health(Image img,int appeartime)
    {
        this.healthimg=img;
        this.appeartiem=appeartime;
    }

    /**
     * @return the X_cod
     */
    public int getX_cod() {
        return X_cod;
    }

    /**
     * @param X_cod the X_cod to set
     */
    public void setXYcod(int X_cod,int Y) {
        this.X_cod = X_cod;
        this.Y_cod=Y;
    }

    /**
     * @return the Y_cod
     */
    public int getY_cod() {
        return Y_cod;
    }

    /**
     * @param Y_cod the Y_cod to set
     */
    public void setY_cod(int Y_cod) {
        this.Y_cod = Y_cod;
    }

    /**
     * @return the appeartiem
     */
    public int getAppeartime() {
        return appeartiem;
    }

    /**
     * @param appeartiem the appeartiem to set
     */
    public void setAppeartime(int appeartiem) {
        this.appeartiem = appeartiem;
    }

    /**
     * @return the lifetime
     */
    public int getLifetime() {
        return lifetime;
    }

    /**
     * @param lifetime the lifetime to set
     */
    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    /**
     * @return the healthimg
     */
    public Image getHealthimg() {
        return healthimg;
    }

    /**
     * @param healthimg the healthimg to set
     */
    public void setHealthimg(Image healthimg) {
        this.healthimg = healthimg;
    } 
            
    
}


class Coin {

    public int value;
    public int vanish;
    public int x;
    public int y;

    Coin(int val, int vanish, int x, int y) {
        this.value = val;
        this.vanish = vanish;
        this.x = x;
        this.y = y;
    }
}

class LifePack {

    public int vanish;
    public int x;
    public int y;

    LifePack(int vanish, int x, int y) {

        this.vanish = vanish;
        this.x = x;
        this.y = y;
    }
}






        
    

