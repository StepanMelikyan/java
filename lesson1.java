

public class lesson1 {
    public static void main(String[] args)
    {
        // randomNumber();
        // bit();
        max();
        // min();
        
            
    }
    // 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
    
    public static int randomNumber() {
        int i = (int) (Math.random()*(2000+1)) - 1000;
        return i;
    }
     // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

     // я не понял как решить данную задачу, поэтму за номер старшего значащего бита числа я взял 6.
    public static int bit() {
        int n = 9;
        return n;
    }
    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static void max() {
        int i = 1;
        int j = 0;
        int count = 0;
        int x = Short.MAX_VALUE / 9;
        int [] m1 = new int[x];
        while (i < Short.MAX_VALUE){
            if (i % bit() == 0){
                m1[j] = i;
                j++;
                count++;
            }
            i++;
        }  
    }  
    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static void min() {
        int i = 1;
        int j = 0;
        int x = Short.MIN_VALUE / 9;
        int [] m2 = new int[x];
        while (i < Short.MAX_VALUE){
            if (i % bit() != 0){
                m2[j] = i;
                j++;
            }
            i++;
        }   
    
    }    
}

    
        
        

    





