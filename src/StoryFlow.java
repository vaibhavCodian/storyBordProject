public class StoryFlow {

    Card[] cards = new Card[11];

    Option[] options;
    static boolean blueGoo = false;
    static boolean sword = false;

    StoryFlow(){
//      1
        options = new Option[3];
        options[1] = new Option("Take the goo", 2, true);
        options[2] = new Option("Do not take the goo", 2, false);
        cards[1] = new Card(
                "You wake up in a strange place and you see a jar of blue goo near you.",
                options
        );
//      2
        options = new Option[3];
        options[1] = new Option("Trade the goo for a sword", 2, true, true);
        options[2] = new Option("Do not take the goo", 2, false);
        cards[2] = new Card(
                "You venture forth in search of answers to where you are when you come across a merchant.",
                options
        );

//      3
        options = new Option[3];
        options[1] = new Option("Trade the goo for a sword", 2, true, true);
        options[2] = new Option("Do not take the goo", 2, false);
        cards[3] = new Card(
                "You venture forth in search of answers to where you are when you come across a merchant.",
                options
        );

//      4
        options = new Option[3];
        options[1] = new Option("Trade the goo for a sword", 2, true, true);
        options[2] = new Option("Do not take the goo", 2, false);
        cards[4] = new Card(
                "You venture forth in search of answers to where you are when you come across a merchant.",
                options
        );

//      5
        options = new Option[3];
        options[1] = new Option("Trade the goo for a sword", 2, true, true);
        options[2] = new Option("Do not take the goo", 2, false);
        cards[5] = new Card(
                "You venture forth in search of answers to where you are when you come across a merchant.",
                options
        );
//      6
        options = new Option[3];
        options[1] = new Option("Trade the goo for a sword", 2, true, true);
        options[2] = new Option("Do not take the goo", 2, false);
        cards[6] = new Card(
                "You venture forth in search of answers to where you are when you come across a merchant.",
                options
        );

    }

    public Card[] getCards() {
        return cards;
    }

    public Card getCardByPage(int page){
        return cards[page];
    }


}
