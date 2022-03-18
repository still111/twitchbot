package com.example.commands;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class output {
    private final int n1 = (int)(Math.random() * 200.0D);
    private final int n2 = (int)(Math.random() * 50.0D);
    private final int n3 = (int)(Math.random() * 100.0D);
    private final String message;
    private final String sender;

    public output(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }

    public String BibaMetr() {
        String mes = this.message.replaceAll("!check @", "");
        return String.format(
                "/me "+mes + " имеет %d айку, бибу %d сантиметров и остроумен" +
                        " на %d петросянов из 100", this.n1, this.n2, this.n3);
    }

    public String Balance() {
        return this.n2 != 50 ? String.format(
                "/me %s твое внутреннее равновесие составляет: %d  иня и %d  яня," +
                        "продолжай смотреть стрим что бы  поправить потоки энергии",
                this.sender, this.n2, 100 - this.n2) :
                String.format(
                        "/me о величайший %s твое внутреннее равновесие составляет: %d  иня и %d  яня," +
                                "теперь тачки, яхты, дачи, тёлки всё твоё",
                        this.sender, this.n2, 100 - this.n2);
    }

    public String dela() throws IOException {
        String filePath = "C:\\Users\\111\\Desktop\\it\\zzzbot\\src\\data\\data";
        Path path = Paths.get(filePath);
        Scanner scn = null;

        try {
            scn = new Scanner(path);
        } catch (IOException var7) {
           var7.printStackTrace();
        }
        int kakDelaMeter
        = scn.nextInt();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filePath);
        } catch (FileNotFoundException var6) {
            var6.printStackTrace();
        }
        String m1 = String.format("%s твой вопрос стал %d в этом месяце", this.sender, ++kakDelaMeter);

        writer.print(kakDelaMeter);
        writer.close();
        return m1;
    }


    public String song() {
        if (sender.equalsIgnoreCase("zzzKarasiKzzz")) return "/me Карасик, иди в жопу!";
        else return "/me - Подождите бот ищет название трека";
    }

    public String belka() {
        return "/me - Можешь банить, я устал от твоих тупорылых угроз, наглухо ебанутая белка";
    }

    public String tabli() {
        return "/me - Я думал тут норм канал, а тут гондоны розовые и ты шлюпка";
    }
}



