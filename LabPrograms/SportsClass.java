/*Write a java program to create q base class Sports with a method called play(). Create three subclasses football, basketball and rugby. Override the play() method in each subclass to play  */



class Sports {
    public void play() {
        System.out.println("Playing a generic sport.");
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football.");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball.");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby.");
    }
}

public class SportsClass {
    public static void main(String[] args) {
        Sports genericSport = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        System.out.print("Generic Sport: ");
        genericSport.play();

        System.out.print("Football: ");
        football.play();

        System.out.print("Basketball: ");
        basketball.play();

        System.out.print("Rugby: ");
        rugby.play();
    }
}

