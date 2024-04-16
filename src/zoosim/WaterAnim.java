/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Lev Shkolnikov
 */
public class WaterAnim extends Animal implements ISwimmable {
    
     private final boolean canSurface;
    
     public WaterAnim(String name, String species, char sex, Image image, String sound, int posx, int posy, boolean bool){
        super(name, species, sex, image, sound, posx, posy);
        this.canSurface = bool;
    }
    
    public WaterAnim(String name, String species, char sex, int speed, int age, Image image, String sound, boolean bool){
        super(name, species, sex, speed, age, image, sound);
        this.canSurface = bool;
        
    }
    
    
    
    //can the fish surface
    @Override
    public void canSurface(){
        if (canSurface == true){
            System.out.println(name + "can surface");
        }
    }
    
}
