package ru.itsjava;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("farmer")
//@RequiredArgsConstructor
public class KindFarmer {
    private final Animal animal;

    public KindFarmer(@Qualifier("piglet") Animal animal) {
        this.animal = animal;
    }

    public void hiToAnimal(){
        System.out.println("Привет моя любимая");
        animal.say();
    }
}
