package Lesson4_HW;

public class PhoneBook {
    private Map<String, HashSet<String>> map;
    Phonebook() {
        this.map = new HashMap<>();
    }
    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);
    }
    Set<String> get(String lastName) {
        return map.get(lastName);
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "564654");
        phoneBook.add("Petrov", "165465");
        phoneBook.add("Vodkin", "245516");
        phoneBook.add("Sidorov", "654654");
        phoneBook.add("Ivanov", "546565");

        System.out.println(phoneBook.get("Ivanov"));
    }
}

