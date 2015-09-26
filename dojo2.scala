object funcional {

	def main(arg: Array[String])  {

		//println(suma2(2,2))
		var lista= List(1,2,3)
		lista.map((x:Int) => println(x+4))
		
	}

	def suma(x:Int,y:Int)=x+y
	val suma2=(x:Int,y:Int)=>x+y

	
}