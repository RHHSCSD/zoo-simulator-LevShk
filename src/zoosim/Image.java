/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Lev Shkolnikov
 */
public class Image {
    public int width; //width of image
    public int height; //height of image
    
    public int getWidth(){ //getter for width
        return width;
    }
    
    public int getHeight(){ //getter for height
        return height;
    }
    public Image (int h, int w){ //constructor for image
        this.width = w;
        this.height = h;
    }
}
