import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
      other = data;
      currentIndex = 0;
    }

    public void reset(){
        currentIndex = 0;
    }

    public int length(){
        return data.length;
    }

    public boolean hasNext(){
        return currentIndex <= data.length - 1;
    }

    public int next(){
        if(! hasNext()){
            throw new NoSuchElementException("There are no more integers stored after " + data[currentIndex]);
        }else{
            currentIndex ++;
            return data[currentIndex - 1];
        }
       
    }

    public ArraySequence(IntegerSequence otherseq){
        int[] other = new int[otherseq.length()];
        int i = 0;
        while(otherseq.hasNext()){
            other[i] = otherseq.next();
            i++;
        }
        other = data;
    }

    public static void main(String[] args) {
        int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    }
}