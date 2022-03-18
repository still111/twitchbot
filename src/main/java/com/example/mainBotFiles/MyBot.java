package com.example.mainBotFiles;


import com.example.commands.output;
import org.jibble.pircbot.PircBot;

public class MyBot extends PircBot {


    public MyBot() {
        this.setName("MyBot");
    }



    public void onMessage(String channel, String sender, String login, String hostname, String message) {
        output b2;

        if ((sender.equalsIgnoreCase("shkurodyor42") ||
                sender.equalsIgnoreCase("zzztantrikazzz"))
                && message.startsWith("!check @") && channel.equalsIgnoreCase("#zzztantrikazzz") ) {
            b2 = new output(message, sender);
            this.sendMessage(channel, b2.BibaMetr());
        }

        if (message.startsWith("!balance")
             //   && channel.equalsIgnoreCase("#zzztantrikazzz")
        ) {
            b2 = new output(message, sender);
            this.sendMessage(channel, b2.Balance());
        }

        if (message.startsWith("!song")
             //   && channel.equalsIgnoreCase("#zzztantrikazzz")
        ) {
            b2 = new output(message, sender);
            this.sendMessage(channel, b2.song());
        }

        if (message.startsWith("!belka")&& channel.equalsIgnoreCase("#zzztantrikazzz") ) {
            b2 = new output(message, sender);
            this.sendMessage(channel, b2.belka());
        }

        if (message.startsWith("!зелёныетаблетки")&& channel.equalsIgnoreCase("#zzztantrikazzz") ) {
            b2 = new output(message, sender);
            this.sendMessage(channel, b2.tabli());
        }

    }
}


