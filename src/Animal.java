public class Animal {
        String name;
        String favoriteFood;
        public Animal(String name, String favoriteFood) {
                this.name = name;
                this.favoriteFood = favoriteFood;

        }

        public void sleep() {
                System.out.println(this.name + " sleeps for 8 hours");
        }
        public void eat(String food) {

                if(food == this.favoriteFood){
                        System.out.println(this.name + " eats " +  food);
                        System.out.println("YUM!!! "  + this.name + " wants more "+  food);
                }else{
                        sleep();
                }
        }
        public viod main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat ("fish");
        pooh.eat("meat");
        }
}
