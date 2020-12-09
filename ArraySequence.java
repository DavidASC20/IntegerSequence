import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
      data = new int[other.length];
      for(int i = 0; i < other.length; i++){
      data[i] = other[i];
      }
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
            throw new NoSuchElementException("You cannot travel further through this IntegerSequence");
        }else{currentIndex ++;
            return data[currentIndex - 1];
        }
    }

    public ArraySequence(IntegerSequence otherseq){
        otherseq.reset();
        int[] other = new int[otherseq.length()];
        for(int i = 0; i < otherseq.length(); i++){
            other[i] = otherseq.next();
        }
        other = data;
        otherseq.reset();
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