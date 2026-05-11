class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val mapS = mutableMapOf<Char,Int>()

        val mapT = mutableMapOf<Char,Int>()

        for(a in s){
            mapS[a] = (mapS[a] ?:0) + 1
        }

        for(a in t){
            mapT[a] = (mapT[a] ?:0) + 1
        }

        for(e in mapS.entries){
            if(e.value != mapT[e.key]){
                return false
            }
        }
        return true
    }
}
