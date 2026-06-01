class Solution {
    fun evalRPN(tokens: Array<String>): Int {

        val stack = ArrayDeque<Int>()

        for(s in tokens){

      

            if(s == "+"){

            val b = stack.removeLast()
            val a = stack.removeLast()

               stack.addLast(a+b) 

            }
            else if(s == "-"){
               val b = stack.removeLast()
               val a = stack.removeLast()

               stack.addLast(a-b) 


            }else if(s == "*"){
               val b = stack.removeLast()
            val a = stack.removeLast()

               stack.addLast(a*b) 

            }else if( s== "/"){

               val b = stack.removeLast()
              val a = stack.removeLast()

               stack.addLast(a/b) 


            }else{
                 stack.addLast(s.toInt()) 
            }

        }

      return stack.last()
    }
}
