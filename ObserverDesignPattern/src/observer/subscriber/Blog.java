package observer.subscriber;

public class Blog {
    public static void main(String[] args){

        Channel indiaTimes = new Channel();

        Subscriber s1 = new Subscriber("Nikhil");
        Subscriber s2 = new Subscriber("Nandan");
        Subscriber s3 = new Subscriber("Anudeep");
        Subscriber s4 = new Subscriber("Naveen");

        indiaTimes.subscribe(s1);
        indiaTimes.subscribe(s2);
        indiaTimes.subscribe(s3);
        indiaTimes.subscribe(s4);

        s1.subscribeChannel(indiaTimes);
        s2.subscribeChannel(indiaTimes);
        s3.subscribeChannel(indiaTimes);
        s4.subscribeChannel(indiaTimes);

        indiaTimes.unSubscribe(s3);

        indiaTimes.upload("Today's 24hrs world news");

    }
}

