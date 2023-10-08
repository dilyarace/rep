package com.journaldev.design.factory;
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

// Фабричный класс для создания объектов Computer
public class ComputerFactory {

    // Статический метод getComputer, который создает объекты PC или Server в зависимости от типа
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            // Если тип - PC, создаем объект PC и возвращаем его
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            // Если тип - Server, создаем объект Server и возвращаем его
            return new Server(ram, hdd, cpu);
        }

        // Если тип не соответствует ни PC, ни Server, возвращаем null
        return null;
    }
}
