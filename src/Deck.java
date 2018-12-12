import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;
    public Deck (String [] rank, String[] suits, int[] pointValue)
    {
        unDealt = new ArrayList<Card>();
        Dealt = new ArrayList<Card>();
        ArrayList<Card> deck = new ArrayList<Card>();
        for(int i = 0; i < rank.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                Card newCard = new Card(rank[j],suits[i],pointValue[j]);
                unDealt.add(newCard);
            }
        }
    }
    public boolean isEmpty()
    {
        if (unDealt.size()<= 0)
        {
            return true;
        }
        return false;
    }
    public int size()
    {
        return unDealt.size();
    }

    public String deal()
    {
        if( unDealt.size() <= 0)
        {
            return null;
        }

    }
}
