public class Tiger {
    private String name;
    private String favoriteFood;


    public Tiger(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = "meat";
    }


    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
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
