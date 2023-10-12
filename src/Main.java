public class Main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        for (int i = 0; i < phones.length; i++) {
            System.out.println();
            phones[0] = createObject("Iphone");
            phones[1] = createObject("Samsung");
            phones[2] = createObject("Xiaomi");
            phones[i].print();
        }
    }

    public static Phone createObject(String className){
        Phone phone = null;
        switch (className){
            case "Iphone":
                phone = new Iphone("15 PRO MAX", 2023, "Black", 15, 64, 1500);
                break;
            case "Samsung":
                phone = new Samsung("Pixel", 2023, "White", 4000, 100, 1433);
                break;
            case "Xiaomi":
                phone = new Xiaomi("Redmi NOTE 12 PRO", 2022, "Dark blue", 25, "AMAZING", 300);
        }
        return phone;
    }
}