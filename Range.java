import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
      start = this.start;
      end = this.end;
    }
  public void reset(){  }
  public int length(){  }
  public boolean hasNext(){
      if(start < end){
          return true;
      }return false;
    }

  //@throws NoSuchElementException
  public int next(){    }
  
}