
class Node(
    var key: Int,
    var value: Int,
    var next: Node? = null,
    var prev: Node? = null
)


class LRUCache(capacity: Int) {

    private val capacity = capacity

    private val map = mutableMapOf<Int, Node>()

    private var left = Node(0,0)

    private var right = Node(0,0)


    init{
        left.next = right
        right.prev
    }


    private fun insert(node: Node){

     val next = left.next

     left.next = node

     node.next = next

     node?.prev = left

     next?.prev = node
      
    }

    private fun remove(node: Node){

        val prev = node.prev
        val next = node.next

        prev?.next = next
        next?.prev = prev
    }



    fun get(key: Int): Int {

        if(!map.containsKey(key)){
            return -1
        }

        val node = map[key]!!

        remove(node)
        insert(node)

        return node.value

    }

    fun put(key: Int, value: Int) {

      if(map.containsKey(key)){
           
           remove(map[key]!!)

        }

        val node = Node(key,value)

        map[key] = node

        insert(node)


        if(map.size > capacity){

            val lru = right.prev!!

            remove(lru)

            map.remove(lru.key)

        }



    }
}
