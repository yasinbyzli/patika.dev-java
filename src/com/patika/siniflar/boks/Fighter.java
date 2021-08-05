package com.patika.siniflar.boks;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter fighter){
        System.out.println(this.name + " => " + fighter.name + " " + this.damage + " hasar vurdu.");
        if (isDodge()) {
            System.out.println(fighter.name + " gelen hasarı blokladı!");
            return fighter.health;
        }
        if(fighter.health - this.damage < 0)
            return 0;
        return fighter.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return  randomNumber <= this.dodge;
    }

}
