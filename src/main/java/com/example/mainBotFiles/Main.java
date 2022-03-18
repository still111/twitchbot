package com.example.mainBotFiles;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("ник бота: zzztanrobotzzz ,  пароль: tanrobotяяяtanrobot ключ: oauth:z36ryvqcpyvwebw06tgsrdl1fg1oo5 ");
        MyBot bot = new MyBot();
        bot.setVerbose(true);
        bot.connect("irc.twitch.tv", 6667, "oauth:ie08trhanw6dcmsuxuz82hkfkrzfag");
        bot.joinChannel("#shkurodyor");
       // bot.joinChannel("#zzztantrikazzz");
    }
}