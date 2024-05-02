package com.company;

public class ThreadMinElem extends Thread {
    private final int startIndex;
    private final int finishIndex;
    private final ArrayClass arrClass;

    public ThreadMinElem(int startIndex, int finishIndex, ArrayClass arrClass) {
        this.startIndex = startIndex;
        this.finishIndex = finishIndex;
        this.arrClass = arrClass;
    }

    @Override
    public void run() {
        long min = arrClass.OneThreadMin(startIndex, finishIndex);//Знаходимо мінімальний елемент в межах start i finish
        arrClass.collectMin(min); // Передаємо мінімальне для запису
        arrClass.incThreadCount();//Отмічаєм, що поток завершено
    }
}
