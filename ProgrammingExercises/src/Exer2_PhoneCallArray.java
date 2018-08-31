public class Exer2_PhoneCallArray {

    public static void main(String[] args)
    {
        Exer2_PhoneCall calls[] = new Exer2_PhoneCall [10];
        int i;
        calls[0] = new Exer2_IncomingPhoneCall("345-094-8372");
        calls[1] = new Exer2_OutgoingPhoneCall("644-564-8572", 4);
        calls[2] = new Exer2_IncomingPhoneCall("343-194-3372");
        calls[3] = new Exer2_OutgoingPhoneCall("655-999-6372", 10);
        calls[4] = new Exer2_IncomingPhoneCall("545-065-2362");
        calls[5] = new Exer2_OutgoingPhoneCall("655-999-6372", 30);
        calls[6] = new Exer2_IncomingPhoneCall("125-345-4857");
        calls[7] = new Exer2_OutgoingPhoneCall("235-955-1371", 3);
        calls[8] = new Exer2_IncomingPhoneCall("644-564-8572");
        calls[9] = new Exer2_OutgoingPhoneCall("920-787-8919", 5);
        for(i = 0; i < calls.length; ++i)
            calls[i].getInfo();
    }
}