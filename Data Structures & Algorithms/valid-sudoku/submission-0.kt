class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        val col = Array(9){
            mutableSetOf<Char>()
        }

         val row = Array(9){
            mutableSetOf<Char>()
        }
          val box = Array(9){
            mutableSetOf<Char>()
        }


          for(i in 0 until 9){
            for(j in 0 until 9){

            val v = board[i][j]

            if(v == '.') continue

            val boxIndex = (i/3)*3 + (j/3)

            if(col[i].contains(v)||row[j].contains(v)|| box[boxIndex].contains(v)){
                return false
            }

            col[i].add(v)
             row[j].add(v)
             box[boxIndex].add(v)


            }
          }

          return true

    }
}
