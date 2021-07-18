import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming_03_MyEditio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s"))
                .collect(Collectors.toList());


        Map<String, Integer> materials = new LinkedHashMap<>();
        Map<String,Integer> junks = new TreeMap<>();
        for (int i = 0; i < input.size(); i++) {

            int quantity = Integer.parseInt(input.get(i));
            String material = input.get(i + 1).toLowerCase();

            if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                if (!materials.containsKey(material)) {
                    materials.put(material, quantity);
                } else {
                    Integer currentCuantity = materials.get(material);
                    currentCuantity += quantity;

                    materials.put(material, currentCuantity);
                }

                if (materials.get(material) >= 250) {

                    if (material.equals("shards")) {
                        System.out.printf("%s obtained!%n", "Shadowmourne");
                    } else if (material.equals("fragments")) {
                        System.out.printf("%s obtained!%n", "Valanyr");
                    } else if (material.equals("motes")) {
                        System.out.printf("%s obtained!%n", "Dragonwrath");
                    }
                    Integer remainingQuantity = materials.get(material) - 250;
                    materials.put(material, remainingQuantity);

                    break;
                }
            }
            else {
                if (!junks.containsKey(material)){
                    junks.put(material,quantity);
                }
                else {
                    Integer currentJunkCuantity = junks.get(material);
                    currentJunkCuantity+=quantity;

                    junks.put(material,currentJunkCuantity);
                }
            }

            i++;
        }

        if (!materials.containsKey("shards")) {
            materials.put("shards", 0);
        }
        if (!materials.containsKey("fragments")) {
            materials.put("fragments", 0);
        }
        if (!materials.containsKey("motes")) {
            materials.put("motes", 0);
        }


        List<Map.Entry<String, Integer>> entryList = materials
                .entrySet()
                .stream()
                .sorted((n1, n2) -> {

                    if (n2.getValue() != n1.getValue()) {
                        return n2.getValue().compareTo(n1.getValue());
                    } else {
                        return n1.getKey().compareTo(n2.getKey());
                    }
                })
                .collect(Collectors.toList());

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junks.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }


    }
}