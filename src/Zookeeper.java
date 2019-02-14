public class Zookeeper {
    string name;

    public string getName() {
        return name;
    }

    public void feedAnimals( Animal [] animals,string food) {
        System.out.println(this.name + " is feeding " + food + " to " + animals.length + " of " + Animal.population + " total animals");
        System.out.println(this.name + "is feeding" + food + "to" + animals.length + "animals");
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat(food);
        }
    }

}
