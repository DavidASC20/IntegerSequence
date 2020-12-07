import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    if(start > end){
      throw new IllegalArgumentException("cant do that");
    }
      this.start = start;
      this.end = end;
      current = start;
    }
  public void reset(){
      current = start;
    }
  public int length(){
      return end-start + 1 ;
    }
  public boolean hasNext(){
    return current <= end;
  //@throws NoSuchElementException
  }
  public int next(){ 
    if(! hasNext()){
      throw new NoSuchElementException("There is no number above " + current + ".");
    }
      current++;
      return current -1;
     }

     public static void main(String[] args) {
      IntegerSequence r = new Range(10,15);
      while(r.hasNext()){
        System.out.print(r.next());
        if( r.hasNext() ){       
           System.out.print( ", " );
        }
      }
      System.out.println();
     }
}