package array;

public class practice {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
    
    return -1;
}
public static void main (String args[]){
    int numbers[]={3,6,2,4,8,62,1,7};
    int key=1;
    int index= linearSearch(numbers,key);
    if(index== -1){
        System.out.println("no key exist");
    } else{
        System.out.println("ket found at index :" + index);
    }
}
}
