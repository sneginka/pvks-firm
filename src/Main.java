/**
 * =======================================================================
 * Основной класс программы должен обязательно включать в себя
 * метод `main`! Если такового нет, класс считается не пригодным
 * для запуска командой `java Main`
 *
 * Обратите внимание на дескриптор метода `main` - он должен выглядеть
 * именно так!
 * =======================================================================
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*** BEGIN ***");
        Calculator calcOne = new Calculator(); // воспользуемся конструктором БЕЗ аргументов
        Calculator calcTwo = new Calculator(100, 50); // воспользуемся конструктором С аргументами
        // новый метод: `System.out.format()` форматирует
        // строку, подобно `printf()` в C
        // где %d будет заменено на значение типа int.
        System.out.println("\n*** Using calculator without arguments: ***");

        // просто выводим результат
        System.out.format("\tSUM: %d + %d = %d;\n", 10, 34, calcOne.sum(10, 34));
        System.out.format("\tDIV: %d / %d = %d;\n", 10, 2, calcOne.divide(10, 2));
        System.out.format("\tMUL: %d * %d = %d;\n", 653, 800, calcOne.multiple(653, 800));
        System.out.format("\tSUB: %d - %d = %d;\n", 10, 34, calcOne.subtract(10, 34));

        System.out.println("*** Using calculator with arguments:    ***");

        System.out.format("\tSUM: %d + %d = %d;\n", calcTwo.getA(), calcTwo.getB(), calcTwo.sum());

        calcTwo.setA(90);
        calcTwo.setB(3);
        System.out.format("\tDIV: %d / %d = %d;\n", calcTwo.getA(), calcTwo.getB(), calcTwo.divide());

        calcTwo.setA(675);
        calcTwo.setB(7854);
        System.out.format("\tMUL: %d * %d = %d;\n", calcTwo.getA(), calcTwo.getB(), calcTwo.multiple());

        calcTwo.setA(12847345);
        calcTwo.setB(767293);
        System.out.format("\tSUB: %d - %d = %d;\n\n", calcTwo.getA(), calcTwo.getB(), calcTwo.subtract());

        System.out.println("*** END ***");
    }
}
