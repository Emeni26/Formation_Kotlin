import com.mansri.news.*

//pour importer tous les classes dans le package com.mansri.news

fun main(args: Array<String>) {
    var userOp= UserOP()
    userOp.sum(10.6,12.9)
    userOp.sub(10.6,12.9)


    var adminop= AdminOp()
    adminop.sum(10.6,1.9)
    adminop.sub(10.6,1.9)

}