package Checkpoint2;

import java.util.*;

class WordSet{
    private final TreeSet<String> words = new TreeSet<>();
    public WordSet(String text){
        StringTokenizer tokens = new StringTokenizer(text.toLowerCase(Locale.ROOT));
        while (tokens.hasMoreTokens()){
            words.add(tokens.nextToken());
        }
    }
    public WordSet union(WordSet other){
        WordSet result = new WordSet("");
        result.words.addAll(words);
        result.words.addAll(other.words);
        return result;
    }
    public WordSet intersection(WordSet other){
        WordSet result = new WordSet("");
        result.words.addAll(words);
        result.words.retainAll(other.words);
        return result;
    }
    @Override
    public String toString(){
        return String.join(" ", words);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
