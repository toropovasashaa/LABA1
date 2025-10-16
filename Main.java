//создали класс
class Companies {
    //поля(характеристики каждого обьекта)
    String name;
    int quantity;
    int time;
    int salary;
    double nalog = 0.13;

    private Boolean Proverka(int value){
        return value >= 0 && value <= 1000000;
    }
    private int validateAndReturn(int value, String fieldName) {
        if (Proverka(value)) {
            return value;
        } else {
            System.out.println("Неправильный ввод для поля: " + fieldName + "в компании " + name);
            System.exit(1);
            return 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void setQuantity(int quantity) {
        this.quantity = validateAndReturn(quantity, "quantity");
    }
    public int getQuantity(){
        return quantity;
    }


    public void setTime(int time) {
        this.time = validateAndReturn(time,  "time");
    }
    public int getTime(){
        return time;
    }

    public void setSalary(int salary) {
        this.salary = validateAndReturn(salary, "salary");
    }
    public int getSalary(){
        return salary;
    }

    public double count() {
        return quantity * time * salary * nalog;
    }



    public static void main(String[] args) {
        Companies comp1 = new Companies();
        comp1.name = "gasprom";
        comp1.setQuantity(50);
        comp1.setTime(500);
        comp1.setSalary(2000);

        Companies comp2 = new Companies();
        comp2.name = "lukoil";
        comp2.setQuantity(80);
        comp2.setTime(150);
        comp2.setSalary(400);

        Companies comp3 = new Companies();
        comp3.name = "rosneft";
        comp3.setQuantity(100);
        comp3.setTime(200);
        comp3.setSalary(500000000);

        System.out.println(" Компания " + comp1.getName() + " получает подоходный налог в размере - " + comp1.count() + " $ ");
        System.out.println(" Компания " + comp2.getName() + " получает подоходный налог в размере - " + comp2.count() + " $ ");
        System.out.println(" Компания " + comp3.getName() + " получает подоходный налог в размере - " + comp3.count() + " $ ");
    }
}

