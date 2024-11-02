class Message {
    private String msg ="Hi I am from Testing";
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        empty = true;
        notifyAll();
        return msg;
    }

    public synchronized void write(String msg) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        empty = false;
        this.msg = msg;
        notifyAll();
    }
}

class Writer extends Thread {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
            "First message",
            "Second message",
            "Third message"
        };

        for (String msg : messages) {
            message.write(msg);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        message.write("Done");
    }
}

class InterThreadSync extends Thread {
    private Message message;

    public void Reader(Message message) {
        this.message = message;
    }

    public void run() {
        for (String msg = message.read(); !msg.equals("Done"); msg = message.read()) {
            System.out.println(msg);
        }
    }
}

public class InterThread extends InterThreadSync {
    public static void main(String[] args) {
        Message message = new Message();
        new Writer(message).start();
        InterThreadSync ins= new InterThreadSync(); 
	ins.start();
    }
}
