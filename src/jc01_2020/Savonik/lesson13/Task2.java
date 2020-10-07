package jc01_2020.Savonik.lesson13;

/*
 *
 * Сгенерировать текущую дату с учетом временной зоны. Вывести в консоль эту дату в исходном виде и для 10 случайных
 * предустановленных временных зон. Каждую с новой строки с указанием временной зоны
 *
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ZonedDateTime nowTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Minsk"));
        System.out.println("nowTime = " + nowTime);
        List<String> zoneIds = new ArrayList<>(ZoneId.getAvailableZoneIds());
        
        for (int i = 0; i < 10; i++) {
            System.out.println(nowTime.withZoneSameInstant(ZoneId.of(zoneIds.get(random.nextInt(zoneIds.size() + 1)))));
        }
    }
}
