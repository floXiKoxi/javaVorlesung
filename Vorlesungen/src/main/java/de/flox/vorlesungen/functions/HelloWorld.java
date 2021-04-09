package de.flox.vorlesungen.functions;

public class HelloWorld {

    private String name;

    public HelloWorld(String name){
        this.name = name;
    }
    public HelloWorld(){ }

    public void print(){

        if(isNameAvaible()){
            printHellowithName();
        }else{
            printHello();
        }
    }

    //Checks if Name is avaible
    public boolean isNameAvaible(){

        if(getName() != null){
            return true;
        }
        return false;
    }

    //Prints "Hello {Name}" with individual name
    //println prints a single line with \n
    public void printHellowithName(){
        System.out.println("Hello "+getName());
    }

    //Prints "Hello World" without a name
    public void printHello(){
        System.out.println("Hello World");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
