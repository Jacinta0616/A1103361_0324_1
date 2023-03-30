class IniAnimal{
        
    String name;
    int height;
    int weight;
    int fast;

    void show(){
        System.out.println("Name:"+ name +" Height:"+height+" Weight:"+weight+" Fast:"+fast);
    }
    

    int distance(int x){
        int z;
        z=x*this.fast;
        return z;
        // System.out.println("Speed:"+z);
    }
    double distance(int x,double y){
        double i;
        i=x*y*this.fast;
        return i;
        // System.out.println("Speed:"+i);
    }

}

public class Animal{
    public static void main(String[]argv){
        IniAnimal animal1,animal2,animal3,animal4;
        animal1=new IniAnimal();
        animal2=new IniAnimal();
        animal3=new IniAnimal();
        animal4=new IniAnimal(); 

        animal1.name="雪寶";
        animal1.height=110;
        animal1.weight=52;
        animal1.fast=100;
        
        animal2.name="驢子";
        animal2.height=150;
        animal2.weight=99;
        animal2.fast=200;
        
        animal3.name="安那";
        animal3.height=170;
        animal3.weight=58;
        animal3.fast=120;
        
        animal4.name="愛沙";
        animal4.height=170;
        animal4.weight=50;
        animal4.fast=120;
        
        animal1.show();
        animal2.show();
        animal3.show();
        animal4.show();
    }
}