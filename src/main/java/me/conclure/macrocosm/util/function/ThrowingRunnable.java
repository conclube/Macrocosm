package me.conclure.macrocosm.util.function;

public interface ThrowingRunnable<E extends Exception> {
    void run() throws E;
}
