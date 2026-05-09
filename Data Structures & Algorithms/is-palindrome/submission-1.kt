class Solution {
    fun isPalindrome(s: String): Boolean {
      val str = s.filter { it.isLetter() || it.isDigit() }.lowercase()
      if(str.isEmpty()){
        return true
      }
      var i =0;
      var j= str.length-1;

      while(j>i){
        if(str[i]!=str[j]){
          return false
        }
         i++;
         j--;
      }
    return true
    }
}
