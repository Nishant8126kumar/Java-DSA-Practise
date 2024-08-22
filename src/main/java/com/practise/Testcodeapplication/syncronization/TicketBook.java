package com.practise.Testcodeapplication.syncronization;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TicketBook {

    int total_seat = 10;

    public synchronized void bookSeat(int seat) {
        if (total_seat >= seat) {
            total_seat = total_seat - seat;
            log.info("Seat booked :"+total_seat);
        } else {
            log.info("Seat not booked available seat is  :" + total_seat);
        }
    }
}

class TestBook extends Thread {
    static TicketBook ticketBook;
    int seat;

    @Override
    public void run() {
        ticketBook.bookSeat(seat);
    }

    public static void main(String[] args) {

        ticketBook = new TicketBook();
        TestBook testBook1 = new TestBook();
        testBook1.seat = 6;
        testBook1.start();
        TestBook testBook2 = new TestBook();
        testBook2.seat = 5;
        testBook2.start();
    }
}