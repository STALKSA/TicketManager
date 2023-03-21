
package TicketManager;
public class Ticket implements Comparable<Ticket>{
    private int id;
    private String from;
    private String to;
    private int price;
    private int duration;

    public Ticket(int id, String from, String to, int price, int duration) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.duration = duration;
    }

    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Ticket o) {
        return price - o.getPrice();
    }
}
