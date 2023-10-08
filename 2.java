package com.journaldev.design.model;

// Класс PC наследует абстрактный класс Computer
public class PC extends Computer {

    // Приватные поля для хранения информации о RAM, HDD и CPU
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса PC, принимающий значения RAM, HDD и CPU при создании объекта
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Реализация абстрактного метода getRAM() из класса Computer
    @Override
    public String getRAM() {
        return this.ram;
    }

    // Реализация абстрактного метода getHDD() из класса Computer
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // Реализация абстрактного метода getCPU() из класса Computer
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
