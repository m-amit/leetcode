public class LeetCode_344 {
  public static void main(String[] args) {

  }

  public void reverseString(char[] s) {
    int pointerA = 0;
    int pointerB = s.length-1;
    while(pointerA < s.length/2){
      char first = s[pointerA];
      s[pointerA] = s[pointerB];
      s[pointerB] = first;
      pointerA++;
      pointerB--;
    }
  }
}
