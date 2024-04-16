/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Lev Shkolnikov
 */
public class Animal implements IEntity{
    
    //assigning an id
    
    private static int idSaved = 0;
    private int id;
    
    //Declaring variables
    
    public String name; //name of animal
    private String species; //species of animal
    private char sex; //sex of animal m/f
    private int age; //age of animal
    public int posx=0; //x position
    public int posy=0; //y position
    private int speed; //speed of animal
    public double degree; //degree for turning
    private int hunger=0; //hunger
    private int fatigue=0; //fatigue
    private Image Image; //Image of animal
    public String sound; //sound animal makes
    
    /**
     * Creates an animal with the specified parameters
     * 
     * @param name Name of animal
     * @param species Species of animal
     * @param sex Sex of animal
     * @param age Age of animal
     * @param speed Speed of animal
     * @param Image Image of animal
     * @param sound Sound animal makes
     */
    
    public Animal(String name, String species, char sex, int speed, int age, Image Image, String sound){
        idSaved++;
        id = idSaved;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.speed = speed;
        this.Image = Image;
        this.sound = sound;
    }
        /**
     * Creates an animal with the specified parameters
     * 
     * @param name Name of animal
     * @param species Species of animal
     * @param sex Sex of animal
     * @param posx x position of animal
     * @param posy y position of animal
     * @param Image Image of animal
     * @param sound Sound animal makes
     */
    
    public Animal(String name, String species, char sex, Image Image, String sound, int posx, int posy){
        idSaved++;
        id = idSaved;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.posx = posx;
        this.posy = posy;
        this.Image = Image;
        this.sound = sound;
    }
    
    
    
        //make a sound
        @Override
        public void makeSound(){
            System.out.print(sound);
        }
        
        //eat
        @Override
        public void eat(){
            hunger++;
            System.out.println("Animal has been fed");
        }
        
        
        //sleep
        @Override
        public void sleep(){
            fatigue++;
            System.out.println("Animal has slept");
        }
        
        //move
        @Override
        public void move(){
            posx += speed;
            posy += speed;
        }
        
        @Override
        public void turn(double degree){
        }
        
        @Override
        public void place(int posx, int posy){   
        }
        
        //Getters
        
        public int getAge(){
            return age;
        }
        
        public char getSex(){
            return sex;
        }
        
        public int getSpeed(){
            return speed;
        }
        
    
}
