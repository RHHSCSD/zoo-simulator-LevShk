/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author Lev Shkolnikov
 */
public interface IEntity extends IObject {
    
    public void move(); //move method
    public void eat(); //eat method
    public void sleep(); //sleep method
    public void makeSound(); //sound method
    
}
