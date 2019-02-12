public class Bear {
    private String name;
    private String favoriteFood;

    public Bear(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = "fish";
    }
    public void sleep() {
        System.out.println(name + " hibernates for 4 months ");
    }
        public void eat(String food) {
        System.out.println(this.name + " eats " + food);

        if (food == favoriteFood) {

            System.out.println("YUM!!! " + this.name + " wants more " + food);

        } else {

            sleep();

        }

    }
}

