package com.patika.siniflar.boks;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

     void run(){
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("====== YENI ROUND =======");
                if (randomFighter()){
                    f2.health = f1.hit(f2);
                    if(isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if(isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                }
                System.out.println(f1.name + " sağlık: " + f1.health );
                System.out.println(f2.name + " sağlık: " + f2.health );
            }
        } else {
            System.out.println("Sporcuların skletleri uymuyor!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kanazdı !");
            return true;
        }

        if(this.f2.health == 0) {
            System.out.println(f2.name + " kanazdı !");
            return true;
        }

        return false;
    }

    boolean randomFighter() {
        int randomNumber = (int) Math.random() * 2;

        if (randomNumber == 1){
            return true;
        } else {
            return false;
        }

    }

}
