package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.*/

public class Solution {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
            String s;

            while (true)
            {
                s = reader.readLine();
                writer.write(s);
                writer.newLine();
                if(s.equals("exit")){
                    break;
                }
            }
            writer.close();
            reader.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
