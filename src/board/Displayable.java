package board;

import cards.Card;

public interface Displayable {
    public void add(Card card);

    public int size();

    public Card getElementAt(int number);

    public Card removeElement(int number);

}
