fun main(){
	var n = 1 .. 9999  //定义变量n为1~9999的全体实数
	var r = 0  //定义基础开始位:0
	for(num in n){ //提取出n中的数字
		r = r+num //加在一起
	}
	println(r) //输出数字
	
	//.revsrsed是反项=>100~1(用在var里)
	//step n 给出第一个数后跨过n-1个数在输出(用在for里)
}