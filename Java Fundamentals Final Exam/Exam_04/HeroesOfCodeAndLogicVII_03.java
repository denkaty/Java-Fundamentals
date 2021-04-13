package Exam_04;

import java.util.*;

public class HeroesOfCodeAndLogicVII_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> heroes = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String hero = tokens[0];
            int HP = Integer.parseInt(tokens[1]);
            int MP = Integer.parseInt(tokens[2]);
            int[] points = new int[]{HP, MP};

            heroes.put(hero, points);

        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];

            if (command.equals("CastSpell")) {
                String hero = tokens[1];
                int neededMP = Integer.parseInt(tokens[2]);
                int currentMP = heroes.get(hero)[1];
                String spell = tokens[3];

                if (currentMP >= neededMP) {
                    heroes.get(hero)[1] -= neededMP;

                    System.out.println(String.format("%s has successfully cast %s and now has %d MP!",
                            hero, spell, heroes.get(hero)[1]));
                } else {
                    System.out.println(String.format("%s does not have enough MP to cast %s!",
                            hero, spell));
                }
            } else if (command.equals("TakeDamage")) {
                String hero = tokens[1];
                int tookDamage = Integer.parseInt(tokens[2]);
                int currentHP = heroes.get(hero)[0];
                String attacker = tokens[3];

                if (currentHP - tookDamage > 0) {

                    heroes.get(hero)[0] -= tookDamage;

                    System.out.println(String.format("%s was hit for %d HP by %s and now has %d HP left!",
                            hero, tookDamage, attacker, heroes.get(hero)[0]));
                } else {
                    heroes.remove(hero);
                    System.out.println(String.format("%s has been killed by %s!",
                            hero, attacker));
                }
            } else if (command.equals("Recharge")) {
                String hero = tokens[1];
                int increaseMP = Integer.parseInt(tokens[2]);
                int currentMP = heroes.get(hero)[1];
                int sumMP = increaseMP + currentMP;

                if (sumMP > 200) {
                    increaseMP = 200 - currentMP;
                }
                heroes.get(hero)[1] += increaseMP;

                System.out.println(String.format("%s recharged for %d MP!",
                        hero, increaseMP));


            } else if (command.equals("Heal")) {
                String hero = tokens[1];
                int increaseHP = Integer.parseInt(tokens[2]);
                int currentHP = heroes.get(hero)[0];
                int sumHP = increaseHP + currentHP;

                if (sumHP > 100) {
                    increaseHP = 100 - currentHP;
                }
                heroes.get(hero)[0] += increaseHP;

                System.out.println(String.format("%s healed for %d HP!",
                        hero, increaseHP));

            }
            input = scanner.nextLine();
        }
        heroes.entrySet()
                .stream()
                .sorted((f, s) -> {
                    int res = s.getValue()[0] - f.getValue()[0];
                    if (res == 0) {
                        res = f.getKey().compareTo(s.getKey());
                    }
                    return res;
                })
                .forEach(hero -> {
                    System.out.println(hero.getKey());
                    System.out.printf(" HP: %d%n", hero.getValue()[0]);
                    System.out.printf(" MP: %d%n", hero.getValue()[1]);
                });

    }
}
