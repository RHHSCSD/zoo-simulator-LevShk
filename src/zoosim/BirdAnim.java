/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Lev Shkolnikov
 */
public class BirdAnim extends Animal implements IFlyable {
    
    private final boolean canfly;
    private int height;
    
    
    public BirdAnim(String name, String species, char sex, Image image, String sound, int posx, int posy, boolean bool){
        super(name, species, sex, image, sound, posx, posy);
        this.canfly = bool;
    }
    
    public BirdAnim(String name, String species, char sex, int speed, int age, Image image, String sound, boolean bool){
        super(name, species, sex, speed, age, image, sound);
        this.canfly = bool;
        
    }
    
    //making the bird fly
    @Override
    public void fly(){
      if(canfly){
          height++;
      } else{
          System.out.println(name + "can't fly");
      }
    }
    
    //landing the bird
    @Override
    public void land(){
        while(height > 0){
            height--;
        }
    }
    
    //checking if the bird is flying
    @Override
    public void isFlying(){
        if(height > 0){
            System.out.println(name + "is flying");
        } else{
            System.out.println(name + "has landed");
        }
        
    }
    
    
}
