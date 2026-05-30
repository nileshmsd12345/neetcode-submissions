class MinStack() {
    
    // Using ArrayDeque as a LIFO Stack
    private val stack = ArrayDeque<Int>()
    private val minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.addLast(`val`)
        
        // If minStack isn't empty, compare new value with the CURRENT minimum (which is at the last position)
        if (!minStack.isEmpty()) {
            minStack.addLast(minOf(`val`, minStack.last()))
        } else {
            minStack.addLast(`val`)
        }
    }

    fun pop() {
        if (!stack.isEmpty()) {
            stack.removeLast()
            minStack.removeLast()
        }
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}