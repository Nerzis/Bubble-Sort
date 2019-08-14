fun sortArray(nums: IntArray) : IntArray {
      var  b: Boolean = true
    var tempElement: Int = 0
    var i: Int = 0
    var k: Int = 1

    println(nums.joinToString())

    if (nums.size == 1) return nums

    while (b) {
        k = 1
        for (i in 0..nums.size - 2) {
            println("index i = $i, element i = ${nums[i]}, index k = $k element k = ${nums[k]}")
            if (nums[i] > nums[k]) {
                tempElement = nums[i]
                println("меняем! temp_element = $tempElement на ${nums[k]}")
                nums[i] = nums[k]
                nums[k] = tempElement
                println(nums.joinToString())
            } else println("ничего не меняем")
            k++
        }

    k =1
    for (i in 0..nums.size-2) {
        if (nums[i] <= nums[k]) b = false
        else {
            b = true
            println("сортировка не закончена. Заново!")
            break
        }
        k++
        println("результат проверки массива = $b")
    }
    }
    return (nums)
}

fun main(){

    println(sortArray(intArrayOf(2, 4, 5)))
}