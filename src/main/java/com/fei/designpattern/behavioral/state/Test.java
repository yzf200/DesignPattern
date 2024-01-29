package com.fei.designpattern.behavioral.state;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        State start = new StartState();
        start.oprator(context);

        System.out.println(context.getState().toString());

        EndState end = new EndState();
        end.oprator(context);

        System.out.println(context.getState().toString());

    }
}
