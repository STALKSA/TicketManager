
package TicketManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {

    @Test
    public void testSort(){
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "London", "Amsterdam", 200, 2);
        Ticket ticket2 = new Ticket(2, "New-York", "Oslo", 500, 12);
        Ticket ticket3 = new Ticket(3, "New-York", "Oslo", 350, 12);
        Ticket ticket4 = new Ticket(4, "Moscow", "Dubai", 300, 2);
        Ticket ticket5 = new Ticket(5, "New-York", "Los Angeles", 200, 1);
        Ticket ticket6 = new Ticket(6, "New-York", "Oslo", 250, 12);
        Ticket ticket7 = new Ticket(7, "Moscow", "SPB", 50, 1);
        Ticket ticket8 = new Ticket(8, "Berlin", "Paris", 200, 1);
        Ticket ticket9 = new Ticket(9, "New-York", "Oslo", 350, 12);
        Ticket ticket10 = new Ticket(10, "Moscow", "Amsterdam", 500, 3);
        Ticket ticket11 = new Ticket(11, "Moscow", "Novosibirsk", 400, 9);
        Ticket ticket12 = new Ticket(12, "New-York", "Oslo", 400, 12);
        Ticket ticket13 = new Ticket(13, "New-York", "Oslo", 650, 12);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        manager.add(ticket13);

        Ticket[] actual = manager.findAll("New-York", "Oslo");
        Ticket[] expected = {ticket6, ticket3, ticket9, ticket12, ticket2, ticket13};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortIfFindJustOne(){
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "London", "Amsterdam", 200, 2);
        Ticket ticket2 = new Ticket(2, "New-York", "Oslo", 500, 12);
        Ticket ticket3 = new Ticket(3, "Moscow", "Dubai", 300, 2);
        Ticket ticket4 = new Ticket(4, "New-York", "Los Angeles", 200, 1);
        Ticket ticket5 = new Ticket(5, "Moscow", "SPB", 50, 1);
        Ticket ticket6 = new Ticket(6, "Berlin", "Paris", 200, 1);
        Ticket ticket7 = new Ticket(7, "Moscow", "Amsterdam", 500, 3);
        Ticket ticket8 = new Ticket(8, "Moscow", "Novosibirsk", 400, 9);
        Ticket ticket9 = new Ticket(9, "New-York", "Oslo", 400, 12);
        Ticket ticket10 = new Ticket(10, "New-York", "Oslo", 350, 12);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.findAll("Moscow", "Amsterdam");
        Ticket[] expected = {ticket7};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortIfNoFind(){
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "London", "Amsterdam", 200, 2);
        Ticket ticket2 = new Ticket(2, "New-York", "Oslo", 500, 12);
        Ticket ticket3 = new Ticket(3, "Moscow", "Dubai", 300, 2);
        Ticket ticket4 = new Ticket(4, "New-York", "Los Angeles", 200, 1);
        Ticket ticket5 = new Ticket(5, "Moscow", "SPB", 50, 1);
        Ticket ticket6 = new Ticket(6, "Berlin", "Paris", 200, 1);
        Ticket ticket7 = new Ticket(7, "Moscow", "Amsterdam", 500, 3);
        Ticket ticket8 = new Ticket(8, "Moscow", "Novosibirsk", 400, 9);
        Ticket ticket9 = new Ticket(9, "New-York", "Oslo", 400, 12);
        Ticket ticket10 = new Ticket(10, "New-York", "Oslo", 350, 12);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.findAll("Moscow", "Berlin");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

}
