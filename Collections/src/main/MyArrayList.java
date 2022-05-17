package main;

public class MyArrayList {
    private String[] array = new String[10]; //изначальный размер массива
    private int size = 0; //переменная, которая хранит в себе кол-во элементов

    public void add(String s) { //метод, принимающий параметр типа String
        array[size] = s; //берем строку и добавляем в нее массив с индексом size
        size++; //в массиве появляется новый элемент, поэтому увеличиваем size на 1
        if (size == array.length) { //проверяем, не стала ли size равна длине массива. Если стала, увеличиваем длину массива вдвое
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) { // копируем все элементы из первого массива во второй
                newArray[i] = array[i];
            }
            array = newArray; //переменной array присваеваем значения нового массива
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) { //Проверяем, чтобы введенное число было правильным
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String s){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (s.equals(array[i])){
                index = i;
                break;
            }
        }
        if (index != -1){
            remove(index);
        }
    }

    public int getSize() { //геттер, чтобы знать кол-во элементов в массиве
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "Элемент не найден";
        }
    }
}