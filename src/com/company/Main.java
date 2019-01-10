package com.company;

import org.json.JSONObject;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static String input;

    public static void main(String[] args) throws MalformedURLException {
        System.out.println("特定の都道府県の天気予報データをJSONファイルに出力するプログラムです");
        Main.setInput();
        JSONObject data = Main.fetchWeatherData();
        Main.exportResult(data.toString(4));
        System.out.println("完了しました");
    }

    private static void setInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("都道府県名を正しく入力してください 例：石川県");
        System.out.print("＞");
        Main.input = scan.next();
        scan.close();
    }

    // Livedoor Weather Web Service から天気のデータを取得
    private static JSONObject fetchWeatherData() throws MalformedURLException {
        JSONObject weatherData = new JSONObject();

        // URL を指定
        Prefecture pref = new Prefecture(Main.input);
        if (pref.getId() == null) {
            System.out.println("不正な文字が入力されたので終了します");
            System.exit(0);
        }
        final String EntryPoint = "http://weather.livedoor.com/forecast/webservice/json/v1?city=" + pref.getId();
        URL url = new URL(EntryPoint);

        // API を叩く
        try {
            InputStreamReader isr = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(isr);
            String content = "";
            String foo;
            while((foo = br.readLine()) != null){
                content += foo;
            }
            weatherData = new JSONObject(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return weatherData;
    }

    private static void exportResult(String result) {
        try {
            File file = new File("./result.json");
            FileWriter fileWriter = new FileWriter(file);

            // ファイルに書き込み
            fileWriter.write(result);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
