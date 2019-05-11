/**
 * Created with 徐立.
 *
 * @author 徐立
 * @date 2019-05-11
 * @time 23:09
 * To change this template use File | Settings | File Templates.
 */
fun testNullSafeOperator(s: String?) {
    System.out.println(s?.toCharArray()?.getOrNull(10)?.hashCode())
}

fun main(args: Array<String>) {
//    防止空指针
    testNullSafeOperator(null)
    testNullSafeOperator("12345678901")
    testNullSafeOperator("123")
}

