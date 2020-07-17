        // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

    public class MainHw {
        public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
            byte val1 = -127;
            int val2 = 1000;
            boolean val3 = true;
            char val4 = '3';
            short val5 = 32767;
            long val6 = 300000L;
            double val7 = 30.1000;
            float val8 = 30.10f;

            // значения для заданий № 2 - 8

            System.out.println("расчёты по формуле a * (b + (c / d)) результат: " + calculator(10,20,30,40)); // задание №3
            System.out.println("сумма числе лежит в пределах от 10 до 20 (включительно): " + from10and20(1,2)); // задание №4
            isPositiveOrNegative(10); // задание №5
            isNegative(11); // задание №6
            greetings("matr1x"); // задание №7
            year(2020); // задание №8

            /*вывод задания №2

            System.out.println("byte = " + val1);
            System.out.println("int = " + val2);
            System.out.println("boolean = " + val3);
            System.out.println("char = " + val4);
            System.out.println("short = " + val5);
            System.out.println("long = " + val6);
            System.out.println("double = " + val7);
            System.out.println("float = " + val8);
            */

        }

        // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – аргументы этого метода, имеющие тип float.

        public static float calculator(float a, float b, float c, float d) {
            return a * (b + (c / d));
        }

        // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false.

        public static boolean from10and20(int a, int b) {
            return 10 >= a + b && a + b <= 20;
        }


        // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        public static void isPositiveOrNegative(int x) {
            if (x > 0) { // c оператором if есть трудности - прошу более подробно рассказать если будет возможность или указать коменты.. :(
                System.out.println("Значение положительное в заднии №5 число = " + x);
            } else {
                System.out.println("Значение отрицательное в заднии №5 число = " + x);
            }
        }

        // 6. Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

        public static boolean isNegative(int y) { // прошу указать правильно ли выполненно задание двумя варианты через if и return ?!
            if (y < 5) {
                System.out.println("Значение положительное в задании №6 число = " + y);
                return false;
            }else{
                System.out.println("Значение отрицательное в задании №6 число = " + y);
            }
            {return true;}
        }

        // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        public static void greetings(String name){
            System.out.println("Привет, " + name + " это задание № 7");
        }
        // 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        public static void year(int g){
            if(g%4==0 && g%100 !=0 || g%400==0) {
                System.out.println("Год " + g + " является високосным");
            }else{
                System.out.println("Год " + g + " является не високосным");
            }
            System.out.println("Спасибо за задние ушло: 4 часа");
        }
}
