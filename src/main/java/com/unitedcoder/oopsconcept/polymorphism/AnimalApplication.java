package com.unitedcoder.oopsconcept.polymorphism;

public class AnimalApplication {
    public static void main(String[] args) {
      Animal animal=new Animal();
          animal.animalSound();
          animal.animalEat("Animal Food");

          Cat cat=new Cat();
          cat.animalSound();
          cat.animalEat("fish");
          cat.animalSleep();

          Dog dog=new Dog();
          dog.animalSound();
          dog.animalEat("bone");
          dog.animalSleep();

        System.out.println("Cat Object with Animal object reference");
          Animal c=new Cat();
          c.animalEat("Food");
          c.animalSound();
          Animal d=new Dog();
          d.animalSound();
          d.animalEat("Dog food");
          d.animalSleep();

      }
    }
