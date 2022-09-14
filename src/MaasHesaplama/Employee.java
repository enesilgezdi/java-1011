package MaasHesaplama;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

     public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours= workHours;
        this.hireYear = hireYear;

    }

     public double tax(){
         if(this.salary<1000){
             return 0;
         }else{
             double tax = salary * 0.03;
             return tax;
         }
    }

    public int bonus(){
         if(this.workHours> 40){
             int bonus = (this.workHours-40)*30;
             return bonus;

         }
         return 0;
    }

    public double raiseSalary(){
        int today = 2022;
        int subtraction = today - this.hireYear;
        double raise = 0;

        if(subtraction < 10){
            raise = this.salary * 0.05;
            return raise;
        }else if(subtraction > 9 && subtraction < 20){
            raise = this.salary * 0.10;
            return raise;
        }else if(subtraction > 19){
            raise = this.salary * 0.15;
            return raise;
        }
        return 0;
    }

    public String toString(){
        double total = salary -tax() + bonus() + raiseSalary();
        double tot = salary +bonus() - tax();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : " +raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);


        return null;
    }

}
