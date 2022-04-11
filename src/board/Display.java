package board;

import cards.Card;

import java.util.ArrayList;

public class Display implements Displayable {
    private static ArrayList<Card> displayList;

    public void add(Card card) {
        displayList.add(card);
    }


    public int size() {

        return displayList.size();
    }

    public Card getElementAt(int index) {

        return displayList.get(index);
    }

    public Card removeElement(int index) {
        return displayList.remove(index);
    }
}
