package OOP;

import java.util.Arrays;

public class Phone {

    private String phoneNumber;
    private String phoneName;
    private double phoneWeight;

    public Phone(String phoneNumber, String phoneName, double phoneWeight) {
        this.phoneNumber = phoneNumber;
        this.phoneName = phoneName;
        this.phoneWeight = phoneWeight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит: " + callerName + "\n" + "Номер: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Номера телефонов на которые будет выслана смс: " + Arrays.toString(phoneNumbers));
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setPhoneWeight(double phoneWeight) {
        this.phoneWeight = phoneWeight;
    }

    @Override
    public String toString() {
        return "Номер телефона: " + phoneNumber +
                ", Название телефона: " + phoneName +
                ", Вес телефона: " + phoneWeight;

    }

}