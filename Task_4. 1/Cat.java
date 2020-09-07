public class Cat {
    public int age;
    public int weight;
    public int strength;
    public Cat() {
        }
        public boolean fight(Cat anotherCat) {
        int count = 0;
        int count1 = 0;
        if(this.age > anotherCat.age){
            count++;
        } else if(this.age == anotherCat.age){
            count++;
            count1++;
        }
        else count1++;
        if(this.strength > anotherCat.strength){
            count++;
        }
        else if(this.strength == anotherCat.strength){
            count++;
            count1++;
        }
        else count1++;
        if(this.weight > anotherCat.weight){
            count++;
        }
        else if(this.weight == anotherCat.weight){
            count++;
            count1++;
        }
        else
            count1++;
        return count >= count1;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 6;
        cat1.weight = 6;
        cat1.strength = 6;
        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 3;
        cat2.strength = 3;
        if(cat1.fight(cat2)){
            System.out.println("cat1 win, cat2 lose"); }
        else if(cat2.fight(cat1)){
            System.out.println("cat2 win, cat1 lose");
        }
    }
}
