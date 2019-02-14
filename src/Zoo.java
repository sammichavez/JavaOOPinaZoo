public class Zoo {
    String favoriteFood = "bacon";
    public static void main(String[] args) {
        Zoo tigger = new Zoo("Tigger");
        tigger.eat("Tigger", "bacon");
        tigger.eat("Tigger", "kibble");
        tigger.sleep("tigger");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn unicorn = new Unicorn("Rarity");
        unicorn.eat("marshmellows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee bee = new Bee("Stinger");
        bee.eat("ice cream");
        bee.eat("pollen");
        Animal[] animals = new Animal[]{Tigger,Pooh, Rarity, Gemma, Stinger};
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "meat");
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String name, String food) {
        System.out.println(name + " eats " + food);
        if (food == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);

        }
    }
}

