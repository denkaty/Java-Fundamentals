import java.util.*;
import java.util.stream.Collectors;


public class LegendaryFarming_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junks = new TreeMap<>();

        boolean isObtained = false;

        while (!isObtained) {
            List<String> input = Arrays.stream(scanner.nextLine().split("\\s"))
                    .collect(Collectors.toList());

            for (int i = 0; i < input.size() - 1; i = i + 2) {
                int quantity = Integer.parseInt(input.get(i));
                String material = input.get(i + 1).toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int newMaterialQuantities = keyMaterials.get(material) + quantity;
                    keyMaterials.put(material, newMaterialQuantities);

                    if (keyMaterials.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.printf("%s obtained!%n", "Shadowmourne");
                        } else if (material.equals("fragments")) {
                            System.out.printf("%s obtained!%n", "Valanyr");
                        } else {
                            System.out.printf("%s obtained!%n", "Dragonwrath");
                        }

                        int remainingQuantities = keyMaterials.get(material) - 250;
                        keyMaterials.put(material, remainingQuantities);
                        isObtained = true;
                        break;
                    }
                } else {
                    junks.putIfAbsent(material, 0);
                    int newJunkQuantities = junks.get(material) + quantity;
                    junks.put(material, newJunkQuantities);
                }
            }
        }

        keyMaterials
                .entrySet()
                .stream()
                .sorted((n1, n2) -> {

                    if (!n2.getValue().equals(n1.getValue())) {
                        return n2.getValue().compareTo(n1.getValue());
                    } else {
                        return n1.getKey().compareTo(n2.getKey());
                    }
                })
                .forEach(k -> System.out.println(String.format("%s: %d", k.getKey(), k.getValue())));

        junks
                .forEach((k, v) -> System.out.println(String.format("%s: %d", k, v)));


    }
}