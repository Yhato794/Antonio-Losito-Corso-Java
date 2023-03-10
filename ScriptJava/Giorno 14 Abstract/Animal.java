abstract class Animal {
    public abstract void animalSound();
    public void ciao(){
        System.out.println("ciao");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.err.println("Pig noises");
    }

}

class dog extends Animal {
    public void animalSound() {
        System.out.println("Dog noises");
    }

}

class Main {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal(); //non puoi "instanziare/creare oggetti" di
        // classi astratte
        
        Animal myPig = new Pig();
        Animal myDog = new dog();
        myPig.animalSound();
        myDog.animalSound();
        myPig.ciao();
    }
}