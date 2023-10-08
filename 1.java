package com.journaldev.design.model;

public abstract class Computer {

    //получения объема RAM
    public abstract String getRAM();

    //получения объема HDD
    public abstract String getHDD();

    //получения информации о CPU
    public abstract String getCPU();

    //метод toString для вывода информации о компьютере
    @Override
    public String toString() {
        //информации о RAM, HDD и CPU
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
