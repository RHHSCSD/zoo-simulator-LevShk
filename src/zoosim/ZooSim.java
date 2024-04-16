/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
import java.util.Arrays;
        

/**
 *
 * @author Lev Shkolnikov
 */
public class ZooSim {

    private Animal[] ZooAnimals;
    
    public static void main(String[] args) {
        
        Animal[] ZooAnimals = new Animal[2]; //Initializing a new array of animals
        
        Image image; 
        int age; 
        int speed;
        char sex;
        boolean bool;
        double random;
        String name;
        int posx = 0;
        int posy = 0;
  
        
        //String arrays for male names, female names, and species
        String[] MaleNames = new String[]{"Jeffrey", "Bob", "Steven", "John"};
        String[] FemaleNames = new String[]{"Stella", "Mary", "Kelly", "Ruby"};
        String[] LandSpecies = new String[]{"Tiger", "Lion", "Snake", "Elephant"};
        String[] FishSpecies = new String[]{"Cod", "Bass", "Krill", "Jellyfish"};
        String[] BirdSpecies = new String[]{"Jay", "Eagle", "Owl", "Dove"};
         
                
        
        //randomizing sex age speed and size of image, also assigning name
        for(int i =0; i<ZooAnimals.length; i++){
            if (Math.random()<0.5){
                sex = 'M';
                name = MaleNames[(int)(Math.random()*5)];
            } else{
                sex = 'F';
                name = FemaleNames[(int)(Math.random()*5)];
           } 
            age = (int)(Math.random()*21);
            speed = (int)(Math.random()*10);
            image = new Image((int)(Math.random()*5), (int)(Math.random()*5));
        
            //deciding if it can fly/swim
            if(Math.random()>0.5){
                bool = false;
            }
            else{
                 bool = true;
                        }

            //Randomly deciding on a type of animal and constructing it
            random = Math.random();

            if(random > 0.7){
                ZooAnimals[i] = new LandAnim(name, LandSpecies[(int)(Math.random()*5)], sex, speed, age, image, "roar");
            } else if(random>0.5){
                ZooAnimals[i] = new BirdAnim(name, BirdSpecies[(int)(Math.random()*5)], sex, speed, age, image, "tweet", bool);
            } else{
               ZooAnimals[i] = new WaterAnim(name, FishSpecies[(int)(Math.random()*5)], sex, speed, age, image, "blub", bool);
            }
        } 
        
         
        
     }
        //display specific animal statistics
        public void displayStatistics(){
            for(Animal animal : ZooAnimals){
                System.out.println("Name: " + animal.name, "Sex: " + animal.getSex(), "Speed: " + animal.getSpeed(), "Age: " + animal.getAge());
            }
        }
        //display general animal statistics 
        public void displayGeneralStatistics(){
            int male = 0;
            int female = 0;
            double averageAge = 0;
            double averageSpeed = 0;
            double average = 0;
            
            for(Animal x : ZooAnimals){
               char current = x.getSex();
               if(current == 'm'){
                   male++;
               } else{
                   female++;
               }
               
               int currentAge = x.getAge();
               averageAge = averageAge+currentAge;
               average++;
               
               int currentSpeed = x.getSpeed();
               averageSpeed = averageSpeed+currentSpeed;
            }
            System.out.println("Male: " + male);
            System.out.println("Female: " + female);
            System.out.println("Average Speed: " + averageSpeed/average);
            System.out.println("Average Age: " + averageAge/average);
        }
        
        //add a land animal
        public void addLandAnimal(String name, String species, char sex, int speed, int age, Image image, String noise){
            ZooAnimals.add(new LandAnim(name, species, sex, speed, age, image, noise));
        }
        //adding a water animal
        public void addWaterAnimal(String name, String species, char sex, int speed, int age, Image image, String noise, boolean bool){
            ZooAnimals.add(new WaterAnim(name, species, sex, speed, age, image, noise, bool));
        }
        
        //adding a bird animal
        public void addBirdAnimal(String name, String species, char sex, int speed, int age, Image image, String noise, boolean bool){
            ZooAnimals.add(new BirdAnim(name, species, sex, speed, age, image, noise, bool));
        }
        
        //moving animal
        public void moveAnimals(){
            for(Animal x : ZooAnimals){
                System.out.println("Moving animals");
                x.move();
            }
        }
        //feeding animal
        public void feedAnimals(){
            for(Animal x : ZooAnimals){
                System.out.println("Feeding animals");
                x.eat();
            }
        }
        
        //making all animals sleep
        public void sleepAnimals(){
            for(Animal x : ZooAnimals){
                System.out.println("animals are sleeping");
                x.sleep();
            }
        }
}


//Thinking questions: 
// For predator/prey interactions I would add 2 sub classes of the animal class, and work off of the hunger variable
// as a predator becomes more hungry it would go find a prey randomly from the array, and a method in the predator class
// would remove the prey from the array. one possible idea to implement would be a check for predator to prey ratios
// that would decrease the predator population when the prey is low, and increase the prey population when the predator 
// count is low. 
//
// carnivores would be implemented in the method above but for herbivores we would need another class of objects for plants
// the plants would be randomly distributed and spawn randomly at a set rate, and a new method would be added to 
// herbivores and omnivores to eat a plant. a random value would be used to determine whether the animals is an omnivore
// herbivore or carnivore, and fish would be resorted to only eating a subclass of plants called sea plankton