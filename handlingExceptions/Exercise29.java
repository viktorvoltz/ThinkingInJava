/**
 * @author viktorvoltz
 */

class BaseballException extends RuntimeException {
}

class Foul extends RuntimeException {
}

class Strike extends RuntimeException {
}

abstract class Inning {
    public Inning() {
    }

    public void event() {
    }

    public abstract void atBat();

    public void walk() {
    }
}

class StormException extends RuntimeException {
}

class RainedOut extends RuntimeException {
}

class PopFoul extends RuntimeException {
}

interface Storm {
    public void event();

    public void rainHard();
}

class StormyInning29 extends Inning implements Storm {
    public StormyInning29() {
    }

    public StormyInning29(String s) {
    }

    public void walk() {
    }

    public void event() {
    }

    public void rainHard() {
    }

    public void atBat() {
    }

    public static void main(String[] args) {
        StormyInning29 si = new StormyInning29();
        si.atBat();

        Inning i = new StormyInning29();
        i.atBat();
    }
}