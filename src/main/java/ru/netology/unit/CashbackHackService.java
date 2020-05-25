package ru.netology.unit;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {

        if (amount == boundary) {
            return boundary - amount;
        }
        return boundary - amount % boundary;
    }
}
