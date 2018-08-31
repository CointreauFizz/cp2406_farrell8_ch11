public class Exer2_DemoPhoneCalls {

    public static void main(String[] args)
    {
        Exer2_IncomingPhoneCall inCall = new Exer2_IncomingPhoneCall("212-555-3096");
        Exer2_OutgoingPhoneCall outCall = new Exer2_OutgoingPhoneCall("312-874-0232", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}
