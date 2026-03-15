package programs.newcode;

abstract class MyNewAbstract {
    abstract void welcomeMessage(String name);

    int addition(int a, int b){
        int sum = a+b;
        return sum;
    }
}

class MySecondAbstract extends MyNewAbstract {

    @Override
    void welcomeMessage(String name) {
        System.out.println("hi " + name + "welcome to ednue tech");
    }

}
