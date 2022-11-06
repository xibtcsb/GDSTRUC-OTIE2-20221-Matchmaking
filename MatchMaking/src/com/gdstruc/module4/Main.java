package com.gdstruc.module4;
import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        int queueNumber = 0;
        int queuePlayers = 0;
        int games = 1;

        ArrayQueue players = new ArrayQueue(50);
        ArrayQueue queue = new ArrayQueue(50);
        ArrayQueue game = new ArrayQueue(5);

        players.add(new Player("N1NJA"));
        players.add(new Player("GOTHje"));
        players.add(new Player("jremy"));
        players.add(new Player("xuxi"));
        players.add(new Player("GianSanity"));
        players.add(new Player("invy"));
        players.add(new Player("Dinklefarts"));
        players.add(new Player("ABATMAN"));
        players.add(new Player("defy"));
        players.add(new Player("kurtesyy"));
        players.add(new Player("SuperMJ"));
        players.add(new Player("SKrossi"));
        players.add(new Player("gadoerzz"));
        players.add(new Player("Skywallerrr"));
        players.add(new Player("eugeneS"));
        players.add(new Player("night fury"));
        players.add(new Player("Dos"));
        players.add(new Player("vii"));
        players.add(new Player("ehlitPOGS"));
        players.add(new Player("Pocar1"));
        players.add(new Player("Realist"));
        players.add(new Player("lemulenade"));
        players.add(new Player("fatorikku"));
        players.add(new Player("guelson"));
        players.add(new Player("ushio"));
        players.add(new Player("bRIKKAE"));
        players.add(new Player("exequies"));
        players.add(new Player("kristeena"));
        players.add(new Player("PRX f0rsaken"));
        players.add(new Player("aceu"));
        players.add(new Player("ent1ty"));
        players.add(new Player("PRX jinggg"));
        players.add(new Player("marved"));
        players.add(new Player("anarzelle"));
        players.add(new Player("Xavi8k"));
        players.add(new Player("sinatraa"));
        players.add(new Player("rabbet"));
        players.add(new Player("nobi"));
        players.add(new Player("TenZ"));
        players.add(new Player("ripper"));
        players.add(new Player("Version"));
        players.add(new Player("Xhiv"));
        players.add(new Player("MitsuhaV"));
        players.add(new Player("LC makix"));
        players.add(new Player("Zeijou"));
        players.add(new Player("alti"));
        players.add(new Player("snag"));
        players.add(new Player("Tarik"));
        players.add(new Player("woscypoo"));
        players.add(new Player("rammyb"));

        int min = 1;
        int max = 7;

        while (games <= 10) {

            int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);

            if (rand > players.size()) {
                rand = players.size();
            }
            System.out.print("In Queue: ");

            if (rand <= 7 && players.size() != 0) {
                for (int i = 0; i < rand; i++) {
                    queue.add(players.remove());
                    queueNumber++;
                }
                System.out.println(queueNumber + " players \n");
                queue.printQueue();
                System.out.print("\n");
            }

            System.out.print("Press 'ENTER' to play PVE");
            try {
                System.in.read();
            } catch (Exception e) {
            }

            System.out.println("\n");

            while (queueNumber >= 5) {
                for(int i = 0; i < 5; i++) {
                    game.add(queue.remove());
                    queueNumber--;
                    queuePlayers++;
                }
                System.out.println("Match in progress: " + queuePlayers + " players \n " + games++ + " game/s");
                game.printQueue();
                System.out.print("\n");
            }
        }
        System.out.println("SERVER OVERLOAD! CRASHING...");
    }
}