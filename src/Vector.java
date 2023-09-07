public class Vector {
    private double[] elements;

    //Конструктор с длиной вектора
    public Vector(int length) {

        elements = new double[length];
    }
    //Получение элемента по индексу
    public double getElement(int index) {
        return elements[index];
    }
    //Изменение элемента по индексу
    public void setElement(int index, double value) {
        elements[index] = value;
    }
    // Получение длины вектора
    public int getLength() {
        return elements.length;
    }
    // Поиск минимального элемента
    public double getMinValue() {
        double minValue = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < minValue) {
                minValue = elements[i];
            }
        }
        return minValue;
    }
    // Поиск максимального элемента
    public double getMaxValue() {
        double maxValue = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > maxValue) {
                maxValue = elements[i];
            }
        }
        return maxValue;
    }
    //Сортировка по возрастанию
    public void sortAscending() {
        //сортировка вставкой
        for (int left = 0; left < elements.length; left++) {
            // Вытаскиваем значение элемента
            int value = (int) getElement(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < elements[i]) {
                    elements[i + 1] = elements[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            elements[i + 1] = value;
        }
    }
    public void Print()
    {
        for (int i = 0; i < elements.length; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    //Сортировка по убыванию
    public void sortDescending() {
        //сортировка вставкой
        for (int left = 0; left < elements.length; left++) {
            // Вытаскиваем значение элемента
            int value = (int) getElement(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value > elements[i]) {
                    elements[i + 1] = elements[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            elements[i + 1] = value;
        }
    }
    public double getEuclideanNorm() {
        double sum = 0;
        for (double element : elements) {
            sum += element * element;
        }
        return Math.sqrt(sum);
    }
    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] *= scalar;
        }
    }

    public static Vector add(Vector vector1, Vector vector2) {
        if (vector1.getLength() != vector2.getLength()) {
            throw new IllegalArgumentException("Векторы разных длин");
        }

        Vector result = new Vector(vector1.getLength());
        for (int i = 0; i < vector1.getLength(); i++) {
            result.setElement(i, vector1.getElement(i) + vector2.getElement(i));
        }
        return result;
    }

    public static double dotProduct(Vector vector1, Vector vector2) {
        if (vector1.getLength() != vector2.getLength()) {
            throw new IllegalArgumentException("Векторы разных длин");
        }

        double dotProduct = 0;
        for (int i = 0; i < vector1.getLength(); i++) {
            dotProduct += vector1.getElement(i) * vector2.getElement(i);
        }
        return dotProduct;
    }
}
