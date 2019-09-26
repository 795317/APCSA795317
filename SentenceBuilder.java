
/**
 * Class SentenceBuilder
 *
 * @author (Nikhitha Nair)
 * @version (921)
 */
public class SentenceBuilder
{
    String determinerList[] = {"the", "a", "he", "she","this", "that", "their", "my","your"};
    String adjectiveList [] = {"pretty", "little", "amazing", "hard", "soft", "fluffy", "glowing"};
    String nounsList [] = {"dog", "cat", "boy", "girl", "ball", "Earth", "frog", "candy"};
    
    public SentenceBuilder()
    {

    }

    public void loadSentences()
    {
    }
    
    public String getNounPhrase()
    {
        String noun = nounsList[1];
        String adjective = adjectiveList[1];
        String determiner = determinerList[1];
        String nounPhrase = determiner + " " + adjective + " " + noun;
        return nounPhrase;
    }
    
}

