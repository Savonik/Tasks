package jc01_2020.Savonik.test02;

/*
 *
 * 1) Десериализовать из файла secret.dat объект одной из реализаций интерфейса Employee.
 * 2) Установить значение поля Department в соответствии с реальной профессией (реализовать в классе Department
 * статический метод, который вернет значение перечисления).
 * 3) Установить endDate сегодняшним числом.
 * 4) Установить в поле workPeriod общее время работы в днях ( [startDate, endDate) )
 * 5) В стриме для каждой награды изменить ее имя в соответствии с шаблоном: "дата - имя". Дата в формате дд-мм-гггг
 * 6) В том же стриме отсортировать все награды в прямом хронологическом порядке. Сохранить их в объект
 * 7) Реализовать в интерфейсе Employee метод по умолчанию print(), чтобы вывести значения всех полей (в том числе
 * коллекций) в любом удобно читаемом виде
 * 8) Сохранить в файл resource/result.txt результат выполнения метода employee.print()
 *
 * Работать только через интерфейс Employee
 *
 * Обработать возможные ошибки таким образом, чтобы в консоль записывался текст ошибки и после этого был выброшен
 * RuntimeException.
 *
 */

import jc01_2020.Savonik.lesson14.task03.Man;
import jc01_2020.test02.Employee;
import jc01_2020.test02.Helper;
import jc01_2020.test02.Reward;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    // Изменить на реальный путь после копирования файлов
    public static final String PATH_FROM = "src/jc01_2020/test02/resource/secret.dat";
    public static final String PATH_TO = "src/jc01_2020/test02/resource/result.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = Helper.getEmployee();
        employee.setEndDate(LocalDate.now());
        int i = Period.between(employee.getStartDate(), employee.getEndDate()).getDays();
        employee.setWorkPeriod(i);

       List <Reward> list = Helper.getRewards();
        list.forEach(reward-> reward.setName(reward.getDate().toString()+reward.getName()));
        
        
        }
        
        
    public static Employee getEmployee() {
        return null;
    }

}
