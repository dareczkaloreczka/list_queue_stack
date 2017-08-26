package com.mojafirma.list;

public class List {

    private ListElement first = null;
    private ListElement last = null;

    public void addToList(int value) {
        ListElement item = new ListElement(value);
        if (first == null) {
            first = item;
        }
        if (last != null) {
            last.setNext(item);
            item.setPrev(last);
        }
        last = item;
    }

    public void removeFirst() {
        if (first != null) {
            first = first.getNext();
        }
    }

    public void removeLast() {
        if (last != null) {
            last = last.getPrev();
        }
    }

    public void removeByValue(int value) {

        ListElement temp = first;
        if (temp != null) {
            while (value != temp.getValue()) {
                temp = temp.getNext();
            }
            if (temp.getPrev() != null) {
                temp.getPrev().setNext(temp.getNext());
            } else {
                first = temp.getNext();
                first.setPrev(null);
            }
            if (temp.getNext() != null) {
                if (temp.getPrev() != null) {
                    temp.getNext().setPrev(temp.getPrev());
                }
                } else {
                last = temp.getPrev();
                last.setNext(null);
            }
            }
        }

    public void printList() {
        ListElement temp = first;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }
    public void revPrintList() {
        ListElement temp = last;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getPrev();
        }
    }



}
