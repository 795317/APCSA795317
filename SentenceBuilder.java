
/**
 * Class SentenceBuilder
 *
 * @author (Nikhitha Nair)
 * @version (921)
 */
import java.util.Random;
  
public class SentenceBuilder
{
    
    String determinerList[] = {"the", "a", "he", "she","this", "that", "their", "my","your"};
    String adjectiveList [] = {"pretty", "little", "amazing", "hard", "soft", "fluffy", "glowing"};
    String nounsList [] = {"dog", "cat", "boy", "girl", "ball", "Earth", "frog", "candy"};
    String verbsList [] = {"run", "talk", "fly", "throw", "jump", "laugh", "frown"};
    String adverbsList [] = {"adoringly", "brutally", "cowardly", "daily", "carefully", "extremely", "gleefully"};
    String prepositonalList [] = {"above", "on", "under", "over", "along", "beside", "against", "before", "after"};
    
    public SentenceBuilder()
    {

    }
    
    public String getRandomNoun()
    {
     Random random = new Random();
     int selectNoun = random.nextInt(nounsList.length);
     return nounsList[selectNoun];
    }
    
    public String getRandomVerb()
    {
     Random random = new Random();
     int selectVerb = random.nextInt(verbsList.length);
     return verbsList[selectVerb];
    }
    
    public String getRandomAdverb()
    {
     Random random = new Random();
     int selectAdverb = random.nextInt(adverbsList.length);
     return adverbsList[selectAdverb];
    }
    
    public String getRandomPrepositonal()
    {
        Random random = new Random();
        int selectPrepositional = random.nextInt(prepositonalList.length);
        return prepositonalList[selectPrepositional];
    }
    
    public String getRandomDeterminer()
    {
     Random random = new Random();
     int selectDeterminer = random.nextInt(determinerList.length);
     return determinerList[selectDeterminer];
    }
    
    public String getRandomAdjective()
    {
     Random random = new Random();
     int selectAdjective = random.nextInt(adjectiveList.length);
     return adjectiveList[selectAdjective];
    }
    
    public String getNounPhrase()
    {
        String noun = getRandomNoun();
        String adjective = getRandomAdjective();
        String determiner = getRandomDeterminer();
        String nounPhrase = determiner + " " + adjective + " " + noun;
        return nounPhrase;
    }
    
    public String getVerbPhrase()
    {
        String verb = getRandomVerb();
        String adverb = getRandomAdverb();
        String verbPhrase = adverb + " "+ verb;
        return verbPhrase;
    }
    
    public String getPrepositionalPhrase ()
    {
        String preposition = getRandomPrepositonal();
        String determiner = getRandomDeterminer();
        String adjective = getRandomAdjective();
        String noun = getRandomNoun();
        String prepositionalPhrase = preposition + " " + determiner + " " + adjective + " " + noun;
        return prepositionalPhrase;
    }
   
    public void loadSentences()
    {
        String sentence = getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionalPhrase ();
        System.out.print(sentence);
    }
}

