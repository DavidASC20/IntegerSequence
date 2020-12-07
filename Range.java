import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
      start = this.start;
      end = this.end;
    }
  public void reset(){
      current = 10;
    }
  public int length(){
      return end - start;
    }
  public boolean hasNext(){
    
  //@throws NoSuchElementException
  }
  public int next(){ 
      current++;
      return current -1;
     }
}