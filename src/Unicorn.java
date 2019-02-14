public class Unicorn {
    public Unicorn(String name){
        super(name , "marshmellows")
    }
    public void eat(String food){
        if(food == this.favoriteFood){
            System.out.println(name + " eats " +  food);
            System.out.println( "YUM!!! "  + this.name + " wants more " +  food);
            sleep();
        }else{
            System.out.println( "YUCK!!! "  + this.name + " will not eat " +  food);
        }
    }
    public void sleep() {
        System.out.println(this.name + " sleeps on cloud nine ");
    }
}
}
