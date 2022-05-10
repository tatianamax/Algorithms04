public class CountWords {
//    18.	Напишите алгоритм CountWords,
//    который принимает на вход текст и слово,
//    и считает все вариации этого слова в тексте:

    public int CountWordsMethod(String text,String word){
        int count = 0;
        for (int i=0; i < text.length(); i++){
            text = String.valueOf(text.contains(word));
            count ++;
        }
        return count;
    }
}
