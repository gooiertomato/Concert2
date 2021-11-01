package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        Performer dingle = new Performer("dingle","tall, looks like Alwyn");
        dingle.addHit("dingle theme song");
        System.out.println(dingle);

        Performer vault = new Performer("vault","short, blue spikey hair");
        vault.addHit("flight of the whales");
        vault.addHit("west hemisphere orchastra No.26");
        System.out.println(vault);


    }
}


