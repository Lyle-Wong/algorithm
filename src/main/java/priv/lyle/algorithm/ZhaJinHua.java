package priv.lyle.algorithm;

/**
 * 题目描述


 两个搜狐的程序员加了一个月班，终于放假了，于是他们决定扎金花渡过愉快的假期 。


 游戏规则：


 共52张普通牌，牌面为2,3,4,5,6,7,8,9,10,J,Q,K,A之一，大小递增，各四张； 每人抓三张牌。两人比较手中三张牌大小，大的人获胜。


 对于牌型的规则如下：

 1.三张牌一样即为豹子

 2.三张牌相连为顺子（A23不算顺子）

 3.有且仅有两张牌一样为对子 豹子>顺子>对子>普通牌型 在牌型一样时，比较牌型数值大小（如AAA>KKK,QAK>534，QQ2>10104） 在二人均无特殊牌型时，依次比较三张牌中最大的。大的人获胜，如果最大的牌一样，则比较第二大，以此类推（如37K>89Q） 如二人牌面相同，则为平局。


 输入描述:


 输入两个字符串代表两个玩家的牌（如”10KQ” “354”），先输入的作为玩家1，后输入的作为玩家2


 输出描述:


 1 代表 玩家1赢 0 代表 平局 -1 代表 玩家2赢 -2 代表不合法的输入


 输入例子:


 KQ3 3Q9

 10QA 6102

 5810 7KK

 632 74J

 10102 K77

 JKJ 926

 68K 27A


 输出例子:


 1

 1

 -1

 -1

 1

 1

 -1
 */
public class ZhaJinHua {

}
