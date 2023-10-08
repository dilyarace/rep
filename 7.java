package com.journaldev.design.test;
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

// Класс для тестирования фабрики ComputerFactory
public class TestFactory {
    public static void main(String[] args) {
        // Создаем компьютеры с помощью ComputerFactory
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        // Выводим конфигурацию созданных компьютеров
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
