 


/**
 * Class SentenceBuilder
 *
 * @author (Nikhitha Nair)
 * @version (920)
 */
public class SentenceBuilder
{
    String determinerList[] = {"the", "a", "he", "she","this", "that", "their", "my","your"};
    String adjectiveList [] = {"pretty", "little", "amazing", "hard", "soft", "fluffy", "glowing"};
    String nounsList [] = {"dog", "cat", "boy", "girl", "ball", "Earth", "frog", "candy"};
    String prepositionList [] = {"of", "towards", "upon", "to", "in", "out", "over", "under"};
    String adverbList[] = {"abnormally", "bashfully", "calmly", "daily", "eagerly", "fairly", "gently"};
    String verbList[] = {"walk", "run", "sing", "dance", "jump", "grab", "draw", "read"};

    public SentenceBuilder()
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
    
    public String getVerbPhrase()
    {
        String adverb = adverbList[1];
        String verb = verbList[1];
        String verbPhrase = adverb + verb;
        return verbPhrase;
    }
    
    public String getPrepositionalPhrase()
    {
       String preposition = prepositionList[1];
       String prepositionalPhrase = getNounPhrase() + " " + preposition; 
       return prepositionalPhrase;
    }
    
    public void loadSentences()
    {
      String sentence = getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionalPhrase();
    }
    
}

