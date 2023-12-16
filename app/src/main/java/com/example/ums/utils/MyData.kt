package com.example.ums.utils

import com.example.ums.model.MyUms

object MyData {
    lateinit var tarifList: ArrayList<MyUms>
    lateinit var daqiqaList: ArrayList<MyUms>
    lateinit var internetList: ArrayList<MyUms>
    lateinit var xizmatList: ArrayList<MyUms>
    lateinit var smsList: ArrayList<MyUms>

    fun addUms(){
        tarifList = ArrayList()
        tarifList.add(MyUms("mobie 20","yaxshi tarif reja","*111*793#"))
        tarifList.add(MyUms("mobie 21","yaxshi tarif reja","*111*794#"))
        tarifList.add(MyUms("mobie 22","yaxshi tarif reja","*111*795#"))
        tarifList.add(MyUms("mobie 23","yaxshi tarif reja","*111*796#"))

        daqiqaList = ArrayList()
        daqiqaList.add(MyUms("Daqiqa 60", "1000 So'm", "*110*160#"))
        daqiqaList.add(MyUms("Daqiqa 160", "12000 So'm", "*110*61#"))
        daqiqaList.add(MyUms("Daqiqa 260", "70000 So'm", "*110*62#"))
        daqiqaList.add(MyUms("Daqiqa 360", "90000 So'm", "*110*63#"))

        internetList = ArrayList()
        internetList.add(MyUms("100 MB","so'm","*110*120#"))
        internetList.add(MyUms("1000 MB","so'm","*110*120#"))
        internetList.add(MyUms("10000 MB","so'm","*110*120#"))
        internetList.add(MyUms("100000 MB","so'm","*110*120#"))

        xizmatList = ArrayList()
        xizmatList.add(MyUms("Qayta qo'ng'iroq","telefon o'chiq bo'lganda","*303*123#"))
        xizmatList.add(MyUms("Qayta qo'ng'iroq","telefon o'chiq bo'lganda","*303*123#"))
        xizmatList.add(MyUms("Qayta qo'ng'iroq","telefon o'chiq bo'lganda","*303*123#"))
        xizmatList.add(MyUms("Qayta qong'iroq","telefon o'chiq bo'lganda","*303*123#"))

        smsList = ArrayList()
        smsList.add(MyUms("sms 30", "1300 s'om","*130*30*1#"))
        smsList.add(MyUms("sms 30", "1300 s'om","*130*30*1#"))
        smsList.add(MyUms("sms 30", "1300 s'om","*130*30*1#"))
        smsList.add(MyUms("sms 30", "1300 s'om","*130*30*1#"))
    }

}