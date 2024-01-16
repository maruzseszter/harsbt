package lan.zold;

import hu.szit.Client;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Client client = new Client();
        String url = "http://localhost:3 000/employees";
        String result = client.get(url);
        System.out.println(result);
    }
}