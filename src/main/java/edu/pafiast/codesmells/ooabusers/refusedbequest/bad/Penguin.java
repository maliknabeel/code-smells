package edu.pafiast.codesmells.ooabusers.refusedbequest.bad;

public class Penguin extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}