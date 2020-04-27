package com.kodilla.good.patterns.challenges.Allegro;

public class EmailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Wysyłam emaila");
    }
}
