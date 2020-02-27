package io.littleworld.enums;

enum State {
    INACTIVE,
    ACTIVE,
    PAUZE
}

public class StateMachine {

    public static void main(String[] args) {

        State state = State.INACTIVE;

        switch (state) {
            case INACTIVE:
                System.out.println("inactive");
                break;
            case ACTIVE:
                System.out.println("active");
                break;
            case PAUZE:
                System.out.println("pauze");
                break;
        }


    }
}
