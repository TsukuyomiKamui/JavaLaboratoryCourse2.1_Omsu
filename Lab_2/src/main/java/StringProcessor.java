public class StringProcessor {

    //Повторение строки
    public String repeatString(String s, int N){

        if(N<0){
            throw new IllegalArgumentException("Количество строк не может быть отрицательным");
        }
        String repeatS = "";
        for(int i = 0; i < N; i++){
            repeatS = repeatS + s;
        }
        return repeatS;
    }

    //Подсчёт количества вхождений
    public int countOccurrences(String str, String str_2){

        if( str_2 == null ||str_2.isEmpty()  ){
            throw new IllegalArgumentException("Вторая строка не может быть пустой или null");
        }

         int count =0;
        String[] strToWord = str_2.split(" ");

        for(int i = 0; i < strToWord.length; i++){
            if(str.equals(strToWord[i])){
                count++;
            }
        }
        return count;
    }

    //Замена символов
     public String replaceSymbol(String str) {

         return str.replace("1", "один")
                 .replace("2", "два")
                 .replace("3", "три");
     }

     //Удаление второго символа
     public void removeEverySecondChar(StringBuilder sb) {
         for (int i = 1; i < sb.length(); i++) {
             sb.deleteCharAt(i);

         }
     }
}
