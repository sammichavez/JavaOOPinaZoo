public class Tiger extends Animal {
    public Tiger(String name){
        super(name, "meat");
    }


    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void main(String [] args) {
       Tiger tigger = new Tiger("tigger");
       tigger.eat("meat");
       tiger.eat("kibble");
}
