public class Card {
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank , String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public int getpointValue()
    {
        return pointValue;
    }

    public boolean equals(Card otherCard)
    {
        if(otherCard.getpointValue() == this.pointValue)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return(rank +"\n"+suit +"\n" +pointValue  );
    }
}
