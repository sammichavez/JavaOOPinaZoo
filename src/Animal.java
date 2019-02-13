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
                System.out.println(name + " eats " + food);
                if (food == this.favoriteFood) {
                        System.out.println("YUM!!! " + this.name + " wants more " + food);
                } else {
                        this.sleep();
                }
        }

        public void main(String[] args) {
                Tiger tigger = new Tiger("Tigger");
                tigger.eat("meat");
                tigger.eat("kibble");
                Bear pooh = new Bear("Pooh");
                pooh.eat("fish");
                pooh.eat("meat");

        }
}


