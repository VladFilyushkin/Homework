package OOP;

public class PhoneOOP {
    public static void main(String[] args) {

        Phone iphone = new Phone("+3752943576457", "Iphone 14 Pro", 220);
        Phone samsung = new Phone("+375294374377", "Samsung S20", 212);
        Phone xiaomi = new Phone("+3752934734734", "Xiaomi Redmi 5", 250);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(xiaomi);

        System.out.println(iphone.getPhoneNumber());
        System.out.println(samsung.getPhoneNumber());
        System.out.println(xiaomi.getPhoneNumber());

        iphone.receiveCall("Влад");

        iphone.receiveCall2("Влад", "+375294374347");


        xiaomi.sendMessage("+3752943576457", "+37529435768757", "+37529435676457");








    }

}
