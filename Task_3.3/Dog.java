public class Dog {
    String name;
    int age;
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        public static void main (String[]args){
            Dog dog = new Dog();
            dog.setName("Бобик");
            dog.setAge( 3);
            System.out.println(dog.name +dog.age );
        }
}
