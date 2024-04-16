/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Lev Shkolnikov
 */
public class Object implements IObject {
    private int degrees = 0;
    private int posx;
    private int posy;
    private int height;
    private int width;
    
    String object;
    
    private Object(int posx, int posy, int height, int width, String object){
        this.posx = posx;
        this.posy = posy;
        this.height = height;
        this.width = width;
        this.object = object;
    }
    
    @Override
    public void turn(double degree){
        this.degrees+=degree;
        this.degrees%=360;
    }
    
    @Override
    public void place(int posx, int posy){
        this.posx = posx;
        this.posy = posy;
    }
}
