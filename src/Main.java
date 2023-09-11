public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа № 2");
        Vector vector1 = new Vector(3);
        vector1.setElement(0, 7);
        vector1.setElement(1, 3);
        vector1.setElement(2, 12);
        System.out.println("Вывод вектора 1");
        vector1.print();
        System.out.println("Мин. элемент: " + vector1.getMinValue());
        System.out.println("Макс. элемент: " + vector1.getMaxValue());
        System.out.println("Сортировка по убыванию");
        vector1.sortDescending();
        vector1.print();
        System.out.println("Сортировка по возрастанию");
        vector1.sortAscending();
        vector1.print();
        System.out.println("Умножение на число");
        vector1.multiplyByScalar(2.0);
        vector1.print();
        Vector vector2 = new Vector(3);
        vector2.setElement(0, 1);
        vector2.setElement(1, 2);
        vector2.setElement(2, 3);
        System.out.println("Вывод вектора 2");
        vector2.print();
        System.out.println("Cложение двух векторов");
        Vector.add(vector1, vector2).print();
        System.out.println("Cкалярное произведение двух векторов " + Vector.scalarProiz(vector1, vector2));
    }
}