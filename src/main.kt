fun main()  {
    var x= indences(listOf("Bena","Elizabeth","liizil","nathan","mary","john","pretty","hillz","ingrid","dathan"))
   println(x)

   var h= height(listOf(12,5,9,10,50,3))
    println(h)

   var p = person("Beth",45,70.5,43)
    var f=person("Liz",19,60.9,40)
   sorts(listOf(p,f))

    var c=car("A34K",5.3)
    var a=car("BM7W",8.0)
    var r=car("A56FX",6.2)
   println(  all(listOf(c,a,r)))
}
fun indences(names:List<String>):List<String>{
    var nwlist= mutableListOf<String>()
    names.forEachIndexed { index, i ->
        if (index % 2== 0)
        nwlist.add(i)


    }
    return nwlist
}
fun height(heigh:List<Int>):String{
   var d= heigh.average()
    var c=heigh.sum()
    var p="average is$d Metres and the sum is $c Metres"
    return p

}
  data class person(var name:String, var age:Int, var height:Double,var weight:Int)
 fun sorts(people:List<person>){
     var sortedlst=people.sortedByDescending{y-> y.age }
   println(sortedlst)
 }
//fun similar(list: List<person>,one1:person,two2:person){

//}
data class car(var registration:String,var milage:Double )
   fun all(cars:List<car>):Double{
       var adds=0.0
       var num=cars.count()

     var o=  cars.forEach { cr->
         adds+=cr.milage
       }
       return adds/num
   }
