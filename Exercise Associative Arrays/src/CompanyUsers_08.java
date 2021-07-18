import java.util.*;

public class CompanyUsers_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //: "{companyName} -> {employeeId}"

        String command = scanner.nextLine();

        Map<String, List<String>> companies = new TreeMap<>();

        while (!command.equals("End")) {
            String[] tokens = command.split(" -> ");
            String companyName = tokens[0];
            String employeeId = tokens[1];

            if (!companies.containsKey(companyName)) {
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                companies.put(companyName, employees);
            } else {
                List<String> employees = companies.get(companyName);
                if (!employees.contains(employeeId)) {
                    employees.add(employeeId);
                }
            }

            command = scanner.nextLine();
        }
        companies
                .entrySet()
                .stream()
                .forEach(company -> {
                    System.out.println(String.format("%s", company.getKey()));
                    for (String employeeId : company.getValue()) {
                        System.out.println(String.format("-- %s", employeeId));
                    }

                });
    }
}
