/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Lev Shkolnikov
 */
public class LandAnim extends Animal {
    public LandAnim(String name, String species, char sex, Image image, String sound, int posx, int posy){
        super(name, species, sex, image, sound, posx, posy);
    }
    
    public LandAnim(String name, String species, char sex, int speed, int age, Image image, String sound){
        super(name, species, sex, speed, age, image, sound);
    }
}
