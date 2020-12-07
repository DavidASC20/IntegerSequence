import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
      other = data;
    }

    public void reset(){
        currentIndex = 0;
    }

    public int length(){
        return data.length;
    }

    public boolean hasNext(){
        if(currentIndex >= data.length - 1){
          return false;
        }return true;
    }

    public int next(){
        if(! hasNext()){
            throw new NoSuchElementException("There are no more integers stored after " + data[currentIndex]);
        }
        currentIndex ++;
        return data[currentIndex - 1];
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
}