package com.patika.siniflar.maasHesaplama;

public class Employee {

    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary < 1000){
            return 0;
        }
        this.salary -= this.salary * 0.03;
        return this.salary * 0.03;
    }

    public double bonus(){
        if (this.workHours > 40) {
            double overTime = this.workHours - 40;
            this.salary += overTime * 30;
            return overTime * 30;
        }
        return 0;
    }

    public double raiseSalary(){
        int thePassingTime = 2021 - this.hireYear;

        if (thePassingTime < 10){
            this.salary += this.salary * 0.05;
            return this.salary * 0.05;
        } else if(thePassingTime > 9 && thePassingTime < 20){
            this.salary += this.salary * 0.1;
            return this.salary * 0.1;
        } else {
            this.salary += this.salary * 0.15;
            return this.salary * 0.15;
        }

    }

    @Override
    public String toString() {
        return  "Adı= " + name + '\n' +
                "Maaşı= " + salary + '\n' +
                "Çalışma Saati= " + workHours + '\n' +
                "Başlangıç Yılı= " + hireYear + '\n' +
                "Vergi = " + tax() + '\n' +
                "Bonus = " + bonus() + '\n' +
                "Maaş Artışı= " + raiseSalary() + '\n' +
                "Vergi ve Bonuslar ile birlikte maas= " + (salary) + '\n' +
                "Toplam Maaş= " + (salary - tax() + bonus() + raiseSalary());
    }
}
