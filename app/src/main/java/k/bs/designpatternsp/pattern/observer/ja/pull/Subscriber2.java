package k.bs.designpatternsp.pattern.observer.ja.pull;

public class Subscriber2 implements Observer {
    private String content;
    private Subject subject;

    public Subscriber2(Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    public void pullContent() {
        System.out.println("Pull Contents is");
        subject.notifyObserver(this);
    }

    @Override
    public void update(String content) {
        this.content = content;
        display();
    }


    private void display() {
        System.out.println("subscriber 2");
        System.out.println("content : " + content);
        System.out.println("\n");
    }

}