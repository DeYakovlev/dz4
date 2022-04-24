public class Lesson11_2 {
    public static void main(String args []) {
        int y;
        y = 9;
        if (y>10) {
            System.out.print("больше 10");
        }
        if (y<100){
            System.out.println("меньше 100");
        }
        if (y%2>50){
            System.out.println("результат деления на 2 больше 20 ");
        }
         if (5 >= y  &&  y <= 40){
            System.out.println("значение переменной между 5 и 40 включительно ");
        }
        else if (5<y || y>40){
            System.out.println("значение переменной меньше 5 или больше 40");
        }

    }
}
