import java.util.*;

public class ForceBook_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> users = new TreeMap<>();
        while (!command.equals("Lumpawaroo")) {
            String[] tokens;
            String operand = "";

            if (command.contains("|")) {
                tokens = command.split("\\s+\\|\\s+");
                operand = "|";
            } else {
                tokens = command.split("\\s+->\\s+");
                operand = "->";
            }

            if (operand.equals("|")) {
                String side = tokens[0];
                String user = tokens[1];

                boolean check = false;

                for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                    if (entry.getValue().contains(user)) {
                        check = true;
                        break;
                    }
                }

                if (!check) {
                    if (!users.containsKey(side)) {
                        List<String> addedUsers = new ArrayList<>();
                        addedUsers.add(user);
                        users.put(side, addedUsers);
                    } else if (users.containsKey(side) && !users.get(side).contains(user)) {
                        List<String> addedUsers = users.get(side);
                        addedUsers.add(user);
                        users.put(side, addedUsers);
                    }
                }

            }   if (operand.equals("->")) {
                String user = tokens[0];
                String side = tokens[1];

                for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                    if (entry.getValue().contains(user)) {
                        users.get(entry.getKey()).remove(user);
                        break;
                    }
                }
                if (!users.containsKey(side)) {
                    List<String> sideUsers = new ArrayList<>();
                    sideUsers.add(user);
                    users.put(side, sideUsers);
                   System.out.printf("%s joins the %s side!%n", user, side);
                } else if (users.containsKey(side) && !users.get(side).contains(user)) {
                    users.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
            }
            command = scanner.nextLine();
        }
        users
                .entrySet()
                .stream()
                .filter(us -> us.getValue().size() > 0)
                .sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(s-> {
                    System.out.printf("Side: %s, Members: %d%n",s.getKey(),s.getValue().size());

                    s.getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(person -> System.out.printf("! %s%n",person));
                });

    }

}